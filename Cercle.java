public class Cercle extends ElementGraphique {
    public static int rayon;

    public Cercle (int rayon, int x, int y) {
        placer(x, y);
        this.rayon = rayon;
    }

    public String toString () {
        return super.toString() + "\nLa circonference : " + perimetre() + "\nLa surface : " + surface() + "\n";
    }


    @Override
    public double surface() {
        return Math.PI * rayon * rayon;
    }

    @Override
    public double perimetre() {
        return 2 * Math.PI * rayon;
    }
}
