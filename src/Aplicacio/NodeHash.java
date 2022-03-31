package Aplicacio;

import java.util.Map;

public class NodeHash<K extends Comparable<K>, T extends Comparable> {
    K key; //DNI
    T value; //Ciutada
    NodeHash<K,T> next;

    public NodeHash(K key, T value, NodeHash<K,T> next){
        this.key=key;
        this.value=value;
        this.next=next;
    }
}
