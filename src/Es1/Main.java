package Es1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        System.out.println("Scrivi un numero casuale da 1 a 10");
        int casual = Integer.parseInt(myscanner.nextLine());
        int[] Numbers =new int[] {1, 3, 6, 7, 9};
        int[] n2=new int[]{3};
        System.out.println(Arrays.toString(n2));


        if (casual <= 0 | casual > 10 )  {
            System.out.println("Error");
        } else {
            System.out.println(casual);
        }
        System.out.println(Arrays.toString(Numbers));
        System.out.println(Numbers[3]);
        myscanner.close();
    }
}