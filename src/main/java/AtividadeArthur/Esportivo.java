package AtividadeArthur;

public class Esportivo extends Carros {

    private int potencia;

    public Esportivo(String tipo, String nome, String placa, int potencia){
        super(tipo,nome,placa);
        this.potencia = potencia;
    }

    public int getPotencia(){
        return potencia;
        
    }

    @Override
    public String toString() {
        return "Nome: " + super.getNome() + " Tipo: " + super.getTipo() + " Placa: " + super.getPlaca() + " Potencia: " + potencia;
    }
}
