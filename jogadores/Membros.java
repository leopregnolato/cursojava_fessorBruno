package jogadores;

public class Membros {

    private final int maxVidas=5;
    //private final int pontosAdd=0;
    private int num=0; 
    private int vidas=1;
    static boolean alerta = false;
    static int qtdMembros=0;
    static int pontosmembros=0;
    

    public Membros(int num){
        this.num = num;
        this.vidas = 3;
        System.out.printf("Jogador de número %d criado com %d vidas%n", num, vidas);
        qtdMembros++;
    }

    public int getVidas(){
        return this.vidas;
    }

    public void setVidas(int vidas){
        if(vidas > maxVidas){
            this.vidas = maxVidas;
        }else if(vidas < maxVidas){
            this.vidas = 0;
        }else{
            this.vidas = vidas;
        }
        }

    /*public void addPontos(int pto){
        this.pontosAdd = pto;      
    }*/
    
    public void addVidas(){
        if(this.vidas < maxVidas){
            this.vidas++;
        }
    }

    static void pontos(){
        pontosmembros += 10;
    }

    public void info(){
        System.out.printf("%nJogador: %d %n", this.num);
        System.out.printf("%nVidas: %d %n", this.vidas);
        System.out.printf("%nAlerta: %s %n", alerta ? "sim" : "não");
        System.out.printf("%nJogadores: %d %n", qtdMembros);
        System.out.printf("%nPontos dos Jogadores: %d %n", pontosmembros);
        //System.out.printf("%nPontos dos ganhos: %d %n", pontosAdd);
        System.out.printf("%n-------------------%n");
    }

  
    
}
