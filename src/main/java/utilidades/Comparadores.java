package utilidades;

import entidades.Pais;
import java.util.Comparator;

public class Comparadores {
    public static Comparator<Pais> ordenarAlfabeticamente = new Comparator<Pais>() {
        @Override
        public int compare(Pais o1, Pais o2) {
            return o1.getPais().compareTo(o2.getPais());
        }
    };
}
