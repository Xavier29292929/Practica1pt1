package Aplicacio;

import java.util.Map;

public class NodeHash<K extends Comparable<K>, T extends Comparable> {
    private K clau; //DNI
    private T valor; //Ciutada
    NodeHash<K,T> next;

    public NodeHash(K clau, T valor, NodeHash<K,T> next){
        this.clau=clau;
        this.valor=valor;
        this.next=next;
    }
}
