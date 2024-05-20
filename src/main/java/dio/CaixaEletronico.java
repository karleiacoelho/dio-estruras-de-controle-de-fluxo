package dio;

public class CaixaEletronico {
    public static void main(String[] args) {

        //Controle de fluxo simples
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if (valorSolicitado < saldo)
            saldo -= valorSolicitado;

         System.out.println(saldo);
    }
}