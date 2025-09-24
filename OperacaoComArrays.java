import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Programa para demonstrar operações com arrays unidimensionais e multidimensionais
 * 
 * Este programa permite:
 * 1. Criar e manipular um array unidimensional de 5 números inteiros
 * 2. Calcular a soma dos elementos do array unidimensional
 * 3. Criar e preencher uma matriz 3x3
 * 4. Exibir a matriz em formato tabular
 * 5. Calcular a soma de todos os elementos da matriz
 * 
 * @author Sistema de Operações com Arrays
 * @version 1.0
 */
public class OperacaoComArrays {
    
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("=== PROGRAMA DE OPERAÇÕES COM ARRAYS ===");
        System.out.println("Desenvolvido para demonstrar arrays unidimensionais e multidimensionais\n");
        
        try {
            // Parte 1: Array Unidimensional
            System.out.println("PARTE 1: ARRAY UNIDIMENSIONAL");
            System.out.println("============================");
            int[] arrayUnidimensional = criarArrayUnidimensional();
            int somaArray = calcularSomaArray(arrayUnidimensional);
            exibirResultadosArray(arrayUnidimensional, somaArray);
            
            System.out.println("\n" + "=".repeat(50) + "\n");
            
            // Parte 2: Matriz 3x3
            System.out.println("PARTE 2: MATRIZ 3x3");
            System.out.println("===================");
            int[][] matriz = criarMatriz3x3();
            int somaMatriz = calcularSomaMatriz(matriz);
            exibirResultadosMatriz(matriz, somaMatriz);
            
            System.out.println("\n=== PROGRAMA FINALIZADO COM SUCESSO ===");
            
        } catch (Exception e) {
            System.err.println("Erro durante a execução do programa: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
    
    /**
     * Cria um array unidimensional com 5 números inteiros fornecidos pelo usuário
     * @return array de 5 números inteiros
     */
    private static int[] criarArrayUnidimensional() {
        int[] array = new int[5];
        System.out.println("Digite 5 números inteiros para o array:");
        
        for (int i = 0; i < array.length; i++) {
            while (true) {
                try {
                    System.out.print("Número " + (i + 1) + ": ");
                    array[i] = scanner.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Erro: Digite apenas números inteiros!");
                    scanner.nextLine(); // Limpa o buffer
                }
            }
        }
        
        return array;
    }
    
    /**
     * Calcula a soma de todos os elementos do array unidimensional
     * @param array o array para calcular a soma
     * @return a soma dos elementos
     */
    private static int calcularSomaArray(int[] array) {
        int soma = 0;
        for (int numero : array) {
            soma += numero;
        }
        return soma;
    }
    
    /**
     * Exibe os resultados do array unidimensional
     * @param array o array a ser exibido
     * @param soma a soma dos elementos
     */
    private static void exibirResultadosArray(int[] array, int soma) {
        System.out.println("\nRESULTADOS DO ARRAY UNIDIMENSIONAL:");
        System.out.println("-----------------------------------");
        System.out.print("Elementos do array: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("Soma dos elementos: " + soma);
        System.out.println("Quantidade de elementos: " + array.length);
        System.out.printf("Média dos elementos: %.2f%n", (double) soma / array.length);
    }
    
    /**
     * Cria uma matriz 3x3 com valores fornecidos pelo usuário
     * @return matriz 3x3 preenchida
     */
    private static int[][] criarMatriz3x3() {
        int[][] matriz = new int[3][3];
        System.out.println("Digite os valores para preencher a matriz 3x3:");
        System.out.println("(Digite os valores linha por linha)");
        
        for (int i = 0; i < 3; i++) {
            System.out.println("\nLinha " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                while (true) {
                    try {
                        System.out.print("Posição [" + (i + 1) + "][" + (j + 1) + "]: ");
                        matriz[i][j] = scanner.nextInt();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Erro: Digite apenas números inteiros!");
                        scanner.nextLine(); // Limpa o buffer
                    }
                }
            }
        }
        
        return matriz;
    }
    
    /**
     * Calcula a soma de todos os elementos da matriz
     * @param matriz a matriz para calcular a soma
     * @return a soma de todos os elementos
     */
    private static int calcularSomaMatriz(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
        }
        return soma;
    }
    
    /**
     * Exibe os resultados da matriz em formato tabular
     * @param matriz a matriz a ser exibida
     * @param soma a soma de todos os elementos
     */
    private static void exibirResultadosMatriz(int[][] matriz, int soma) {
        System.out.println("\nRESULTADOS DA MATRIZ 3x3:");
        System.out.println("-------------------------");
        
        // Exibição em formato tabular
        System.out.println("Matriz em formato tabular:");
        System.out.println("┌─────────┬─────────┬─────────┐");
        
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("│");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%8d │", matriz[i][j]);
            }
            System.out.println();
            
            if (i < matriz.length - 1) {
                System.out.println("├─────────┼─────────┼─────────┤");
            }
        }
        
        System.out.println("└─────────┴─────────┴─────────┘");
        
        // Informações adicionais
        System.out.println("\nInformações da matriz:");
        System.out.println("Dimensões: 3x3 (3 linhas × 3 colunas)");
        System.out.println("Total de elementos: " + (matriz.length * matriz[0].length));
        System.out.println("Soma de todos os elementos: " + soma);
        System.out.printf("Média dos elementos: %.2f%n", (double) soma / (matriz.length * matriz[0].length));
        
        // Exibir soma por linha e coluna
        exibirSomasPorLinhaEColuna(matriz);
    }
    
    /**
     * Exibe as somas por linha e por coluna da matriz
     * @param matriz a matriz para calcular as somas
     */
    private static void exibirSomasPorLinhaEColuna(int[][] matriz) {
        System.out.println("\nSomas por linha:");
        for (int i = 0; i < matriz.length; i++) {
            int somaLinha = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                somaLinha += matriz[i][j];
            }
            System.out.println("Linha " + (i + 1) + ": " + somaLinha);
        }
        
        System.out.println("\nSomas por coluna:");
        for (int j = 0; j < matriz[0].length; j++) {
            int somaColuna = 0;
            for (int i = 0; i < matriz.length; i++) {
                somaColuna += matriz[i][j];
            }
            System.out.println("Coluna " + (j + 1) + ": " + somaColuna);
        }
    }
}