import java.util.Scanner;

public class teste2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

            int[] numeros = new int[10];
            int val = sc.nextInt();

            System.out.println("N[0] = " + val);

            for (int i = 1; i < numeros.length; i++) {
                val *= 2;
                numeros[i] = val;

                System.out.println("N[" + i + "] = " + numeros[i]);
            }


        sc.close();
    }
}
