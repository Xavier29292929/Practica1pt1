package Excepcions;


public class NoTrobat extends Exception{
    private static final long serialVersionUID=1L;

    public NoTrobat(int longitud){
        super("Error: No s'ha trobat");
    }
}
