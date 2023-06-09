package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

public abstract class Actor implements iActorBehaviour, iReturnOrder {
    protected String name;  // имя покупателя
    protected boolean isTakeOrder;  // принять заказ
    protected boolean isMakeOrder; // сделать заказ
    protected boolean isReturnOrder = true; // возврат заказа

    public Actor(String name) {
        this.name = name;
    }
    abstract public String getName();

}
