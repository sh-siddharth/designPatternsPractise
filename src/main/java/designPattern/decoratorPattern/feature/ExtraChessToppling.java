package designPattern.decoratorPattern.feature;

import designPattern.decoratorPattern.base.BasePizza;

public class ExtraChessToppling extends Topplings{

    BasePizza basePizza;

    public ExtraChessToppling(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost()+20;
    }
}
