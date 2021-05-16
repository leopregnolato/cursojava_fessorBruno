public class Vegetal {

    private Boolean vivo;
    private int massa;
    
    public Vegetal(int massa){
        this.massa=massa;
        this.vivo=vivo;
    }

    public int getMassa(){
        return this.massa;
    }

    public void setVivo(Boolean vivo){
        this.vivo=vivo;
    }

    public void info(){
        System.out.printf("Tipo..: %s%n", getClass().toString());
        System.out.printf("Vivo..: %s%n", this.vivo ? "Sim" : "Não");
        System.out.printf("Massa.: %d%n", this.massa);       
        System.out.println("-------------------------------------------");
    }

}
