package designPattern.decoratorPattern;

import designPattern.decoratorPattern.base.FarmhousePizza;
import designPattern.decoratorPattern.base.MargerittaPizza;
import designPattern.decoratorPattern.feature.ExtraChessToppling;
import designPattern.decoratorPattern.feature.PaneerToppling;
import designPattern.decoratorPattern.feature.Topplings;

public class DecoratorMain {
    public static void main(String[] args) {

        Topplings paneerTopplings = new PaneerToppling(new FarmhousePizza());
        Topplings extraChessToppling = new ExtraChessToppling(new MargerittaPizza());

        System.out.println("Farmhouse pizza with paneer toppling cost: "+ paneerTopplings.cost());
        System.out.println("Margeritta pizza with extra cheez toppling cost: "+ extraChessToppling.cost());
    }
}
