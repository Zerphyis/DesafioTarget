package Desafio01;

import java.util.Scanner;

public class Fiboni {
    public static boolean FiboniLista(int numero){
        if(numero < 0) {
            return false;
        }

            int numeroInicial = 0;
            int atualNumero = 1;
            int proximoNumero;

            while (atualNumero < numero) {
                proximoNumero = numeroInicial + atualNumero;
                numeroInicial = atualNumero;
                atualNumero = proximoNumero;
            }
        return atualNumero == numero || numero == 0;
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Informe um número:");
        int numero = scanner.nextInt();


        if (FiboniLista(numero)){
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " nãp pertence à sequência de Fibonacci.");
        }

    }
}


