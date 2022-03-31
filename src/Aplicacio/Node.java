package Aplicacio;

public class Node<T> {
    public T C;
    public Node seg;
    public Node ant;
    public Node(){}

    public Node(T C){
        this.C=C;
        seg=null;
        ant=null;
    }

    public T getC() {
        return C;
    }

    public void setC(T c) {
        C = c;
    }

    public Node getSeg() {
        return seg;
    }

    public void setSeg(Node seg) {
        this.seg = seg;
    }

    public Node getAnt() {
        return ant;
    }

    public void setAnt(Node ant) {
        this.ant = ant;
    }
}
