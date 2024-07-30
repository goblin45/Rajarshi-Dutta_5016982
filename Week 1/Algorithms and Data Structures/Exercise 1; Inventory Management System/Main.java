import java.util.*; // for List, ArrayList, Map and HashMap

class Product {
    protected int productId, price, quantity;
    protected String productName;
    // the quantity of each product is in the inventory class.

    public Product(int productId, String productName, int price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public void updateProductName(String productName) {
        this.productName = productName; // complexity O(1)
    }
    public void updatePrice(int price) {
        this.price = price; // complexity O(1)
    }
    public void updateQuantity(int quantity) {
        this.quantity = quantity;   // complexity O(1)
    }
}

class Inventory {
    private Map<Integer, Product> idToP; // key: product id, value: product

    public Inventory() {
        this.idToP = new HashMap<>();
    }

    public void addProduct(Product p) {
        if (!this.idToP.containsKey(p.productId)) {
            this.idToP.put(p.productId, p);
        }
        
        System.out.println("Product added successfully!");
    }

    public void updateProduct(int productId, String productName, int price, int quantity) {
        if (!this.idToP.containsKey(productId)) {
            System.out.println("Product does not exist!");
            return;
        }
        
        if (productName != null) {  
            this.idToP.get(productId).updateProductName(productName);
        }   

        if (price >= 0) {
            this.idToP.get(productId).updatePrice(price);
        }

        if (quantity >= 0) {
            this.idToP.get(productId).updateQuantity(quantity);
        }

        System.out.println("Product updated successfully!");
    }

    public void deleteProduct(int productId) {
        if (!idToP.containsKey(productId)) {
            System.out.println("Product does not exist!");
            return;
        }
        idToP.remove(productId);
        System.out.println("Product removed successfully!");
    }

    public void showAllProducts() {
        System.out.println("Current products in the inventory: ");
        // tabular form
        // System.out.println("Product id | Product name | Product price | Quantity");
        
        for (Map.Entry<Integer, Product> item : this.idToP.entrySet()) {
            System.out.println("----------------------------------------------------");
            int productId = item.getKey();
            Product p = item.getValue();
            
            System.out.println("Product id: " + productId);
            System.out.println("Product name: " + p.productName);
            System.out.println("Product price: " + p.price);
            System.out.println("Quantity: " + p.quantity + "\n");
        }
    }
}

class Main {
    public static void main(String[] args) {    
        Inventory i = new Inventory();
        Product p1 = new Product(1, "Apple", 100, 10);
        Product p2 = new Product(2, "Banana", 200, 20);
        i.addProduct(p1);
        i.addProduct(p2);

        i.updateProduct(1, "Apple2", -1, -1);

        i.showAllProducts();
    }
}   

/*

Output: 

Product added successfully!
Product added successfully!
Product updated successfully!
Current products in the inventory: 
----------------------------------------------------
Product id: 1
Product name: Apple2
Product price: 100
Quantity: 10

----------------------------------------------------
Product id: 2
Product name: Banana
Product price: 200
Quantity: 20

*/