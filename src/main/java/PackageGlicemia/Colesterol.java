package PackageGlicemia;

import java.util.Scanner;

public class Colesterol extends Exame{
    private double valorColesterolHDL;
    private double valorColesterolLDL;

    private String resultadoHDL;        
    private String resultadoLDL;
    private int idade;
    private int riscoPacienteInt;
    private String riscoPacienteString;

    Scanner scan = new Scanner(System.in);

    public double getValorColesterolHDL() {
        return valorColesterolHDL;
    }

    public void setValorColesterolHDL(double valorColesterolHDL) {
        this.valorColesterolHDL = valorColesterolHDL;
    }

    public double getValorColesterolLDL() {
        return valorColesterolLDL;
    }

    public void setValorColesterolLDL(double valorColesterolLDL) {
        this.valorColesterolLDL = valorColesterolLDL;
    }  

    public int getRiscoPacienteInt() {
        return riscoPacienteInt;
    }

    public void setRiscoPacienteInt(int riscoPacienteInt) {
        this.riscoPacienteInt = riscoPacienteInt;
    }

    public String getRiscoPacienteString() {
        return riscoPacienteString;
    }

    public void setRiscoPacienteString(String riscoPacienteString) {
        this.riscoPacienteString = riscoPacienteString;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    @Override
    public void classificarResultado(){
        resultadoHDL = " Resultado HDL: ";
        if (getIdade() >= 0 && getIdade() <= 19 && getValorColesterolHDL() > 45) {
            resultadoHDL = resultadoHDL + "Bom";
        } else if (getIdade() >= 20 && getValorColesterolHDL() > 40) {
            resultadoHDL = resultadoHDL + "Bom.";   
        } else {
            resultadoHDL = resultadoHDL + "Niveís baixos!";
        }
        
        resultadoLDL = " Resultado LDL: ";
        if (riscoPacienteInt == 1 && getValorColesterolLDL() < 100) {
            resultadoLDL = resultadoLDL + "Bom.";
        } else if (riscoPacienteInt == 2 && getValorColesterolLDL() < 70) {
            resultadoLDL = resultadoLDL + "Bom.";   
        } else if (riscoPacienteInt == 3 && getValorColesterolLDL() < 50){
            resultadoLDL = resultadoLDL + "Bom.";    
        } else {
            resultadoLDL = resultadoLDL + "Niveís Altos!";
        }
        
    }

    @Override
    public void mostrarResultado() {
        System.out.println("Valor do exame de Colesterol HDL: " + getValorColesterolHDL()+ " mg/dL." + resultadoHDL);
        System.out.println("Valor do exame de Colesterol LDL: " + getValorColesterolLDL()+ " mg/dL." + resultadoLDL);
    }

    @Override
    public void cadastrarExame() {
        System.out.println("Cadastro de Exame de Colesterol: ");
        System.out.println("Digite o nome do paciente: ");
        setNomePaciente(scan.nextLine());
        
        System.out.println("Digite ano de nascimento do paciente: ");
        setAnoNascimento(Integer.parseInt(scan.nextLine()));
        setIdade(2023 - getAnoNascimento());
        
        System.out.println("Digite o tipo sanguineo do paciente: ");
        setTipoSanguineo(scan.nextLine());

        System.out.println("Digite o valor em mg/dL de Colesterol HDL do paciente: ");
        setValorColesterolHDL(Double.parseDouble(scan.nextLine()));
        
        System.out.println("Digite o valor em mg/dL de Colesterol LDL do paciente: ");
        setValorColesterolLDL(Double.parseDouble(scan.nextLine()));
        
        System.out.println("Selecione o risco do paciente: ");
        System.out.println("Digite 1 para: B - baixo.");
        System.out.println("Digite 2 para: M - medio.");
        System.out.println("Digite 3 para: A - alto.");
        setRiscoPacienteInt(Integer.parseInt(scan.nextLine()));
    }
}