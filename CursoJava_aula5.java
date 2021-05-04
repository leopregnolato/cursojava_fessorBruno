import java.util.Scanner;

public class CursoJava_aula5{
   public static void main(String[] args){
        /* O DO WHILE primeiro executa e depois testa a condição. Com esse código garantimos que o bloco de código seja executado ao menos uma vez */

        int cont=0;
        do{
            System.out.println(cont + " - CFB cursos");
            cont++;
        }while(cont < 0);
        System.out.println("Fim do Programa.");


        /* O WHILE é um loop para ser executado quando NÃO sabemos quantas vezes queremos executar um bloco de código 

        Scanner scan = new Scanner(System.in);

        int max = scan.nextInt();
        int cont=0;
        while(cont < max){
            System.out.println(cont + " - CFB Cursos");
            cont++;
        }
        System.out.println("Fim do Programa.");
        */

    /* O FOR é um loop para ser executado quando sabemos quantas vezes queremos executá-lo
        for(int cont=10 ; cont > 0 ; cont--){
            System.out.println(cont + " - Cursos CFB");
        }
        System.out.println("Fim do Programa.");
    */
    }
}