public class SearchDemo {

    // Linear Search
    public static Product linearSearch(Product[] products, int targetId) {

        for (Product product : products) {

            if (product.productId == targetId) {
                return product;
            }

        }

        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, int targetId) {

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (products[mid].productId == targetId) {

                return products[mid];

            } else if (products[mid].productId < targetId) {

                left = mid + 1;

            } else {

                right = mid - 1;

            }

        }

        return null;
    }

    public static void main(String[] args) {

        // Array for Linear Search
        Product[] products = {

                new Product(105, "Laptop", "Electronics"),
                new Product(101, "Shoes", "Fashion"),
                new Product(109, "Watch", "Accessories"),
                new Product(103, "Mobile", "Electronics"),
                new Product(107, "Headphones", "Electronics")

        };

        // Sorted Array for Binary Search
        Product[] sortedProducts = {

                new Product(101, "Shoes", "Fashion"),
                new Product(103, "Mobile", "Electronics"),
                new Product(105, "Laptop", "Electronics"),
                new Product(107, "Headphones", "Electronics"),
                new Product(109, "Watch", "Accessories")

        };

        int searchId = 107;

        System.out.println("Linear Search:");

        Product result1 = linearSearch(products, searchId);

        if (result1 != null)
            System.out.println(result1);
        else
            System.out.println("Product Not Found");

        System.out.println();

        System.out.println("Binary Search:");

        Product result2 = binarySearch(sortedProducts, searchId);

        if (result2 != null)
            System.out.println(result2);
        else
            System.out.println("Product Not Found");

    }
}

// output
// Linear Search:
// ID: 107, Name: Headphones, Category: Electronics

// Binary Search:
// ID: 107, Name: Headphones, Category: Electronics