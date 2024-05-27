package dio;

import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        System.out.println(mesada);

        while (mesada > 0) {
            Double valorDoce = valorAleatorio(); // Pega o doce
            if (valorDoce > mesada) {
                valorDoce = mesada; // Verifica se ainda tem mesada
            }
                System.out.println("Valor " + valorDoce + " adiconado ao carrinho"); // Imprime o valor do doce
                mesada = mesada -valorDoce; // Calcula saldo da mesada
        }
        System.out.println("Saldo da mesada: " + mesada); // Imprime saldo da mesada ao final
        System.out.println("Joãozinho gastou toda a sua mesada em doces!"); // Mensagem final
    }
    // Gerando valores aleatórios para podermos fazer os testes
    private static Double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8); // Vaores aleatórios entre 2 e 8.
    }
}