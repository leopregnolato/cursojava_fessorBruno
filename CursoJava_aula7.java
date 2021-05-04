
import java.util.Arrays;
//import java.util.Scanner;

public class CursoJava_aula7 {
    public static void main(String[] args){

        final int tam=10;
        int[] num={9, 2, 7, 1, 8, 5, 3, 4, 0, 6};
        int[] numeros=new int[tam];
        int p=3;
        int pos;

        //for(int i=0; i<num.length;i++){
        //    System.out.printf("%d - ", num[i]);
        // } //percorre o array em todas as posições até percorrer todos os elementos
        //System.out.println("");

        //Arrays.sort(num); //ordena os elementos de um array
        //Arrays.fill(numeros, 10); // preenche o array com o elemento apresentado no segundo argumento
        //System.arraycopy(num, 0, numeros, 0, tam); // copia um array em outro
        //System.out.printf("Os arrays são iguais? Resp: %s.", Arrays.equals(num, numeros) ? "Sim" : "Não"); //compara se dois arrays são iguais
        Arrays.sort(num);
        pos=Arrays.binarySearch(num, p);
        System.out.printf("O elemento %d está no array? Resp: %s.",p,  pos > 0 ? "Sim" : "Não");
        //for(int n:numeros){
        //    System.out.printf("%d - ", n);
        //}
        System.out.println("");
    }
}