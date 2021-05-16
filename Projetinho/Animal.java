/* A classe abstrata só serve para ser herdada, ou seja, não se pode
instanciar objetos dessa classe */

abstract class Animal implements SerVivo {

    private Boolean vivo;
    private int massa;
    private int x;
    private int y;
    private int vel;
    private int forca;


    public Animal(int vel, int massa, int forca){
        this.vivo=true;
        this.massa=massa;
        this.x=0;
        this.y=0;
        this.forca=forca;
        this.vel=vel;
    }

    public void setVivo(Boolean vivo){
        this.vivo=vivo;
    }

    public Boolean getVivo(){
        return this.vivo;
    }

    public void setForca(int forca){
        this.forca=forca;
    }

    public int getForca(){
        return this.forca;
    }

    public void setMassa(int massa){
        this.massa=massa;
    }

    public int getMassa(){
        return this.massa;
    }

    public void atacar(Animal a){
        if(this.vivo){
            if(this.forca > a.forca){
                //this.forca+=a.getMassa();
                a.vivo=false;
            }else{
                this.vivo=false;
            }
        }else{
            System.out.println("-------------------------------------------");
            System.out.println(this.getClass().toGenericString() + "está morto, não pode atacar");
            System.out.println("-------------------------------------------");
        }
    }

    public void mover(){
        if(this.vivo){
            this.x+=this.vel;
            this.y+=this.vel;
        }else{
            System.out.println("-------------------------------------------");
            System.out.println(this.getClass().toGenericString() + " está morto, não pode mover");
            System.out.println("-------------------------------------------");
        }
    }
   
    public void comer(int massa){
        if(this.vivo){
            this.forca+=massa;
        }else{
            System.out.println("-------------------------------------------");
            System.out.println(this.getClass().toGenericString() + "está morto, não pode comer");
            System.out.println("-------------------------------------------");
        }
    }

    public void info(){
        System.out.printf("Tipo..: %s%n", getClass().toString());
        System.out.printf("Vivo..: %s%n", this.getVivo() ? "Sim" : "Não");
        System.out.printf("Massa.: %d%n", this.massa);
        System.out.printf("Vel...: %d%n", this.vel);
        System.out.printf("Forca.: %d%n", this.forca);
        System.out.println("-------------------------------------------");
    }

}
