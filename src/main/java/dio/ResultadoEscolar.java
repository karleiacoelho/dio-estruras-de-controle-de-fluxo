package dio;

public class ResultadoEscolar {
    public static void main(String[] args) {
        // condicional ternaria.
        int nota = 5;

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5? "Recuperação" : "Reprovado";

        System.out.println(resultado);
    }
}
