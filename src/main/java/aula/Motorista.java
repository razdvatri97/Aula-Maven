public class Motorista{

    private String cpf;
    private String nome;
    private Veiculo veiculos;
    private FormaPagamento formaPagamento;
    

    public Motorista() {

    }

    public Motorista(String cpf, String nome, Veiculo veiculos, FormaPagamento formaPagamento){
        this.cpf = cpf;
        this.nome = nome;
        this.veiculos = veiculos;
        this.formaPagamento = formaPagamento;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public Veiculo getVeiculos() {
        return veiculos;
    }

    public FormaPagamento getForma(){
        return formaPagamento;
    }
    
}