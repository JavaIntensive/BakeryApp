import java.util.ArrayList;

public class Product {
    private String name;
    private double price;
    private String expDate;
    private String dietRestrict;
    private int quantity;
    //private ArrayList<Product> products ;

    public Product(String name, double price, String expDate, String dietRestrict, int quantity) {
        this.name = name;
        this.price = price;
        this.expDate = expDate;
        this.dietRestrict = dietRestrict;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getDietRestrict() {
        return dietRestrict;
    }

    public void setDietRestrict(String dietRestrict) {
        this.dietRestrict = dietRestrict;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
