public class Veiculo{
    private String placa;
    private String marca;
    private String cor;
    private String categoria;

    public Veiculo(){

    }

    public Veiculo(String p, String m, String cor, String cat){
        this.placa = p;
        this.marca = m;
        this.cor = cor;
        this.categoria = cat;
    }

    public String getPlaca() {
        return this.placa;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getCor() {
        return this.cor;
    }

    public String getCategoria() {
        return this.categoria;
    }

    @Override
    public String toString() {
        return "Veiculo [Categoria=" + categoria 
                + ", Cor=" + cor 
                + ", Marca=" + marca 
                + ", Placa=" + placa 
                + "]";
    }

}