public class Main {
    public static void main(String[] args) {

        Calciatore galiano = new Calciatore("galiano","lorenzo",2,2);
        Calciatore pavetto = new Calciatore("pavetto","lorenzo",2,2);

        Squadra juve = new Squadra("juve","torino","pino","rosso");
        //Squadra milan = new Squadra("juve","torino","pino","rosso");

        juve.acquistaCalciatori(galiano,5,10);

        //System.out.println(galiano.getAltezza());
        System.out.println(juve.getRosa());

a
        juve.cediCalciatore(galiano);
    }
}