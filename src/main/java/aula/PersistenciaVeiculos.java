import java.util.List;

public class PersistenciaVeiculos{
    private List<Veiculo> veiculos;

    public List<Veiculo> carregaVeiculos(){
        return this.veiculos;
    }

    public boolean persisteVeiculos(List<Veiculos> v){
        return true;
    }
}