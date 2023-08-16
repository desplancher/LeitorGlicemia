package PackageGlicemia;

public class Principal { 
    public static void main(String[] args) {

        Glicemia exameGlicemia = new Glicemia();
        Triglicerideos exameTriglicerideos = new Triglicerideos();
        Colesterol exameColesterol = new Colesterol();
        
        exameGlicemia.cadastrarExame();
        exameGlicemia.classificarResultado();
        exameGlicemia.mostrarResultado();
        
        exameTriglicerideos.cadastrarExame();
        exameTriglicerideos.classificarResultado();
        exameTriglicerideos.mostrarResultado();
        
        exameColesterol.cadastrarExame();
        exameColesterol.classificarResultado();
        exameColesterol.mostrarResultado();  
    }
}
