import java.util.Scanner;

public class teste4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

            int[] numeros = new int[1000];
            int val = sc.nextInt();

            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = i % val;
            }

            for (int i = 0; i < numeros.length; i++) {
                System.out.println("N[" + i + "] = " + numeros[i]);
            }

        sc.close();
    }
}