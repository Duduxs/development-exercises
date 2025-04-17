package src.algorithms_complexity.exercises;

import java.util.Arrays;

public class OrdemCubica {

    public static void main(String[] args) {
        var a = new int[][]{{1, 2, 3}, {4, 5, 6}};
        var b = new int[][]{{7, 8}, {9, 10}, {11, 12}};
        var c = matrixMultiply(a, b);

        for(var i = 0; i < c.length; i++) {
            for(var j = 0 ; j < c[i].length; j++) {
                System.out.print(c[i][j] + " ");
            }
        }
    }

    /**
     * Função para multiplicar uma matrix A (mxp) por uma matriz B (pxn)
     * O resultado será uma matriz C (mxn).
     *
     * > > > Análise da complexidade de tempo
     *  Usando a anotação assintótica
     *      O(m * n * p) => Big O - Ordem cúbica
     *      Θ(m * n * p) => Theta - Ordem cúbica
     *      Ω(m * n * p) => Ômega - Ordem cúbica
     *  Sem a anotação assintótica pra qualquer caso
     *      4 + M*N*P*1 => M*N*P ou N³ é o caso de maior ordem aqui.
     *
     *  > > > Análise da complexidade de espaço
     *  Usando a anotação assintótica
     *      O(m * n) => Big O - Ordem quadrática
     *      Θ(m * n) => Theta - Ordem quadrática
     *      Ω(m * n) => Ômega - Ordem quadrática
     *  Sem a anotação assintótica pra qualquer caso
     *      3 + M*N + 3 => M*N ou N² é o caso de maior ordem aqui.
     */
    public static int[][] matrixMultiply(int[][] a, int[][] b) {
        var m = a.length;
        var p = a[0].length;
        var n = b[0].length;

        var result = new int[m][n];

        for (var i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < p; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return result;
    }
}
