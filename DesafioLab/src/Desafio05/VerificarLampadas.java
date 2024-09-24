package Desafio05;

public class VerificarLampadas {

    public static void VerificaLampadas(boolean[] lampadas, boolean[] ligada) {
        for (int i = 0; i < 3; i++) {
            if (lampadas[i]) {
                System.out.println("Lampada " + (i + 1) + " está acesa. Controlada pelo Interruptor 2.");
            } else if (!lampadas[i] && ligada[i]) {
                System.out.println("Lampada " + (i + 1) + " está apagada, mas acessa. Controlada pelo Interruptor 1.");
            } else {
                System.out.println("Lampada " + (i + 1) + " está apagada e fria. Controlada pelo Interruptor 3.");
            }
        }
    }
    public static void main(String[] args) {
        VerificarLampadas olhando= new VerificarLampadas();
        boolean[] lampadas = {false, false, false};
        boolean[] ligada = {false, false, false};


        lampadas[0] = true;
        ligada[0] = true;

        System.out.println("Esperando....");


        lampadas[0] = false;
        lampadas[1] = true;

    }

}
