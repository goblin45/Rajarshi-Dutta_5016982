class Order {
    protected int orderId, totalPrice;
    protected String customerName;

    public Order(int orderId, String customerName, int totalPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }
}

class Sort {
    // bubble sort by totalPrice
    void bubbleSort(Order[] orders) {
        int n = orders.length;
        boolean swapped;

        // traverse through all orders
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // last i elements are already sorted, so skip them
            for (int j = 0; j < n - i - 1; j++) {
                // swap if the element found is greater than the next element
                if (orders[j].totalPrice > orders[j + 1].totalPrice) {
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                    swapped = true;
                }
            }

            // if no two elements were swapped by inner loop, then the array is sorted already
            if (!swapped) {
                break;
            }
        }
    }

    // quick sort by totalPrice
    void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pivot = partition(orders, low, high);

            quickSort(orders, low, pivot - 1);
            quickSort(orders, pivot + 1, high);
        }
    }

    // partition method
    int partition(Order[] orders, int low, int high) {
        Order pivot = orders[high];
        int i = (low - 1); // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (orders[j].totalPrice <= pivot.totalPrice) {
                i++;

                // Swap orders[i] and orders[j]
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }

        // Swap orders[i+1] and orders[high] (or pivot)
        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;

        return i + 1;
    }
}

public class Main {
    // insert 5 orders
    public static void insertOrders(Order[] orders) {
        orders[0] = new Order(1, "John", 100);
        orders[1] = new Order(2, "Jane", 500);
        orders[2] = new Order(3, "Jim", 700);   
        orders[3] = new Order(4, "Jill", 200);
        orders[4] = new Order(5, "Jack", 400);
    }
    public static void printOrders(Order[] orders) {
        for (int i = 0; i < orders.length; i++) {
            System.out.println("Order ID: " + orders[i].orderId);
            System.out.println("Customer Name: " + orders[i].customerName);
            System.out.println("Total Price: " + orders[i].totalPrice);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Order[] orders = new Order[5];
        insertOrders(orders);

        Sort sort = new Sort();

        // bubble sort by totalPrice
        System.out.println("Bubble Sort by Total Price:");
        sort.bubbleSort(orders);
        printOrders(orders);

        // reset orders
        insertOrders(orders);

        // quick sort by totalPrice
        System.out.println("Quick Sort by Total Price:");
        sort.quickSort(orders, 0, orders.length - 1);
        printOrders(orders);
    }
}


/* 

Output: 

Bubble Sort by Total Price:
Order ID: 1
Customer Name: John
Total Price: 100

Order ID: 4
Customer Name: Jill
Total Price: 200

Order ID: 5
Customer Name: Jack
Total Price: 400

Order ID: 2
Customer Name: Jane
Total Price: 500

Order ID: 3
Customer Name: Jim
Total Price: 700

Quick Sort by Total Price:
Order ID: 1
Customer Name: John
Total Price: 100

Order ID: 4
Customer Name: Jill
Total Price: 200

Order ID: 5
Customer Name: Jack
Total Price: 400

Order ID: 2
Customer Name: Jane
Total Price: 500

Order ID: 3
Customer Name: Jim
Total Price: 700

*/