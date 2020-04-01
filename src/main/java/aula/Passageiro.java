public class Passageiro{

    private String CPF;
    private String Nome;
    private FormaPagamento FormaPagto;
    private String NroCartao;

    public Passageiro(){
        
    }

    public Passageiro(String CPF, String Nome, FormaPagamento FormaPagto, String NroCartao){
        this.CPF = CPF;
        this.Nome = Nome;
        this.FormaPagto = FormaPagto;
        this.NroCartao = NroCartao;
    }

    public String getCPF() {
        return CPF;
    }

    public String getNome() {
        return Nome;
    }
    
    public FormaPagamento getFormaPagto() {
        return FormaPagto;
    } 
}