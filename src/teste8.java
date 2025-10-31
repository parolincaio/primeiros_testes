import java.util.*;
import java.io.*;

public class teste8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // número de casos de teste

        for (int p = 0; p < n; p++) {
            int alunos = sc.nextInt(); // número de alunos
            ArrayList<Integer> notas = new ArrayList<>();

            // lê as notas dos alunos
            for (int e = 0; e < alunos; e++) {
                int nota = sc.nextInt();
                notas.add(nota);
            }

            // cria uma cópia e ordena em ordem decrescente
            ArrayList<Integer> notasOrg = new ArrayList<>(notas);
            notasOrg.sort(Collections.reverseOrder());

            // conta quantos ficaram na mesma posição
            int iguais = 0;
            for (int i = 0; i < alunos; i++) {
                if (Objects.equals(notas.get(i), notasOrg.get(i))) {
                    iguais++;
                }
            }

            System.out.println(iguais);
        }

        sc.close();
    }
}
