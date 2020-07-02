
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Ark {
    Integer heigth;
    Integer width;
    List<Cell> cells = new LinkedList<>();


    public void skrivutmig(Ark ark) {
        try {
            TimeUnit.MILLISECONDS.sleep(19);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clearScreen();
        //System.out.println(LocalDateTime.now().toString());
        List<Cell> celler = ark.cells;
        //celler.forEach(cell -> System.out.println(cell.toString()));

        int hojd = ark.getHeigth();
        int bredd = ark.getWidth();
        int cursorRad = 1;
        int cursorKolumn = 1;

        int index = 0;

        while(cursorRad <= hojd ){
            while(cursorKolumn <= bredd){
                System.out.print(celler.get(index).getAlive() + "");
                cursorKolumn++;
                index++;
            }
            cursorKolumn = 1;
            cursorRad++;
            System.out.println();
        }
    }
    public void skumpanatt(Ark ark) {

        int antalceller = ark.getCells().size();
        int random = (int)(Math.random() * antalceller);

        ark.cells.get(random).setAlive(ark.cells.get(random).getAlive().equals(" "));
    }


    public Integer getHeigth() {
        return heigth;
    }
    public void setHeigth(Integer heigth) {
        this.heigth = heigth;
    }
    public Integer getWidth() {
        return width;
    }
    public void setWidth(Integer width) {
        this.width = width;
    }
    public Ark(Integer heigth, Integer width) {
        this.heigth = heigth;
        this.width = width;
        int radPos = 1;
        int kolumnPos = 1;

        while (radPos <= heigth) {
            while (kolumnPos <= width){
                Gridposition position = new Gridposition(kolumnPos, radPos);
                cells.add(new Cell(position, false));
                kolumnPos++;
            }
            kolumnPos = 1;
            radPos++;
        }
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        //System.out.flush();
    }
    public List<Cell> getCells() {
        return cells;
    }
    @Override
    public String toString() {
        return "Ark{" +
                "heigth=" + heigth +
                ", width=" + width +
                '}';                     }
    }