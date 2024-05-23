package dio;

public class ExemploForArray {

    public static void main(String[] args) {

        //Construindo um exemplo para imprimir o nome do aluno que está contido em cada ídice do Array
        String alunos [] = {"FELIPE" , "JONAS" , "JULIA" , "MARCOS"};
    /*
        for(int i = 0 ; i < alunos.length ; i++) {
            System.out.println("O aluno indicado no indice i=" + i + " é " + alunos[i]);
        }
    */

        //Refatorando com aplicação do foreach
        for (String aluno : alunos) {
            System.out.println("O nome do aluno é: " + aluno);
        }
    }
}
