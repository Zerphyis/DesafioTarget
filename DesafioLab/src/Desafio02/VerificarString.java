package Desafio02;

import java.util.Scanner;

public class VerificarString {
    public Integer ContadorLetraA(String saida){
        int contador=0;

        char[] digitos=saida.toCharArray();

        for (char c: digitos){
            if(c =='a'|| c =='A'){
                contador++;
            }
        }
        return  contador;

    }
}
