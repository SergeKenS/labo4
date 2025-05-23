import java.util.ArrayList;
import java.util.Objects;

public class Main {

    public static void main (String [] args) {
        /*ArrayList<ElementGraphique> cercles = new ArrayList<ElementGraphique>(3);
        cercles.add(new Cercle(3, 1,2));
        cercles.add(new Cercle(10, 5, 5));
        cercles.add(new Cercle(12, 0, 0));*/

        ArrayList<Object> carre = new ArrayList<>(3);
        carre.add(new Carre2(3,1, 2));
        carre.add(new Carre2(10, 5, 5));
        carre.add(new Carre2(12,0, 0));
        String hello = "Bonjour le monde";
        carre.add(hello);

        System.out.println(carre);
    }
}
