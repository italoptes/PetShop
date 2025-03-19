import java.time.LocalDate;
import java.util.Objects;

public abstract class ServicosPetShop implements ServicosPetShopIF{
    private LocalDate data;
    private int codigo;
    private Tamanho tamanho;

    public ServicosPetShop(int codigo, Tamanho tamanho) {
        this.data = LocalDate.now();
        this.codigo = codigo;
        this.tamanho = tamanho;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public abstract double calculaPreco();

    @Override
    public abstract String descricao();

    @Override
    public String toString() {
        return "ServicosPetShop{" +
                "data=" + data +
                ", codigo=" + codigo +
                ", tamanho=" + tamanho +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ServicosPetShop that = (ServicosPetShop) o;
        return codigo == that.codigo && Objects.equals(data, that.data) && tamanho == that.tamanho;
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, codigo, tamanho);
    }
}

