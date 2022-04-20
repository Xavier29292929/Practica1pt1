package Aplicacio;


public class Ciutada implements Comparable<Ciutada>{
    public String Nom;
    public String Cognom;
    public String DNI;

    public Ciutada(String Nom, String Cognom, String DNI){
        this.Nom=Nom;
        this.Cognom=Cognom;
        this.DNI=DNI;
    }
    
    
    @Override
	public String toString() {
		return "Ciutada [Nom=" + Nom + ", Cognom=" + Cognom + ", DNI=" + DNI + "]";
	}


	@Override
    public int compareTo(Ciutada o) {
        if (this.DNI == o.DNI){
            return 0;
        }else {
         return 1;
        }
    }
}
