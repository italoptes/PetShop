import java.util.Objects;

public class Hotelzinho extends ServicosPetShop{
    private int quantHoras;
    private final double HORAPEQUENO = 12.00;
    private final double HORAMEDIO = 18.00;
    private final double HORAGRANDE = 25.00;

    public Hotelzinho(int codigo, Tamanho tamanho, int quantHoras) {
        super(codigo, tamanho);
        this.quantHoras = quantHoras;
    }

    @Override
    public double calculaPreco() {
        return switch (getTamanho()){
            case PEQUENO -> HORAPEQUENO * quantHoras;
            case MEDIO -> HORAMEDIO * quantHoras;
            case GRANDE -> HORAGRANDE * quantHoras;
        };
    }

    @Override
    public String descricao() {
        return "Serviço: Hotelzinho | " + "Animal: " + getTamanho() + " | Quantidade de Horas: " + quantHoras + " | Valor: R$ " + calculaPreco();
    }

    public int getQuantHoras() {
        return quantHoras;
    }

    public void setQuantHoras(int quantHoras) {
        this.quantHoras = quantHoras;
    }

    @Override
    public String toString() {
        return "Hotelzinho{" +
                "quantHoras=" + quantHoras +
                ", HORAPEQUENO=" + HORAPEQUENO +
                ", HORAMEDIO=" + HORAMEDIO +
                ", HORAGRANDE=" + HORAGRANDE +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hotelzinho that = (Hotelzinho) o;
        return quantHoras == that.quantHoras && Double.compare(HORAPEQUENO, that.HORAPEQUENO) == 0 && Double.compare(HORAMEDIO, that.HORAMEDIO) == 0 && Double.compare(HORAGRANDE, that.HORAGRANDE) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), quantHoras, HORAPEQUENO, HORAMEDIO, HORAGRANDE);
    }
}
