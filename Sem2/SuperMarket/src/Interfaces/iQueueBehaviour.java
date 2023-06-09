package Interfaces;

import Classes.Actor;

public interface iQueueBehaviour {
    void takeInQueue(iActorBehaviour actor);  // занять очередь
    void releaseFromQueue();                  // реализуем очередь
    void takeOrder();                         // принять заказ
    void giveOrder();                         // отдать заказ
}
