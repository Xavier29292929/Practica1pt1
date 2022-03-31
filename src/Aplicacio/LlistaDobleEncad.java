package Aplicacio;

import Excepcions.NoTrobat;

import java.util.Iterator;

public class LlistaDobleEncad<T> implements Iterable<T>{
    private Node Inici;
    private Node Final;
    private int Longitud =0;

    public LlistaDobleEncad(){
        Inici=new Node();
        Final=new Node();
        Inici.seg=null;
        Final.ant=null;
    }

    public void InserirF(T C){
        Node node = new Node(C);
        Node rnode = Inici;

        if (Inici.seg==null){
            rnode.seg = node;
            rnode.seg.ant = null;
            Final.ant = node;
            Longitud++;
        }else {
            while (rnode.seg != null){
                rnode = rnode.seg;
            }
            rnode.seg = node;
            node.ant = rnode;
            Final.ant = node;
            Longitud++;
        }
    }

    public boolean Inserir(int posicio, T C){
        if (posicio<0 || posicio>=Longitud){
            return false;
        }
        Node node=new Node(C);
        Node prenode=this.TrobarAnt(posicio);
        node.seg=prenode.seg;
        prenode.seg.ant=node;
        prenode.seg=node;
        node.ant=prenode;
        Longitud++;
        return true;
    }

    public Node Trobar(int posicio){
        Node rnode = Inici;
        int dex = -1;
        while (rnode.seg != null){
            if (dex==posicio){
                return rnode;
            }
            rnode = rnode.seg;
            dex++;
        }
        if (dex == Longitud -1){
            return rnode;
        }
        return null;
    }

    public Node TrobarAnt(int posicio){
        Node rnode = Inici;
        int dex = -1;
        while (rnode.seg != null){
            if (dex == posicio-1){
                return rnode;
            }
            rnode = rnode.seg;
            dex++;
        }
        return null;
    }

    public T Obtenir(int posicio){
        Node Trobar = this.Trobar(posicio);
        return (T) Trobar.C;
    }

    public int Longitud(){
        return Longitud;
    }

    public int Buscar(T data) throws NoTrobat {
        int posicio=0;
        boolean Trobat=false;
        T dataTrobat=null;
        Node<T> nodePos=new Node();
        while (posicio<Longitud-1 && !Trobat){
            nodePos=nodePos.getSeg();
            dataTrobat=nodePos.getC();
            if (!dataTrobat.equals(data)){
                posicio++;
            }else{
                Trobat = true;
            }
        }
        if (!Trobat){
            throw new NoTrobat(Longitud);
        }
        return posicio;
    }

    public Object Esborrar(int posicio){
        Object ob = this.Obtenir(posicio);
        if (posicio<0 || posicio >= Longitud){
            return null;
        }
        if (posicio == Longitud - 1){
            Node prenode = this.TrobarAnt(posicio);
            this.Final.ant=this.Final.seg.seg;
            this.Final.ant.seg.ant = null;
            this.Final.ant.seg = null;
            Longitud--;
            return ob;
        }else {
            Node prenode = this.TrobarAnt(posicio);
            prenode.seg = prenode.seg.seg;
            prenode.seg.ant.seg = null;
            prenode.seg.ant = prenode.seg.ant.ant;
            Longitud--;
            return ob;
        }
    }

    @Override
    public Iterator<T> iterator() {
        LListaDobleEncadIterada<T> llista = new LListaDobleEncadIterada<>(this);
        return llista;
    }
}
