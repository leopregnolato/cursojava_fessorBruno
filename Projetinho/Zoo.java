public class Zoo {

    public static void main(String[] args) {
        
       Sapo a1=new Sapo(10, 10, 10);
       Aranha a2= new Aranha(5, 5, 5, 3);
       Formiga a3= new Formiga(2, 2, 2);
       Vegetal v1= new Vegetal(1);
       Vegetal v2= new Vegetal(5);
       Vegetal v3= new Vegetal(10);     

       a2.info();
       a3.info();
       
       a2.atacar(a3);
       a2.comer(a3.getMassa());

     //  System.out.println(a3.getVivo());

       a2.info();
       a3.info();
       a3.mover();
       

    }
    
}
