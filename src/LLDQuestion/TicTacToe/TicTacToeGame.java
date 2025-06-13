package LLDQuestion.TicTacToe;
import java.util.AbstractMap.SimpleEntry;
import java.util.*;

public class TicTacToeGame {
    Deque<Player> players = new ArrayDeque<>();
    Board gameBoard;

    TicTacToeGame(){
        initializeGame();
    }

    public void initializeGame(){
        PlayingPiece crossPiece = new PlayingPiece(PieceType.X);
        Player player1 = new Player("Player1",crossPiece);

        PlayingPiece noughtPiece = new PlayingPiece(PieceType.O);
        Player player2 = new Player("Player 2",noughtPiece);

        players.add(player1);
        players.add(player2);

        gameBoard = new Board(3);
    }

    public String startGame(){
        boolean noWinner = true;
        while(noWinner){
            Player currentPlayer = players.removeFirst();

            gameBoard.printFreeCells();
            List<SimpleEntry<Integer,Integer>> freeCells = gameBoard.getFreeCells();
            if(freeCells.isEmpty()){
                noWinner = false;
                System.out.println("winner: "+noWinner);
                continue;
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the row and col: ");
            String s = scanner.nextLine();
            String[] str = s.split(",");
            int row = Integer.valueOf(str[0]);
            int col = Integer.valueOf(str[1]);

            boolean pieceAdded = gameBoard.addPiece(row,col,currentPlayer.piece);
            if(!pieceAdded){
                System.out.println("Inserted at wrong position please insert again");
                players.addFirst(currentPlayer);
                continue;
            }
            players.addLast(currentPlayer);

           boolean winner = checkWinner(row,col,currentPlayer.piece.type);
           if(winner){
            return currentPlayer.name;
           }
           //scanner.close();

        }
        return "tie";
    }

    public boolean checkWinner(int row, int col, PieceType pieceType){
        for(int i=0;i<gameBoard.size;i++){
            if(gameBoard.board[row][i] == null || gameBoard.board[row][i].type!= pieceType){
                return false;
            }
        }
        for(int i=0;i<gameBoard.size;i++){
            if(gameBoard.board[i][col] == null || gameBoard.board[i][col].type!= pieceType){
                return false;
            }
        }
        for(int i=0;i<gameBoard.size;i++){
            if(gameBoard.board[i][i] == null ||gameBoard.board[i][i].type!= pieceType){
                return false;
            }
        }
        return true;
    }


}
