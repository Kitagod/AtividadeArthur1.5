package AtividadeArthur;

import java.util.ArrayList;
import java.util.List;

public class Vistoria {

    private Pessoa cliente;
    private List<Sedan> carroSedans = new ArrayList<>();
    private List<Esportivo> carroEsportivos = new ArrayList<>();
    private String tipoVistoria;

    public Vistoria(Pessoa cliente, String tipoVistoria){
        this.cliente = cliente;
        this.tipoVistoria = tipoVistoria;

    }

    public void setCarroEsportivos(Esportivo carroEsportivo) {
        carroEsportivos.add(carroEsportivo);
    }

    public void setCarroSedans(Sedan carroSedan) {
        carroSedans.add(carroSedan);
    }

    public List<Esportivo> getCarroEsportivos() {
        return carroEsportivos;
    }

    public List<Sedan> getCarroSedans() {
        return carroSedans;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public String getTipoVistoria() {
        return tipoVistoria;
    }

    @Override
    public String toString() {
        return "cliente: " + cliente + " tipo da vistoria: " + tipoVistoria;
    }



}