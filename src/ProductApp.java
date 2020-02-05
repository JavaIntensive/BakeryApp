import java.util.ArrayList;
import java.util.Scanner;

public class ProductApp {
    public static void main(String[] args) {

        ArrayList<Product> products;
        Scanner sc = new Scanner(System.in);

        System.out.print("To search for foods that you can eat, please enter your diet restriction(s): ");
        String userInput = sc.nextLine();

        ProductDB db = new ProductDB();
        db.setDbList(initiate());
        products = getDbList(userInput,initiate());
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
    public static ArrayList<Product> initiate(){
        ArrayList<Product> dbList = new ArrayList<>();

        dbList.add(new Product("rice", 2.00, "02/10/2020", "gluten lactose", 1));
        dbList.add(new Product("fish", 4.00, "02/10/2020", "fish fat", 2));
        dbList.add(new Product("milk", 5.00, "02/20/2020", "lactose", 3));
        dbList.add(new Product("pasta", 10.00, "02/12/2020", "", 4));
        dbList.add(new Product("fries", 5.00, "02/05/2020", "gluten", 5));
        dbList.add(new Product("potato", 6.00, "02/07/2020", "gluten", 6));
        dbList.add(new Product("salsa", 7.00, "02/03/2020", "", 7));
        dbList.add(new Product("turkey", 8.99, "02/25/2020", "", 8));
        dbList.add(new Product("wrap", 9.00, "02/24/2020", "", 9));
        dbList.add(new Product("fruit", 40.00, "02/16/2020", "", 10));
        dbList.add(new Product("bread", 3.00, "02/10/2020", "", 11));
        dbList.add(new Product("burger", 6.00, "02/07/2020", "", 12));
        dbList.add(new Product("sushi", 7.99, "02/08/2020", "", 13));
        dbList.add(new Product("pizza", 8.50, "02/20/2020", "", 14));
        dbList.add(new Product("ice cream", 9.00, "02/09/2020", "", 15));
        return dbList;
    }
    public static ArrayList<Product> getDbList(String userPreference,ArrayList<Product> arrayList) {
        ArrayList<Product> result = new ArrayList<>();
       /* for (Product p : dbList) {
            if (!p.getDietRestrict().contains(userPreference)) {
                result.add(p);
            }
        }*/
        // step 1. need to convert userPreference to string array using split
        boolean isfound = false;
        // String[] userInput

        for (Product p: arrayList) {
            // step 2. for each value above look into the dblist for each product
            for (String user : userPreference.split(" ")) { // guletin fish
                System.out.println("user: " + user );
                for (String res : p.getDietRestrict().split(" ")) { //fat fish
                    System.out.println("res: " + res);
                    if (user.equalsIgnoreCase(res)) {
                        System.out.println("we are in the user equals res.");
                        isfound = true;
                        break;
                        //  result.remove(i);
                    }
                }
                if (isfound) {
                    result.add(p);
                }
                //reiniatite isfound as flase or will stay true the entire time
                isfound = false;
            }
        }
        for (Product p : result){
            System.out.println(p.getDietRestrict() + p.getName());
        }
        for(Product p : result){
            if (arrayList.contains(p)){
                arrayList.remove(p);
            }
        }

        return arrayList;

    }
}
