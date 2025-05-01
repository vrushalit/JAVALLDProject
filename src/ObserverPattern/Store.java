package ObserverPattern;

import ObserverPattern.Observable.IphoneObservable;
import ObserverPattern.Observable.StocksObservable;
import ObserverPattern.Observer.EmailNotificationObserver;
import ObserverPattern.Observer.MobileNotificationObserver;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String args[]){
        StocksObservable iphoneObservable = new IphoneObservable();

        NotificationAlertObserver emailNotificationObserver1 = new  EmailNotificationObserver("abc@gmail.com",iphoneObservable);     
        NotificationAlertObserver emailNotificationObserver2 = new  EmailNotificationObserver("xyz@gmail.com",iphoneObservable);   
        NotificationAlertObserver mobileNotificationObserver = new  MobileNotificationObserver("abc123",iphoneObservable);     

        iphoneObservable.add(emailNotificationObserver1);
        iphoneObservable.add(emailNotificationObserver2);
        iphoneObservable.add(mobileNotificationObserver);
        iphoneObservable.remove(mobileNotificationObserver);

        iphoneObservable.setStockCount(10);
        iphoneObservable.setStockCount(0);
        iphoneObservable.setStockCount(20);


    }
}
