public class Automobile extends Veicolo {
    int porte;
    public Automobile(int porte, int modello, int anno){
        super (int modello, int anno);
        this.porte = porte;
    }

    @Override
    public void startMotore(){
        return "Motore acceso: Vroom!";
    }
    public int getPorte(){
        return porte;
    }
    public void setPorte(int porte){
        this.porte = porte;
    }

}
