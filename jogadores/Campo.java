package jogadores;

public class Campo {
    public static void main(String[] args) {

        int num = 0;

        //System.out.printf("%nAlerta: %s %n", Membros.alerta ? "Sim" : "Não");

        Membros.pontos();


        Membros membro = new Membros(num++);
        Membros membroa = new Membros(num++);
        Membros membrob = new Membros(num++);
        Membros membroc = new Membros(num++);

        //membroc.setPontos(5);

        membro.setVidas(100);
        membroa.addVidas();
        //membrob.addPontos(5);
     
      
        
        System.out.printf("%n%d%n", membro.getVidas());
        System.out.printf("%n%d%n", membroa.getVidas());
        System.out.printf("%n%d%n", membrob.getVidas());
        System.out.printf("%n%d%n", membroc.getVidas());

        Membros.alerta=true;

        membro.info();
        membroa.info();
        membrob.info();
        membroc.info();
        
        /* Membros membro = new Membros(7);

        membro.num = 5;

        System.out.printf("%n%d%n", membro.num);*/
    }
}
