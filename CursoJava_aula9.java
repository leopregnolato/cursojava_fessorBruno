public class CursoJava_aula9{

    public static void main(String[] args){

        int r;
        msg("Cursos CFB", 2);
        msg("Todos os cursos pra você!", 2);
        r=soma(10, 5); 
        System.out.println(r);      
        System.out.println(somam(2,2));  
        System.out.println(somam(2.5,2.5));  
    }

    public static int somam(int... numeros){
        int res=0;
        for(int n:numeros){
            res+=n;
        }
        return res;
    }

    public static double somam(double... numeros){ //sobrecarga de métodos: para permitir diferentes estradas em métodos semelhandtes.
        double res=0;
        for(double n:numeros){
            res+=n;
        }
        return res;
    }


    public static int soma(int n1, int n2){
        int res=n1+n2;
        return res;
    }

    public static void msg(String m, int l){
        for(int i=0; i<l; i++){
            System.out.println(m);
        }
    }



}
