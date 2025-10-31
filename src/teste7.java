import java.util.*;

public class teste7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;

            ArrayDeque<Integer> fila = new ArrayDeque<>();
            for (int i = 1; i <= n; i++) {
                fila.add(i);
            }

            ArrayList<Integer> removidos = new ArrayList<>();

            while (fila.size() > 1) {
                removidos.add(fila.pollFirst()); // remove e retorna primeiro
                fila.addLast(fila.pollFirst()); // move o próximo para o fim
            }

            System.out.print("Discarded cards: ");
            if (!removidos.isEmpty()) {
                for (int i = 0; i < removidos.size(); i++) {
                    if (i != 0) System.out.print(", ");
                    System.out.print(removidos.get(i));
                }
            }
            System.out.println();
            System.out.println("Remaining card: " + fila.peek());
        }

        sc.close();
    }
}
