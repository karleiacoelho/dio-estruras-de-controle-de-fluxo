package dio;

public class PlanoOperadora {
    public static void main(String[] args) {

        String plano = "T"; // T / B

       /** if(plano == "B") {
            System.out.println("100 min de ligação");
        } else if (plano == "M") {
            System.out.println("100 min de ligação");
            System.out.println("Whatsapp e Instagram grátis");
        } else if (plano == "T") {
            System.out.println("100 min de ligação");
            System.out.println("Whatsapp e Instagram grátis");
            System.out.println("5G de YouTube");
        }
        */

        //MELHORANDO O CÓDIGO COM SWITCH CASE
       switch (plano) {
           case "T": {
               System.out.println("5G de YouTube");
           }
           case "M": {
               System.out.println("Whatsapp e Instagram grátis");
           }
           case "B": {
               System.out.println("100 min de ligação");
           }
       }
    }
}
