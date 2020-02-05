import java.util.ArrayList;
import java.util.Scanner;

public class ProductApp {
    public static void main(String[] args) {

        ArrayList<Product> products;
        Scanner sc = new Scanner(System.in);

        System.out.print("To search for foods that you can eat, please enter your diet restriction(s): ");
        String userInput = sc.nextLine();

        ProductDB db = new ProductDB();
        products = db.getDbList(userInput);
       // Collections.sort(products);

        for (Product product: products) {
            System.out.println("name: " + product.getName() +" price: " + product.getPrice() + " Exp date: "
                       + product.getExpDate() + " diet restriction: " + product.getDietRestrict()
                        + " quantity: " + product.getQuantity());

        }
//
//        String rest = "lactose fat ";
//        System.out.println(rest.contains("lactose"));// true
//        String[] result = rest.split(" ");
//        System.out.println(result[1]);
//
//        System.out.println(rest.contains("lactose fat skin"));
    }
}
