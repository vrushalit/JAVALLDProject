package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlertObserver;

public interface StocksObservable {

    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void notifySubscriber();
    public void setStockCount(int newStockCount);
    public int getStockCount();
}
