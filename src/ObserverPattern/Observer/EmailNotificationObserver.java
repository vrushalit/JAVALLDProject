package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class EmailNotificationObserver implements NotificationAlertObserver{
    StocksObservable observable;
    String emailId;

    public EmailNotificationObserver(String emailId, StocksObservable observable){
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update(){
        sendMail(emailId, "product in stock, hurry up");
    }

    private void sendMail(String emailId, String msg){
        System.out.println("mail sent to "+emailId);
    }

}
