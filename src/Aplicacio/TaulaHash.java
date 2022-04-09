package Aplicacio;

public class TaulaHash<K extends Comparable<K>, T extends Comparable> {
    private NodeHash<K,T>[] table;
    private double FactorCarrega;
    private int CubsUtilitzats;

    public TaulaHash(){
        this.table = new NodeHash[3];
        this.FactorCarrega = 0.75;
        this.CubsUtilitzats = 0;
    }

    public void InserirH(K clau, T valor){
        double Fc = CubsUtilitzats*1.0/this.table.length;
        if (Fc > this.FactorCarrega){
            Redimensionat();
        }
        int index=clau.hashCode() % this.table.length;
        if(this.table[index] == null){
            this.table[index] = new NodeHash<>(clau, valor, null);
            this.CubsUtilitzats++;
        }else {
            NodeHash<K,T> cur = this.table[index];
            while (cur != null){
                if (cur.clau.compareTo(clau)== 0){
                    cur.valor=valor;
                    break;
                }
                cur = cur.seg;
            }
            if (cur == null){
                this.table[index] = new NodeHash<>(clau, valor, this.table[index]);
            }
        }
    }

    public T Obtenir(K clau){
        int index = clau.hashCode() % this.table.length;
        if (this.table[index] == null) {
            return null;
        }else {
            NodeHash<K,T> cur = this.table[index];
            while (cur != null){
                if (cur.clau.compareTo(clau) == 0){
                    return cur.valor;
                }
                cur = cur.seg;
            }
            return null;
        }
    }

    public void Esborrar(K clau){
        int index = clau.hashCode() % this.table.length;
        if (this.table[index] == null){
            return;
        }else {
            NodeHash<K,T> ant = null;
            NodeHash<K,T> cur = this.table[index];
            while (cur != null){
                if (cur.clau.compareTo(clau) == 0){
                    if (ant == null){
                        this.table[index] = cur.seg;
                    }else {
                        ant.seg = cur.seg;
                    }
                    if (this.table[index] == null){
                        this.CubsUtilitzats--;
                    }
                    return;
                }
                ant = cur;
                cur = cur.seg;
            }
        }
    }

    private void Redimensionat() {
        NodeHash<K,T>[] antigaTable = this.table;
        this.CubsUtilitzats = 0;
        this.table= new NodeHash[2*antigaTable.length];

        for (int i=0; i < antigaTable.length; i++){
            NodeHash<K,T> cur = antigaTable[i];
            while (cur != null){
                this.InserirH(cur.clau, cur.valor);
                cur = cur.seg;
            }
        }
    }

    public double ObtenirFactorCarrega(){
        double fc = CubsUtilitzats * 1.0 / this.table.length;
        return fc;
    }

}
