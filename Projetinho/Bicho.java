/* A classe abstrata só serve para ser herdada, ou seja, não se pode
instanciar objetos dessa classe */

abstract class Bicho implements SerVivo {
    public Bicho(){}

    public void mover();
    public void comer(int massa);
    public void info();

}
