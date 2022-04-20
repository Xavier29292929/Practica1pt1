package Aplicacio;
import java.util.Iterator;

public class LListaDobleEncadIterada<T> implements Iterator<Node<T>>{
    private int posicio;
	private LlistaDobleEncad<T> llista;
    private Node<T> PosicioIterator;

    public LListaDobleEncadIterada(LlistaDobleEncad<T> llista){
        llista=this.llista;
        posicio = 0;
        PosicioIterator=llista.getInici();
    }

    @Override
    public boolean hasNext() {
        return (posicio<llista.getLongitud()) && PosicioIterator!=null;
    }

    @Override
    public Node<T> next() {
        PosicioIterator=llista.getInici().getSeg();
        int posi=0;
        while (posi != posicio && posicio<llista.getLongitud()){
            PosicioIterator= PosicioIterator.getSeg();
            posi++;
        }
        posicio++;
        return PosicioIterator;
    }
}
