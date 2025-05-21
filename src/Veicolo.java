public abstract class Veicolo {
    private String getModello();
    private int getAnno();
    private void startMotore();

    public Veicolo(String modello, int anno){
        this.getModello();
        this.getAnno();
        this.startMotore();
    }

    public String getModello(){
        return modello;
    }

    public int getAnno(){
        return anno;
    }

    public abstract void startMotore;


}
