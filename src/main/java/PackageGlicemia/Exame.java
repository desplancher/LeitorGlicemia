package PackageGlicemia;

public abstract class Exame {
    private String nomePaciente;
    private String tipoSanguineo;
    private int anoNascimento;

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    
    public abstract void classificarResultado();
    
    public abstract void mostrarResultado();
    
    public abstract void cadastrarExame();   
}