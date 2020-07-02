package peter.com;

public class Gridposition {
    Integer kolumnposition;
    Integer radposition;

    @Override
    public String toString() {
        return "Gridposition{" +
                "Radposition=" + radposition +
                ", kolumnposition=" + kolumnposition +

                '}';
    }

    public Integer getKolumnposition() {
        return kolumnposition;
    }

    public void setKolumnposition(Integer kolumnposition) {
        this.kolumnposition = kolumnposition;
    }

    public Integer getRadposition() {
        return radposition;
    }

    public void setRadposition(Integer radposition) {
        this.radposition = radposition;
    }

    public Gridposition(Integer xposition, Integer yposition) {
        this.kolumnposition = xposition;
        this.radposition = yposition;
    }
}
