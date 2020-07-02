

public class Cell {
    Gridposition position;
    Boolean alive;

    @Override
    public String toString() {
        return "Cell{" +
                "position=" + position +
                ", alive=" + alive +
                '}';
    }

    public Gridposition getPosition() {
        return position;
    }

    public void setPosition(Gridposition position) {
        this.position = position;
    }

    public String getAlive() {
        if(!alive){
            return(" ");
        }
        else
            return "X";
    }

    public void setAlive(Boolean alive) {
        this.alive = alive;
    }

    public Cell(Gridposition position, Boolean alive) {
        this.position = position;
        this.alive = alive;
    }
}

