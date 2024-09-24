package Desafio02;

import java.util.Scanner;

public class MainString {
    public static void main(String[] args) {
        VerificarString verificarString = new VerificarString();
        Scanner leitor= new Scanner(System.in);
        System.out.println("Dígite a palavra para contar a quantidade de letras a que contêm");
        var entradaDados=leitor.nextLine();
        var quantidadeA= verificarString.ContadorLetraA(entradaDados);

        System.out.println("A letra 'a' aparece " + quantidadeA + " vezes na palavra.");




    }
}
