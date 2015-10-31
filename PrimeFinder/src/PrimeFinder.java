/**
 * @Package ${PACKAGE_NAME}
 * @Author Cameron Kelliher
 * @Date 3/3/2015
 */
public class PrimeFinder {

    public static void main(String[] args) {

        int max = 99999;

        boolean[] primes = new boolean[max];
        for(int c = 2; c < max; c++) {
            primes[c] = true;
        }

        for(int i = 2; i < max; i++) {
            if(primes[i]) {
                System.out.print(i + " ");
            }
            if(primes[i]) {
                for(int b = i; b < max; b++) {
                    if(primes[b] && (b % i) == 0) {
                        primes[b] = false;
                    }
                }
            }
        }


    }
}
