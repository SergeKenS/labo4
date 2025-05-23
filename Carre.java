
public class Carre extends ElementGraphique{
    private static int longueur;

    public Carre (int longeur, int x, int y) {
        placer(x,y);
        this.longueur = longeur;
    }


    public String toString() {
        return super.toString() + "\nLa perimetre : " + perimetre() + "\nLa surface : " + surface() + "\n";
    }


    @Override
    public double surface() {
        return longueur * 4;
    }

    @Override
    public double perimetre() {
        return longueur * longueur;
    }
}
