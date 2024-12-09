package src.designPattern.observerPattern;

import src.designPattern.observerPattern.observable.IphoneStockImpl;
import src.designPattern.observerPattern.observable.StockObservable;
import src.designPattern.observerPattern.observer.EmailNotificationImpl;
import src.designPattern.observerPattern.observer.MessageNotificationImpl;
import src.designPattern.observerPattern.observer.NotificationObserver;

public class ObserverPatternMain {
    public static void main(String[] args) {

        StockObservable so = new IphoneStockImpl();

        NotificationObserver obs1 = new EmailNotificationImpl("abc@gmail.com", new IphoneStockImpl());
        NotificationObserver obs2 = new EmailNotificationImpl("xyz@gmail.com", new IphoneStockImpl());
        NotificationObserver obs3 = new MessageNotificationImpl("sidd", new IphoneStockImpl());

        so.addSubscriber(obs1);
        so.addSubscriber(obs2);
        so.addSubscriber(obs3);

        so.setStock(10);

    }
}
