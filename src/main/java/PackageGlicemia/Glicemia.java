package PackageGlicemia;

import java.util.Scanner;

public class Glicemia extends Exame{
    private double valorGlicose;
    private String resultado;

    Scanner scan = new Scanner(System.in);
    
    public double getValorGlicose() {
        return valorGlicose;
    }

    public void setValorGlicose(double valorGlicose) {
        this.valorGlicose = valorGlicose;
    }
    
    @Override
    public void classificarResultado(){
        resultado = " Resultado: ";
        if (getValorGlicose() < 100) {
            resultado = resultado + "Normoglicemia.";
        } else if (getValorGlicose() >= 100 && getValorGlicose() < 126) {
            resultado = resultado + "Pré-diabetes.";
        } else {
            resultado = resultado + "Diabates estabelecido.";
        }
    }

    @Override
    public void mostrarResultado() {
        System.out.println("Valor do exame de Glicemia: " + getValorGlicose() + " mg/dL." + resultado);
    }

    @Override
    public void cadastrarExame() {
        System.out.println("Cadastro de Exame de Glicemia: ");
        System.out.println("Digite o nome do paciente: ");
        setNomePaciente(scan.nextLine());
        
        System.out.println("Digite ano de nascimento do paciente: ");
        setAnoNascimento(Integer.parseInt(scan.nextLine()));
        
        System.out.println("Digite o tipo sanguineo do paciente: ");
        setTipoSanguineo(scan.nextLine());
       
        System.out.println("Digite o valor em mg/dL de Glicose do paciente: ");
        setValorGlicose(Double.parseDouble(scan.nextLine()));
    }
}