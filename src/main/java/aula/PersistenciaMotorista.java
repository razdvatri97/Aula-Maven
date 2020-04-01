import java.util.List;

public class PersistenciaMotorista {
    private List<Motorista> motoristas;
    
    public List<Motorista> carregaMotoristas(){
        return this.motoristas;
    }

    public boolean persisteMotoristas(List<Motorista> motoristas){
    return true;
    }

}