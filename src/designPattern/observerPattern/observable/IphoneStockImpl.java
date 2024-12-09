package src.designPattern.observerPattern.observable;

import src.designPattern.observerPattern.observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockImpl implements StockObservable{

    List<NotificationObserver> observerList = new ArrayList<>();
    int stockCount = 0;

    @Override
    public void addSubscriber(NotificationObserver notificationObserver) {
        observerList.add(notificationObserver);
    }

    @Override
    public void remove(NotificationObserver notificationObserver) {
        observerList.remove(notificationObserver);
    }

    @Override
    public void notifyAllSubscriber() {
        for(NotificationObserver obj : observerList) {
            obj.update();
        }
    }

    @Override
    public void setStock(int stock) {
        if(stockCount == 0){
          notifyAllSubscriber();
        }
        stockCount += stock;
    }
}
