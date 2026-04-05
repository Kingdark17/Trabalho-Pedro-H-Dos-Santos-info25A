public class CursosIFCIbirama {

    private String nomeDisciplina;
    private String codigo;
    private int cargaHoraria;
    private String ementa;
    private String objetivoDeAprendizagem;

    // Construtor padrão
    public CursosIFCIbirama() {
        this.nomeDisciplina         = "nobody";
        this.codigo                 = "nobody";
        this.cargaHoraria           = 0;
        this.ementa                 = "nobody";
        this.objetivoDeAprendizagem = "nobody";
    }

    // Construtor com todos os dados
    public CursosIFCIbirama(String nomeDisciplina, String codigo, int cargaHoraria,
                            String ementa, String objetivoDeAprendizagem) {
        this.nomeDisciplina         = nomeDisciplina;
        this.codigo                 = codigo;
        this.cargaHoraria           = cargaHoraria;
        this.ementa                 = ementa;
        this.objetivoDeAprendizagem = objetivoDeAprendizagem;
    }

    // Getters e Setters
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }
    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getEmenta() {
        return ementa;
    }
    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public String getObjetivoDeAprendizagem() {
        return objetivoDeAprendizagem;
    }
    public void setObjetivoDeAprendizagem(String objetivoDeAprendizagem) {
        this.objetivoDeAprendizagem = objetivoDeAprendizagem;
    }
}
