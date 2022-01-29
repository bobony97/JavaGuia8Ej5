package servicio;

import entidades.Pais;
import java.util.*;
import utilidades.Comparadores;

public class ServiPais {

    public Pais crearPais() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String paisAd = "", opc = "";

        HashSet<String> paises = new HashSet();

        do {
            System.out.println("Ingrese un pais");
            paisAd = leer.next();
            paises.add(paisAd);

            System.out.println("Desea agregar otro pais s/n");
            opc = leer.next();

        } while (!opc.equals("n"));

        for (String paise : paises) {
            System.out.println(paise);
        }

        System.out.println(" ");
        System.out.println("PAISES ORDENADOS ALFABETICAMENTE");

        ArrayList<String> paiseslist = new ArrayList(paises);
        Collections.sort(paiseslist);

        for (String string : paiseslist) {
            System.out.println(string);
        }

        System.out.println(" ");
        System.out.println("Ingrese el pais a eliminar");
        String paisElim = leer.next();

        
        boolean cond1 = false;
        for (int i = 0; i < paiseslist.size(); i++) {
            String a = paiseslist.get(i);
            if (a.equals(paisElim)) {
                paiseslist.remove(a);
                cond1 = true;
            }
        }

        if (cond1 == true) {
            System.out.println("El pais ha sido eliminado");
        } else {
            System.out.println("El pais no se encuentra en la lista de paises");
        }


        for (String paisEliminado : paiseslist) {
            System.out.println(paisEliminado);
        }

        return new Pais(paisAd, paises);
    }

}
