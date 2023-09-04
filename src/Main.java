import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] my_array) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Number: ");
        String[] new_array = new String[5];
        int counter = 0;

        while (counter < 5) {
            int new_count = scanner.nextInt();

            if (new_count == 77) {
                new_array[counter] = "0";
            } else if (new_count % 3 == 0 && new_count % 7 == 0) {
                new_array[counter] = "FizzBuzz";
            } else if (new_count % 7 == 0) {
                new_array[counter] = "Buzz";
            } else if (new_count % 3 == 0 ) {
                new_array[counter] = "Fizz";
            } else {
                new_array[counter] = Integer.toString(new_count);
            }
            counter++;
        }
        System.out.println(Arrays.toString(new_array));


    }
}