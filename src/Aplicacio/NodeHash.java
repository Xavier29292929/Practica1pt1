package Aplicacio;

public class NodeHash<K extends Comparable<K>, T extends Comparable> {
    public K clau; //DNI
    public T valor; //Ciutada
    NodeHash<K,T> seg;

    public NodeHash(K clau, T valor, NodeHash<K,T> next){
        this.clau=clau;
        this.valor=valor;
        this.seg =next;
    }
}
