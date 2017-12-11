package ec327.gdevlin.ec327final.Classes;

/**
 * Created by gerrydevlin on 12/10/17.
 */

public class Cords {
    private int x;
    private int y;

    public Cords(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override           //generate equals()
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cords cords = (Cords) o;

        if (getX() != cords.getX()) return false;
        return getY() == cords.getY();
    }
}
