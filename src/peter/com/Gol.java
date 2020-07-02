package peter.com;

class Gol {
    public static void main (String[] args)
    {
        System.out.println("Nu börjar game of life");
        Ark ark = new Ark(15,15);
        Integer sekunder = 0;
        while(sekunder < 3){
            ark.skumpanått(ark);
            ark.skrivutmig(ark);
            sekunder++;

        }
    }
}