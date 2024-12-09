package src.designPattern.observerPattern.observer;

import src.designPattern.observerPattern.observable.StockObservable;

public class MessageNotificationImpl implements NotificationObserver{

    String name;
    StockObservable stockObservable;

    public MessageNotificationImpl(String name, StockObservable stockObservable){
        this.name = name;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendMessage(name, "text is send to ");
    }

    private void sendMessage(String name, String text_is_send) {
        System.out.println(text_is_send+ name);
    }
}
