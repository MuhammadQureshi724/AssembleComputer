package AssembleComputer;

/**
 * Maximum Resolution
 * 1920 x 1080
 */
public class Resolution {
    private int hor;
    private int ver;

    public Resolution(int hor, int ver) {
        this.hor = hor;
        this.ver = ver;
    }

    public int getHor() { return hor; }
    public void setHor(int hor) { this.hor = hor; }

    public int getVer() { return ver; }
    public void setVer(int ver) { this.ver = ver; }

    @Override
    public String toString() {
        return hor + " x " + ver;
    }
}