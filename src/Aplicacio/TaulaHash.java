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

    public void InserirH(K key, T value){
        double Fc = CubsUtilitzats*1.0/this.table.length;
        if (Fc > this.FactorCarrega){
            Redimensionat();
        }
    }

    private void Redimensionat() {
    }

}
