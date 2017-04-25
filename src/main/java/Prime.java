import java.util.Scanner;

/**
 * Created by horea on 25/04/2017.
 */
public class Prime {

    private static boolean isPrime(int numar) {
        if (numar < 1){
            return false;
        }
        if (numar % 2 == 0){
            return false;
        }
        for(int i = 3; i * i <= numar; i += 2) {
            if(numar % i == 0)
                return false;
        }
        return true;
    }

    public static int[] primeTwins(int nr){
        int[] rez = new int[2];
        if (nr < 0){
            nr = 0;
        }
        boolean found = false;
        while (!found){
            if (isPrime(nr + 1) && isPrime(nr + 3)){
                found = true;
                rez[0] = nr + 1;
                rez[1] = nr + 3;
            }
            else{
                if (nr == 2147483647){
                    found = true;
                    rez[0] = -1;
                    rez[1] = -1;
                }
                else {
                    nr += 1;
                }

            }
        }
        return rez;
    }
}
