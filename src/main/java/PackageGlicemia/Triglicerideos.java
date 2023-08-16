package PackageGlicemia;

import java.util.Scanner;

public class Triglicerideos extends Exame{
    private double valorTriglicerideos;
    private String resultado;
    private int idade;

    Scanner scan = new Scanner(System.in);

    public double getValorTriglicerideos() {
        return valorTriglicerideos;
    }

    public void setValorTriglicerideos(double valorTriglicerideos) {
        this.valorTriglicerideos = valorTriglicerideos;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    @Override
    public void classificarResultado(){
        resultado = " Resultado: ";
        if (getIdade() >= 0 && getIdade() <= 9 && getValorTriglicerideos() < 75) {
            resultado = resultado + "Normal";
        } else if (getIdade() >= 10 && getIdade() <= 19 && getValorTriglicerideos() < 90) {
            resultado = resultado + "Normal.";
        } else if (getIdade() >= 20 && getValorTriglicerideos() < 150) {
            resultado = resultado + "Normal.";
        } else {
            resultado = resultado + "Triglicerideos altos!";
        }
    }

    @Override
    public void mostrarResultado() {
        System.out.println("Valor do exame de Glicemia: " + getValorTriglicerideos()+ " mg/l." + resultado);
    }

    @Override
    public void cadastrarExame() {
        System.out.println("Cadastro de Exame de Triglicerideos: ");
        System.out.println("Digite o nome do paciente: ");
        setNomePaciente(scan.nextLine());
        
        System.out.println("Digite ano de nascimento do paciente: ");
        setAnoNascimento(Integer.parseInt(scan.nextLine()));
        setIdade(2023 - getAnoNascimento());
        
        System.out.println("Digite o tipo sanguineo do paciente: ");
        setTipoSanguineo(scan.nextLine());

        System.out.println("Digite o valor em mg/l de Triglicerideos do paciente: ");
        setValorTriglicerideos(Double.parseDouble(scan.nextLine()));
    }
}
