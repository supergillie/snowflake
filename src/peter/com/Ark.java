package peter.com;

import java.util.LinkedList;
import java.util.List;

public class Ark {
    Integer heigth;
    Integer width;
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
        Integer ypos = 1;
        Integer xpos = 1;

        while (ypos <= width) {
            while (xpos <= heigth){
                Gridposition position = new Gridposition(xpos, ypos);

                cells.add(new Cell(position, false));

                xpos++;
            }

            ypos++;
        }

    }

    @Override
    public String toString() {
        return "Ark{" +
                "heigth=" + heigth +
                ", width=" + width +
                '}';
    }

    public void skrivutmig() {
        System.out.println("X  X  X");
         System.out.println("X  X  X");
             System.out.println("X  X  X");
    }
}
