package dio;

public class SistemmaDeMedidas {
    public static void main(String[] args) {
        //Estrura Swith Case

        String sigla = "P";
        //Pegando a variável para iniciar as comparações
        switch (sigla) {
            case "P": {
                System.out.println("PEQUENO");
                break;
            }
            case "M": {
                System.out.println("MEDIOO");
                break;
            }
            case "G": {
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
        }
    }
}
