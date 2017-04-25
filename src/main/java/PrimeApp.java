import java.util.Scanner;

/**
 * Created by horea on 25/04/2017.
 */
public class PrimeApp {
    public static void main(String args[]) {
        System.out.println("Give a number: \n");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] rezultat = Prime.primeTwins(num);
        if ((rezultat[0] == -1)&& (rezultat[1] == -1)){
            System.out.println("The search exceeded int limit (2147483647)");
        }
        else {
            System.out.println("Numbers are: " + rezultat[0] + ' ' + rezultat[1]);
        }
    }
}
