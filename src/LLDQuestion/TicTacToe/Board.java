package LLDQuestion.TicTacToe;
import java.util.*;
import java.util.AbstractMap.SimpleEntry;



public class Board {
    public int size;
    public PlayingPiece [][] board;

    Board(int size){
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int row,int col, PlayingPiece piece){
        if(board[row][col] != null){
            return false;
        }
        board[row][col] = piece;
        return true;
    }

    public void printFreeCells(){

        //Iterated the board and printed freecells 
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(board[i][j]!= null){
                    System.out.print(board[i][j].type+ " ");
                }else{
                    System.out.print(" ");
                }
                 System.out.print("|");
            }
            System.out.println();
        }
        
    }

    public List<SimpleEntry<Integer,Integer>> getFreeCells(){
        List<SimpleEntry<Integer,Integer>> freeCells = new ArrayList<>();
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(board[i][j] == null){
                    SimpleEntry<Integer,Integer> rowColumn= new SimpleEntry<>(i,j);  
                    freeCells.add(rowColumn);
                    System.out.println("i: "+ i +"j: "+j);
                }
            }
        }
        return freeCells;
    }

}
