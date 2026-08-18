package designPattern.observerPattern.observable;

import designPattern.observerPattern.observer.NotificationObserver;

public interface StockObservable {

    public void addSubscriber(NotificationObserver notificationObserver);
    public void remove(NotificationObserver notificationObserver);
    public void notifyAllSubscriber();
    public void setStock(int count);
}
