import java.util.Scanner;

public class CursoJava_aula6{
   public static void main(String[] args){

      final int tam=5;
      char[] gabarito={'a', 'a', 'd', 'b', 'c'};
      char[] respostas=new char[tam];
      int nota=0;
      Scanner scan=new Scanner(System.in);
      
      /*
      respostas[0]='a';
      respostas[1]='b';
      respostas[2]='c';
      respostas[3]='b';
      respostas[4]='c';
      */

      for(int i=0; i<tam; i++){
         System.out.printf("Informe a alternativa %d: ", i);
         respostas[i]=scan.nextLine().charAt(0);
         }
      

      for(int i=0; i<tam; i++){
         if(respostas[i]==gabarito[i]){
            nota++;
         }
      }
      
      System.out.printf("Nota do aluno: %d.%n", nota);
   }
}

      /*
      final int tam=5;
      
      int[] num=new int[tam];
      int[] numeros={10, 20, 30, 40, 50, 3, 4 , 5};

      num[0]=10;
      num[1]=5;
      num[2]=15;
      num[3]=0;
      num[4]=8;

      for(int i=0; i<numeros.length ; i++){
         System.out.printf("-- %d%n - ", numeros[i]);
      }  */
