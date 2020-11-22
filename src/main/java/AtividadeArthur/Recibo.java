package AtividadeArthur;

import java.util.UUID;

public class Recibo {
    private String id;
    private String dataVistoria;
    private Vistoria vistoria;


    public Recibo(String dataVistoria, Vistoria vistoria){
        this.dataVistoria = dataVistoria;
        this.id = UUID.randomUUID().toString();
        this.vistoria = vistoria;
    }

    public String getDataVistoria() {
        return dataVistoria;
    }

    public String getId() {
        return id;
    }

    public Vistoria getVistoria() {
        return vistoria;
    }

    @Override
    public String toString() {
        return "Id: " + id + " Cliente: " + vistoria.getCliente().getNome() + " Data da vistoria: " + dataVistoria;
    } 
}