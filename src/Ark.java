


import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Ark {
    Integer heigth;
    Integer width;

    public List<Cell> getCells() {
        return cells;
    }

    public void setCells(List<Cell> cells) {
        this.cells = cells;
    }

    List<Cell> cells = new LinkedList<>();

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
        Integer radPos = 1;
        Integer kolumnPos = 1;

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

    @Override
    public String toString() {
        return "Ark{" +
                "heigth=" + heigth +
                ", width=" + width +
                '}';
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public void skrivutmig(Ark ark) {
        try {
            TimeUnit.MILLISECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clearScreen();
        //System.out.println(LocalDateTime.now().toString());
        List<Cell> celler = ark.cells;
        //celler.forEach(cell -> System.out.println(cell.toString()));

        Integer höjd = ark.getHeigth();
        Integer bredd = ark.getWidth();
        Integer cursorRad = 1;
        Integer cursorKolumn = 1;

        Integer index = 0;

        while(cursorRad <= höjd ){
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

    public void skumpanått(Ark ark) {

        Integer antalceller = ark.getCells().size();
        int random = (int)(Math.random() * antalceller);

        if(ark.cells.get(random).getAlive() == "O"){
            ark.cells.get(random).setAlive(true);
        }
    }
}
