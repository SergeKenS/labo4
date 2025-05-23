public class Carre2 implements ElementGraphiqueInter {
public static int longueur;
private int x;
private int y;

    public Carre2 (int longueur, int x, int y) {
        this.x = x;
        this.y = y;
        this.longueur = longueur;
    }

    public String toString () {
        return "position : ( " + x + ", " + y + " )" + "\nLa perimetre : "
                + perimetre() + "\nLa surface : " + surface() + "\n";
    }

    @Override
    public double perimetre() {
        return longueur * 4;
    }

    @Override
    public double surface() {
        return longueur * longueur;
    }
}
