import java.util.*; // for List and ArrayList

class Product {
    protected int productId;
    protected String productName, category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
}

class Search {
    public Product linearSearchById(List<Product> products, int productId) { // complexity O(n)
        for (int i = 0; i < products.size(); i++) { 
            if (products.get(i).productId == productId) {
                return products.get(i);
            }
        }
        return null;
    }

    public Product linearSearchByName(List<Product> products, String productName) { // complexity O(n)
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).productName.equals(productName)) {
                return products.get(i);
            }
        }
        return null;
    }

    public Product linearSearchByCategory(List<Product> products, String category) {    // complexity O(n)
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).category.equals(category)) {
                return products.get(i);
            }
        }    
        return null;
    }

    public Product binarySearchById(List<Product> products, int productId) {  // complexity O(log(n))
        int low = 0;
        int high = products.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (products.get(mid).productId == productId) {
                return products.get(mid);
            } else if (products.get(mid).productId < productId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }

    public Product binarySearchByName(List<Product> products, String productName) { // complexity O(log(n))
        int low = 0;
        int high = products.size() - 1; 
        while (low <= high) {
            int mid = (low + high) / 2;
            if (products.get(mid).productName.equals(productName)) {
                return products.get(mid);   
            } else if (products.get(mid).productName.compareTo(productName) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }   
        return null;
    }

    public Product binarySearchByCategory(List<Product> products, String category) { // complexity O(log(n))
        int low = 0;
        int high = products.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (products.get(mid).category.equals(category)) {
                return products.get(mid);
            } else if (products.get(mid).category.compareTo(category) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }   
        return null;
    }
}

class Main {
    
    // insert 5 products in an array 
    private static void insertProducts(List<Product> products) {
        products.add(new Product(0, "Apple", "Fruits")); 
        products.add(new Product(2, "Banana", "Fruits"));
        products.add(new Product(3, "Orange", "Fruits"));
        products.add(new Product(4, "Mango", "Fruits"));
        products.add(new Product(5, "Pineapple", "Fruits"));
    }

    private static void printProduct(Product p) {
        if (p == null) {
            System.out.println("Product not found");
            return;
        } else {
            System.out.println("Product found:");
            System.out.println("Product Id: " + p.productId);
            System.out.println("Product Name: " + p.productName);
            System.out.println("Product Category: " + p.category);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        List<Product> products = new ArrayList<Product>();
        insertProducts(products);

        Search s = new Search();
        
        // linear search

        // search by id
        printProduct(s.linearSearchById(products, 3));

        // search by name
        printProduct(s.linearSearchByName(products, "Banana"));

        // search by category
        printProduct(s.linearSearchByCategory(products, "Fruits"));
        
        // binary search

        // search by id
        products.sort((p1, p2) -> p1.productId - p2.productId);
        printProduct(s.binarySearchById(products, 3));

        // search by name
        products.sort((p1, p2) -> p1.productName.compareTo(p2.productName));
        printProduct(s.binarySearchByName(products, "Banana"));

        // search by category
        products.sort((p1, p2) -> p1.category.compareTo(p2.category));
        printProduct(s.binarySearchByCategory(products, "Fruits"));

    }
}

/* 

Output: 

 Product found:
Product Id: 3
Product Name: Orange
Product Category: Fruits

Product found:
Product Id: 2
Product Name: Banana
Product Category: Fruits

Product found:
Product Id: 0
Product Name: Apple
Product Category: Fruits

Product found:
Product Id: 3
Product Name: Orange
Product Category: Fruits

Product found:
Product Id: 2
Product Name: Banana
Product Category: Fruits

Product found:
Product Id: 4
Product Name: Mango
Product Category: Fruits

*/