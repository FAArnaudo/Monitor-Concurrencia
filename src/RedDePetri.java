import java.util.HashMap;

public class RedDePetri {
    private int[][] matrizIncidencia = {
            //   T0 T1 T2 T3 T4 T5 T6 T7 T8 T9 T10 T11
                {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                { 1,-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 1,-1, 0, 0,-1, 0,-1, 0, 0, 0, 0},
                { 0, 0, 1,-1, 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 1,-1, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0,-1, 0, 1,-1, 1,-1, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 1,-1, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 1,-1, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0, 1,-1, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1,-1, 0},
                { 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1,-1},
    };
                               //  P0 P1 P2 P3 P4 P5 P6 P7 P8 P9 P10 P11
    private int[] marcadoInicial = {3, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0};
    private int[] marcadoActual;

    private HashMap<String, int[]> transiciones;

    public RedDePetri() {
        transiciones = new HashMap<>(){
            {put("T0", new int[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});}
            {put("T1", new int[] {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});}
            {put("T2", new int[] {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0});}
            {put("T3", new int[] {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0});}
            {put("T4", new int[] {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0});}
            {put("T5", new int[] {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0});}
            {put("T6", new int[] {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0});}
            {put("T7", new int[] {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0});}
            {put("T8", new int[] {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0});}
            {put("T9", new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0});}
            {put("T10", new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0});}
            {put("T11", new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1});}
        };
    }

    public void sensibilizadas(){

    }

    public void calcularEstado(){
        for(int i = 0; i < matrizIncidencia.length; i++){
            for(int j = 0; j < matrizIncidencia[i].length; j++){

            }
        }
    }
}
