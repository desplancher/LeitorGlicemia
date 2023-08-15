
package PackageGlicemia;

public class Glicemia {
    private double valorGlicose;

    public double getValorGlicose() {
        return valorGlicose;
    }

    public void setValorGlicose(double valorGlicose) {
        this.valorGlicose = valorGlicose;
    }
    
    public void classificarResultado(){
        System.out.println("Resultado: ");
        if (getValorGlicose() < 100) {
            System.out.print("Normoglicemia.");
        } else if (getValorGlicose() >= 100 || getValorGlicose() < 126) {
            System.out.print("Pré-diabetes.");
        } else {
            System.out.print("Diabates estabelecido.");
        }
    
    }
}
