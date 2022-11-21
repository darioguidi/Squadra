public class Squadra {
    private String nome;
    private String citta;
    private String allenatore;
    private String coloriSociaili;

    private Calciatore[] calciatori;

    private int rosa=20;
    private int acquisto = 0;

    //COSTRUTTORE
    public Squadra(String nome,String citta,String allenatore,String coloriSociaili){
        this.nome=nome;
        this.citta=citta;
        this.allenatore=allenatore;
        this.coloriSociaili=coloriSociaili;
    }


    //GET
    public String getNome() {
        return nome;
    }

    public String getCitta() {
        return citta;
    }

    public String getAllenatore() {
        return allenatore;
    }

    public String getColoriSociaili() {
        return coloriSociaili;
    }


    //SET
    public void setNome(String nome) {
        this.nome = nome;
    }

    private void setCitta(String citta) {
        this.citta = citta;
    }

    public void setAllenatore(String allenatore) {
        this.allenatore = allenatore;
    }

    public void setColoriSociaili(String coloriSociaili) {
        this.coloriSociaili = coloriSociaili;
    }


    //GET E SET PER CALCIATORI
    public String getNomeCalciatori(int numerodimaglia) {
        String str = null;

        for (int i=0;i<acquisto;i++){
            if(calciatori[i].getNumeroDiMaglia()!=numerodimaglia) {
                str="nessun giocatore";
            }else{
                str = calciatori[i].getNome();
            }
        }
        return str;
    }

    //ACQUISTA
    public void acquistaCalciatori(Calciatore calciatore,int ingaggio,int maglia){
        calciatori[acquisto]=calciatore;
        calciatore.setIngaggio(ingaggio);
        calciatore.setNumeroDiMaglia(maglia);
        calciatore.setSquadraInCuiGioco(this);
        acquisto++;
    }

    //CEDI
    public void cediCalciatore(Calciatore calciatore){
        for (int i=0;i<acquisto;i++){
            if(calciatori[i].equals(calciatore)){
                calciatori[i]=null;
                acquisto--;
            }
        }
    }


    public Calciatore[] getRosa(){
        return calciatori;
    }




}
