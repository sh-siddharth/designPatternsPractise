package src.designPattern.observerPattern.observer;

import src.designPattern.observerPattern.observable.StockObservable;

public class EmailNotificationImpl implements NotificationObserver{
    String emailId;
    StockObservable stockObservable;

    public EmailNotificationImpl(String emailId, StockObservable stockObservable){
        this.emailId = emailId;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendMessage(emailId, "Iphone is available.");
    }

    private void sendMessage(String emailId, String msg) {
        System.out.println("Email is send to emailId: "+ emailId);
    }
}
