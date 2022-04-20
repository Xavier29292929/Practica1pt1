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

        System.out.println("Iteració de la llista");
        Iterator<Node<Ciutada>> iterator = llista.iterador();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        System.out.println("Metode Obtenir"+ llista.Obtenir(2).toString());
        System.out.println("Longitud de la llista: "+ llista.Longitud());
        System.out.println("Metode esborrar"+ llista.Esborrar(2).toString());
        System.out.println("Comprovar que s'ha esborrat: "+ llista.Longitud());
        //System.out.println("Metode buscar"+ llista.Buscar(ciutada1));

        TaulaHash<Integer, String> taula = new TaulaHash<>();

        taula.InserirH(39943636, "Leo Messi");
        taula.InserirH(35548689, "Andres Iniesta");
        taula.InserirH(42836589, "Carles Puyol");
        taula.InserirH(34659768, "Javier Mascherano");

        System.out.println("Mostrar mida de la taula"+ taula.Mida());
        System.out.println("Metode Obtenir"+ taula.Obtenir(39943636));
        System.out.println("Metode Buscar"+ taula.BuscarH(35548689));
        //Joc de Proves del metode esborrar
        System.out.println("Comprovem que Carles Puyol esta amb la seva clau"+ taula.Obtenir(42836589));
        System.out.println("Borrem a Carles Puyol");
        taula.Esborrar(42836589);
        System.out.println("Comprovem que ja no hi es"+ taula.Obtenir(42836589));
        //System.out.println("Ho comprovem amb el metode buscar"+ taula.BuscarH(42836589));
        //Joc de Proves del redimensionat
        System.out.println("El factor de carrega actual es"+ taula.ObtenirFactorCarrega());//Factor de carrega actual
        taula.InserirH(26549245, "Han Solo");
        System.out.println("El factor de carrega amb la mida max"+ taula.ObtenirFactorCarrega());
        taula.InserirH(31865496, "Luke Skywalker");
        taula.InserirH(62359848, "Tony Stark");
        System.out.println("El factor de carrega sobrepassant la mida"+ taula.ObtenirFactorCarrega());
       
    }
}
