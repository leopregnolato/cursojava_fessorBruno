public class Bichoa implements SerVivo {

    public Boolean vivo;
    
    public Bichoa(){
        this.vivo=true;
    }
    
    public void mover(){}
    public void comer(int massa){}
    public void info(){
        System.out.printf("Vivo: %s.%n", this.vivo ? "Sim" : "Não");
    }
}
