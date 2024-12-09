package src.designPattern.observerPattern.observable;

import src.designPattern.observerPattern.observer.NotificationObserver;

public interface StockObservable {

    public void addSubscriber(NotificationObserver notificationObserver);
    public void remove(NotificationObserver notificationObserver);
    public void notifyAllSubscriber();
    public void setStock(int count);
}
