package src.designPattern.decoratorPattern;

import src.designPattern.decoratorPattern.base.FarmhousePizza;
import src.designPattern.decoratorPattern.base.MargerittaPizza;
import src.designPattern.decoratorPattern.feature.ExtraChessToppling;
import src.designPattern.decoratorPattern.feature.PaneerToppling;
import src.designPattern.decoratorPattern.feature.Topplings;

public class DecoratorMain {
    public static void main(String[] args) {

        Topplings paneerTopplings = new PaneerToppling(new FarmhousePizza());
        Topplings extraChessToppling = new ExtraChessToppling(new MargerittaPizza());

        System.out.println("Farmhouse pizza with paneer toppling cost: "+ paneerTopplings.cost());
        System.out.println("Margeritta pizza with extra cheez toppling cost: "+ extraChessToppling.cost());
    }
}
