package src.designPattern.decoratorPattern.feature;

import src.designPattern.decoratorPattern.base.BasePizza;

public class PaneerToppling extends Topplings{

    BasePizza basePizza;

    public PaneerToppling(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost()+50;
    }
}
