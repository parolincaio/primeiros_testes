import java.util.Scanner;

public class teste1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

            int[] numeros = new int[10];

            for (int i = 0; i < numeros.length; i++) {
                int val = sc.nextInt();

                if (val <= 0){
                    val = 1;
                }
                numeros[i] = val;
            }

            for (int i = 0; i < numeros.length; i++) {
                System.out.println("X[" + i + "] = " + numeros[i]);
            }

        sc.close();
    }

}
