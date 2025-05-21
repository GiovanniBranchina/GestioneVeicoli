public class Moto extends Veicolo {
    int cilindrata;
    public Moto(int cilindrata, int modello, int anno){
        super (int modello, int anno);
        this.cilindrata = cilindrata;
    }

    @Override
    public void startMotore(){
        return "Motore acceso: Brrrum!!";
    }
    public int getPorte(){
        return cilindrata;
    }
    public void setPorte(int porte){
        this.cilindrata = cilindrata;


    }

}
