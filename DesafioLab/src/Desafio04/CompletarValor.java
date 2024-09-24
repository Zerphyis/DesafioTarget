package Desafio04;

public class CompletarValor {
    public static int proximoA() {
        int[] a = {1, 3, 5, 7};
        return a[a.length - 1] + 2;
    }


    public static int proximoB() {
        int[] b = {2, 4, 8, 16, 32, 64};
        return b[b.length - 1] * 2;
    }


    public static int proximoC() {
        int[] c = {0, 1, 4, 9, 16, 25, 36};
        int proximoIndice = c.length;
        return proximoIndice * proximoIndice;
    }


    public static int proximoD() {
        int[] d = {4, 16, 36, 64};
        int proximoIndice = (d.length + 1) * 2;
        return proximoIndice * proximoIndice;
    }


    public static int proximoE() {
        int[] e = {1, 1, 2, 3, 5, 8};
        return e[e.length - 1] + e[e.length - 2];
    }


    public static int proximoF() {
        int[] f = {2, 10, 12, 16, 17, 18, 19};
        return 20;
    }
}
