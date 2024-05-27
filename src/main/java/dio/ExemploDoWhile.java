package dio;

import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {

        System.out.println("Discando...");
        do {
            //execuntando repetidamente até que alguém atenda.
            System.out.println("Telefone tocando");
        } while (tocanto());
        System.out.println("Alô!");
    }
    private static boolean tocanto(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        // negando o ato de continuar tocando
        return !atendeu;
    }
}
