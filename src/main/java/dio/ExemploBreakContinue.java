package dio;

public class ExemploBreakContinue {

    public static void main(String[] args) {
        System.out.println("----Testando breack----");
        for(int numero = 1; numero <= 5; numero++) {
            if(numero == 3){
                break; // Assim que a condição for verdadeira, para a execução assim que numero for igual a 3
            } 

            System.out.println(numero); // Vai imprimir apenas até o numero 2
        }

        System.out.println("----Testando continue----");
        for(int number = 1; number <= 5; number++) {
            if (number == 3) {
                continue; // Assim que a condição for verdadeira, não conta o 'number' 3, mas continua a execução
            }
            System.out.println(number); // Vai imprimir todos os 'number' com exceção do 3
        }
    }
}
