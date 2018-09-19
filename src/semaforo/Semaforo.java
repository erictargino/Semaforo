/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforo;

/**
 *
 * @author Aluno
 */
public class Semaforo {

    public static void main(String[] args) {
        
        System.out.println("--SEMÁFORO--");
        do {            
            System.out.println(Sinal.VERDE);
            espera(Sinal.VERDE.tempo);
            System.out.println(Sinal.AMARELO);
            espera(Sinal.AMARELO.tempo);
            System.out.println(Sinal.VERMELHO);
            espera(Sinal.VERMELHO.tempo);
        } while (true);
    }
    
    private static void espera(int tempo){
        try {
            Thread.sleep(tempo);
        } catch (Exception e) {
            System.err.println("Erro");
        }
    }
}
