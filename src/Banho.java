import java.util.Objects;

public class Banho extends ServicosPetShop{
    private TamanhoPelo tamanhoPelo;

    public Banho(int codigo, Tamanho tamanho, TamanhoPelo tamanhoPelo) {
        super(codigo, tamanho);
        this.tamanhoPelo = tamanhoPelo;
    }

    @Override
    public double calculaPreco() {
        switch (getTamanho()){
            case PEQUENO:{
                return valorAnimalPequeno();
            }
            case MEDIO:{
                return valorAnimalMedio();
            }
            case GRANDE:{
                return valorAnimalGrande();
            }
        }
        return 0;
    }

    @Override
    public String descricao() {
        return "Serviço: Banho | " + "Animal: " + getTamanho() + " | Tamanho do Pelo: " + tamanhoPelo + " | Valor: R$ " + calculaPreco();
    }

    public TamanhoPelo getTamanhoPelo() {
        return tamanhoPelo;
    }

    public void setTamanhoPelo(TamanhoPelo tamanhoPelo) {
        this.tamanhoPelo = tamanhoPelo;
    }

    @Override
    public String toString() {
        return "Banho{" +
                "tamanhoPelo=" + tamanhoPelo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Banho banho = (Banho) o;
        return tamanhoPelo == banho.tamanhoPelo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tamanhoPelo);
    }

    private double valorAnimalGrande() {
        return switch (tamanhoPelo) {
            case CURTO -> 70.00;
            case MEDIO -> 85.00;
            case LONGO -> 95.00;
        };
    }

    private double valorAnimalMedio() {
        return switch (tamanhoPelo) {
            case CURTO -> 60.00;
            case MEDIO -> 75.00;
            case LONGO -> 85.00;
        };
    }

    private double valorAnimalPequeno() {
        return switch (tamanhoPelo) {
            case CURTO -> 50.00;
            case MEDIO -> 65.00;
            case LONGO -> 75.00;
        };
    }
}
