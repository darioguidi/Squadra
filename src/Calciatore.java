public class Calciatore {

    private String nome;
    private String cognome;
    private int altezza;
    private double peso;
    private int ingaggio;
    private int numeroDiMaglia;
    private Squadra squadraInCuiGioco;


    public Calciatore(String nome, String cognome, int altezza, double peso) {
        this.nome = nome;
        this.cognome = cognome;
        this.altezza = altezza;
        this.peso = peso;
    }


    //GET E SET
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIngaggio() {
        return ingaggio;
    }

    public void setIngaggio(int ingaggio) {
        this.ingaggio = ingaggio;
    }

    public int getNumeroDiMaglia() {
        return numeroDiMaglia;
    }

    public void setNumeroDiMaglia(int numeroDiMaglia) {
        this.numeroDiMaglia = numeroDiMaglia;
    }


    public Squadra getSquadraInCuiGioco() {
        return squadraInCuiGioco;
    }

    public void setSquadraInCuiGioco(Squadra squadraInCuiGioco) {
        this.squadraInCuiGioco = squadraInCuiGioco;
    }
}
