package PackageGlicemia;

public class Principal { 
    
    public static void main(String[] args) {
        Glicemia exameGlicemia = new Glicemia();
        
        exameGlicemia.cadastrarExame();
        exameGlicemia.classificarResultado();
        exameGlicemia.mostrarResultado();
    }
}
