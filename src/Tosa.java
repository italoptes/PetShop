public class Tosa extends ServicosPetShop{
    public Tosa(int codigo, Tamanho tamanho) {
        super(codigo, tamanho);
    }

    @Override
    public double calculaPreco() {
        return switch (getTamanho()){
            case PEQUENO -> 30.00;
            case MEDIO -> 40.00;
            case GRANDE -> 50.00;
        };
    }

    @Override
    public String descricao() {
        return "Tosa.  Animal: " + getTamanho()  + ", Valor: " + calculaPreco();
    }

    @Override
    public String toString() {
        return "Tosa{}";
    }
}
