package heranca;
public class CursoJava_aula14{
    public static void main(String[] args){

        Carro c1=new Carro("Golf");
        Carro c2=new Carro("HRV");
        CarroCombate c3=new CarroCombate("Leopardo", 100);
        CarroCombate c4=new CarroCombate("Pantera", 50);

        c3.atirar();
        c3.atirar();
        c3.atirar();
        c3.atirar();
        c3.atirar();

        c4.sofrerDano(30);
        c1.sofrerDano(5);

        c1.info();
        c2.info();
        c3.info();
        c4.info();
        
    }
}
