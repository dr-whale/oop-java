package Domen;

public class HotDrink extends Product {
    private int temperature; // температура напитка

    public HotDrink(int productId, String productName, String productCategory, double price, int temperature) throws Exception {
        super(productId, productName, productCategory, price);
        this.temperature = temperature;
    }

    public int getVolume() {
        return temperature;
    }

    public void setVolume(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString()
    {
        return "Product{" +
        "name='" + super.getProductName() + '\'' +
        "category='" + super.getProductCategory() + '\'' +
        ", cost=" + super.getPrice() +
        ", temperature=" + temperature +
        '}';
    }

    
}
