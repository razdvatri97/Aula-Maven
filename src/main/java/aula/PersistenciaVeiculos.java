import java.util.List;

public class PersistenciaVeiculos extends Veiculo{
    private List<Veiculo> veiculos;

    public List<Veiculo> carregaVeiculos(){
        return this.veiculos;
    }

    public boolean persisteVeiculos(List<Veiculos> v){
        return true;
    }
}