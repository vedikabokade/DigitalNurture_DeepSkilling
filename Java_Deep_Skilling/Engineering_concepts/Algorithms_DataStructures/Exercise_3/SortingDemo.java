public class SortingDemo {

    // Bubble Sort
    public static void bubbleSort(Order[] orders) {

        int n = orders.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (orders[j].totalPrice > orders[j + 1].totalPrice) {

                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;

                }
            }
        }
    }

    // Quick Sort
    public static void quickSort(Order[] orders, int low, int high) {

        if (low < high) {

            int pivotIndex = partition(orders, low, high);

            quickSort(orders, low, pivotIndex - 1);
            quickSort(orders, pivotIndex + 1, high);

        }
    }

    private static int partition(Order[] orders, int low, int high) {

        double pivot = orders[high].totalPrice;

        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (orders[j].totalPrice < pivot) {

                i++;

                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;

            }
        }

        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;

        return i + 1;
    }

    public static void displayOrders(Order[] orders) {

        for (Order order : orders) {
            System.out.println(order);
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Order[] orders1 = {

                new Order(101, "Vedika", 5600),
                new Order(102, "Rahul", 1200),
                new Order(103, "Sneha", 8400),
                new Order(104, "Amit", 3000),
                new Order(105, "Priya", 6500)

        };

        Order[] orders2 = {

                new Order(101, "Vedika", 5600),
                new Order(102, "Rahul", 1200),
                new Order(103, "Sneha", 8400),
                new Order(104, "Amit", 3000),
                new Order(105, "Priya", 6500)

        };

        System.out.println("Original Orders:");
        displayOrders(orders1);

        bubbleSort(orders1);

        System.out.println("After Bubble Sort:");
        displayOrders(orders1);

        quickSort(orders2, 0, orders2.length - 1);

        System.out.println("After Quick Sort:");
        displayOrders(orders2);
    }
}


// output
// Original Orders:
// Order ID: 101, Customer: Vedika, Total Price: ?5600.0
// Order ID: 102, Customer: Rahul, Total Price: ?1200.0
// Order ID: 103, Customer: Sneha, Total Price: ?8400.0
// Order ID: 104, Customer: Amit, Total Price: ?3000.0
// Order ID: 105, Customer: Priya, Total Price: ?6500.0

// After Bubble Sort:
// Order ID: 102, Customer: Rahul, Total Price: ?1200.0
// Order ID: 104, Customer: Amit, Total Price: ?3000.0
// Order ID: 101, Customer: Vedika, Total Price: ?5600.0
// Order ID: 105, Customer: Priya, Total Price: ?6500.0
// Order ID: 103, Customer: Sneha, Total Price: ?8400.0

// After Quick Sort:
// Order ID: 102, Customer: Rahul, Total Price: ?1200.0
// Order ID: 104, Customer: Amit, Total Price: ?3000.0
// Order ID: 101, Customer: Vedika, Total Price: ?5600.0
// Order ID: 105, Customer: Priya, Total Price: ?6500.0
// Order ID: 103, Customer: Sneha, Total Price: ?8400.0
