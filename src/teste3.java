import java.util.Scanner;

public class teste3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

            int[] numeros = new int[20];

            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = sc.nextInt();
            }

            for (int i = 0; i < 10; i++) {
                int temp = numeros[i];
                numeros[i] = numeros[19 - i];
                numeros[19 - i] = temp;
            }

            for (int i = 0; i < numeros.length; i++){
                System.out.println("N[" + i + "] = " + numeros[i]);
            }

        sc.close();
    }
}