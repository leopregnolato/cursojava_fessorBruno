public class CursoJava_aula3{
    public static void main(String[] args){

        int pos=5;

        switch(pos){
            case 1:
                System.out.println("Primeiro Lugar");
                break;
            case 2:
                System.out.println("Segundo Lugar");
                break;
            case 3:
                System.out.println("Terceiro Lugar");
                break;
            case 4: case 5: case 6:
                System.out.println("Prêmio de participação");
                break;
            default:
                System.out.println("Não subiu no pódio");
                break;
        }
    }
}

        /*Operações ternárias
        int nota=90;
        int faltas=10;
        int maxFaltas=5;
        int media=60;
        int res;

        Variável res tipo String:
        res=(nota >= media ? "Aprovado" : "Reprovado");
        System.out.println("Resultado: " + res);

        Variável res tipo Int:
        res=(nota >= media ? 1 : 0);
        System.out.println("Resultado: " + (res==1?"Aprovado":"Reprovado"));
        */

        /* if, if else, else:

        if((nota >= media) && (faltas<= maxFaltas)){
            System.out.println("Aprovado");
        }else if(nota >= 40){
            System.out.println("Recuperacao");
        }
        else{
            System.out.println("Reprovado");
        }
        System.out.println("Fim do programa");
        */
    
