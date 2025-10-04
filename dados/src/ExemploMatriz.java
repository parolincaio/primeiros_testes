public class ExemploMatriz {
    public static void main(String[] args) {
        // Criando matriz 2x3 (2 linhas, 3 colunas)
        int[][] matriz = new int[2][3];

        // Atribuindo valores
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[1][0] = 3;

        // Acessando valores
        System.out.println(matriz[0][1]); // 2
        System.out.println(matriz[1][0]); // 3
    }
}


/*
// Criando matriz 2x3
let matriz = [
    [1, 2, 3],
    [4, 5, 6]
];

// Acessando valores
console.log(matriz[0][1]); // 2
console.log(matriz[1][0]); // 4

 */