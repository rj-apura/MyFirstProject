import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO A1: Create a File object for "products.txt"
        File f = new File("C:\\Users\\student\\IdeaProjects\\lab17\\src\\products.txt");

        // TODO B1: Create a Scanner to read from the file
        Scanner read = new Scanner(f);
        Scanner in = new Scanner(System.in);

        // TODO C1: Print "Product List:"
        System.out.println("Product List:");

        // TODO C2: Use a while loop to read each product name and print it
        int count = 0;
        while(read.hasNext()){
            String line = read.next();
            System.out.println(line);
            // TODO D1: Keep track of how many products were listed
            count++;
        }

        // TODO D2: After the loop, print "Total products: <count>"
        System.out.println("Total products: "+count);

        // TODO OPTION 1: Allow the user to search for a product name (case-insensitive) after listing all products.
        // prompt user for product search
        System.out.print("Would you like to search for a product? (Y/N): ");

        // using int to calculate result because I don't know how to use booleans
        // 0 = no product found , >1 = product found
        int result = 0;

        // store user answer in String
        String answer = in.nextLine();

        // if statement to evaluate user answer and run product search code
        if(answer.equalsIgnoreCase("y")){
            // initialize new Scanner to read file again
            Scanner search = new Scanner(f);

            // prompt user to define desired product to search
            System.out.print("Enter a product to search: ");

            // store user product choice in String
            String choice = in.nextLine();

            // initiate while loop to read through file contents
            while(search.hasNext()){
                // initialize String to store product per line
                String productSort = search.nextLine();

                // if statement to compare product to search choice
                if (productSort.equalsIgnoreCase(choice)){
                    // per conditional, if current product equals search choice, add to result
                    result++;
                }
            }

            if(result!=0){
                System.out.println("Product found!");
            } else{
                System.out.println("Product not found :(");
            }

        } else {
            System.out.println("Thank you. Goodbye!");
        }


    }
}