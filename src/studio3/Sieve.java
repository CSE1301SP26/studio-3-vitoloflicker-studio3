import java.util.Scanner;

public class Sieve {
    public static void main(String[] args){
        System.out.println("What would you like to set as n?");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean[] primeNumber = new boolean [n+1];
        for(int i = 2; i <= n; i++){
            primeNumber[i] = true;
        }
        for(int i=2; i*i<=n; i++){
            if (primeNumber [i]) {
                for(int j=i*i; j <= n; j+=i){
                    primeNumber [j] = false;
                }
            }
        
        }
        for (int i=2; i<=n; i++){
            if (primeNumber [i]) {
                System.out.println("Prime number: " + i);
            }    
         }
        in.close();    
        }
    }


