
public class Gol {
    public static void main (String[] args)
    {
        System.out.println("Nu börjar game of life");
        Ark ark = new Ark(24,80 );
        int sekunder = 0;
        while(sekunder < 60000){
            ark.skumpanatt(ark);
            ark.skrivutmig(ark);
            sekunder++;

        }
    }
}