package ba.unsa.etf.rpr;
import java.util.Scanner;

public class Main {

    public static int sumaCifara(int n){
        int suma = 0;

        while(n > 0){
            suma+=n%10;
            n/=10;
        }

        return suma;

    }
    public static void main(String[] args) {
        System.out.println("Unesi broj: ");
        Scanner unos = new Scanner(System.in);
        int t = unos.nextInt();
        for(int i = 1; i < t; i++){
            if(i%sumaCifara(i) == 0){
                System.out.println(i);
            }
        }

    }
}