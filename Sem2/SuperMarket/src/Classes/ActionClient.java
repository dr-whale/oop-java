package Classes;

public class ActionClient extends Actor {
     private int idAction;
     private String nameAction;
     private static int count;

     public ActionClient(String name,int idAction, String nameAction) {
          super(name);
          this.idAction = idAction;
          this.nameAction = nameAction;
          count++;
     }
     public ActionClient(String name) {
          super(name);
     }
     @Override
     public String getName() {
          return super.name;
     }
     public boolean isMakeOrder(){
          return super.isMakeOrder;
     }
     public boolean isTakeOrder(){
          return super.isTakeOrder;
     }

     @Override
     public boolean isReturnOrder() { // возврат товара
          return super.isReturnOrder;
     }

     @Override
     public void setReturnOrder(boolean returnOrder) { // установить причину возврата заказа
          super.isReturnOrder = returnOrder;
     }

     public void setMakeOrder(boolean makeOrder){ // установить заказ
          super.isMakeOrder = makeOrder;
     }
     public void setTakeOrder(boolean pikUpOrder){ // установить порядок приема
          super.isMakeOrder = pikUpOrder;
     }

     public Actor getActor(){
          return this;
     }

     @Override
     public void returnOrder() {
     }

     @Override
     public void getReturnOrder() {
     }
    
}
