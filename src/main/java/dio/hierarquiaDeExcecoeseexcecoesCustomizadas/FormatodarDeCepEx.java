package dio.hierarquiaDeExcecoeseexcecoesCustomizadas;

public class FormatodarDeCepEx {
    public static void main(String[] args) {
        try {
            String cepFormatado = fotmatarCep("23765064");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O CEP deve conter 8 dígitos");
        }
    }
    static String fotmatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
            throw new CepInvalidoException();
        //Simulando um cep formatado
        return "23.765-064";
    }
}
