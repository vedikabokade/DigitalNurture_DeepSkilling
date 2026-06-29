public class LibraryManagement {

    // Linear Search
    public static Book linearSearch(Book[] books, String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Binary Search
    public static Book binarySearch(Book[] books, String title) {
        int left = 0;
        int right = books.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;
            int compare = books[mid].title.compareToIgnoreCase(title);

            if (compare == 0) {
                return books[mid];
            } else if (compare < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        // Unsorted array for Linear Search
        Book[] books = {

                new Book(103, "Python", "Mark"),
                new Book(101, "Java", "James"),
                new Book(105, "Algorithms", "Thomas"),
                new Book(102, "Data Structures", "Robert"),
                new Book(104, "C Programming", "Dennis")

        };

        // Sorted array for Binary Search
        Book[] sortedBooks = {

                new Book(105, "Algorithms", "Thomas"),
                new Book(104, "C Programming", "Dennis"),
                new Book(102, "Data Structures", "Robert"),
                new Book(101, "Java", "James"),
                new Book(103, "Python", "Mark")

        };

        String searchTitle = "Java";

        System.out.println("Linear Search:");

        Book result1 = linearSearch(books, searchTitle);

        if (result1 != null)
            System.out.println(result1);
        else
            System.out.println("Book Not Found");

        System.out.println();

        System.out.println("Binary Search:");

        Book result2 = binarySearch(sortedBooks, searchTitle);

        if (result2 != null)
            System.out.println(result2);
        else
            System.out.println("Book Not Found");

    }
}


// output
// Linear Search:
// Book ID: 101, Title: Java, Author: James

// Binary Search:
// Book ID: 101, Title: Java, Author: James