package entidades;

import java.util.HashSet;
import java.util.Objects;
import java.util.TreeSet;

public class Pais {
    private String pais;
    private HashSet<String> paises;

    public Pais(String pais, HashSet<String> paises) {
        this.pais = pais;
        this.paises = paises;
    }

    public Pais() {
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public HashSet<String> getPaises() {
        return paises;
    }

    public void setPaises(HashSet<String> paises) {
        this.paises = paises;
    }


        
}
