import java.util.ArrayList;

public class ProductDB {
    private ArrayList<Product> dbList;

    public  ProductDB() {
        dbList= new ArrayList<>();

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

    }

    public ArrayList<Product> getDbList(String userPreference) {
        ArrayList<Product> result = new ArrayList<>();

        for (Product p : dbList) {
            if (!p.getDietRestrict().contains(userPreference)) {
                result.add(p);

            }
        }
        return result;

    }
}


