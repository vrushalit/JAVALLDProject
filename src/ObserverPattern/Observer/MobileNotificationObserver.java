package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class MobileNotificationObserver implements NotificationAlertObserver {
    String userName;
    StocksObservable observable;

    public MobileNotificationObserver(String userName, StocksObservable observable){
        this.userName = userName;
        this.observable = observable;
    }

    @Override
    public void update(){
        sendNotification(userName, "Product in stock, Hurry Up");
    }

    private void sendNotification(String userName, String message){
        System.out.println("notification sent to "+userName);
    }

}
