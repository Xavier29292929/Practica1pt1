package Aplicacio;
import java.util.Iterator;

public class LListaDobleEncadIterada<T> implements Iterator<T>{
    private LlistaDobleEncad<T> llista;
    private Node<T> PosicioIterator;

    public LListaDobleEncadIterada(LlistaDobleEncad<T> llista){
        Node<T> node;
    }

    @Override
    public boolean hasNext() {
        if (PosicioIterator==null){
            return false;
        }
        if (PosicioIterator!=null){
            return true;
        }
        return false;
    }

    @Override
    public T next() {
        T dades=PosicioIterator.getC();
        PosicioIterator=PosicioIterator.getSeg();
        return dades;
    }
}
