package Aplicacio;

import Excepcions.NoTrobat;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws NoTrobat {
        LlistaDobleEncad<Ciutada> llista = new LlistaDobleEncad<>();
        Ciutada ciutada1 = new Ciutada("Xavi","Hernandez","39943636L");
        Ciutada ciutada2 = new Ciutada("Luuk","DeJong","672946185P");
        Ciutada ciutada3 = new Ciutada("Gerard","Pique","38264668K");
        Ciutada ciutada4 = new Ciutada("Jordi","Alba","26679844M");

        llista.InserirF(ciutada1);
        llista.InserirF(ciutada2);
        llista.Inserir(1, ciutada3);
        llista.Inserir(3, ciutada4);

        System.out.println("La llista hauria de ser: ciutada3, ciutada1, ciutada4, ciutada2");
        Iterator<Ciutada> iterator = llista.iterator();
        while (iterator.hasNext()){
            System.out.println((Ciutada) iterator.next());
        }

        System.out.println("Metode Obtenir"+ llista.Obtenir(2));
        System.out.println("Longitud de la llista"+ llista.Longitud());
        System.out.println("Metode esborrar"+ llista.Esborrar(2));
        System.out.println("Comprovar que s'ha esborrat"+ llista.Longitud());
        System.out.println("Metode buscar"+ llista.Buscar(ciutada1));
    }
}
