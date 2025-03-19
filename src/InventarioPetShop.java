import java.util.ArrayList;
import java.util.List;

public class InventarioPetShop  {
    private List<ServicosPetShop> servico = new ArrayList<>();

    public void adicionaServico(ServicosPetShop servicosPetShop){
        servico.add(servicosPetShop);
    }

    public double calculaValorServico() {
        double valorTotal = 0;
        for (ServicosPetShop s : servico){
           valorTotal += s.calculaPreco();
        }
        return valorTotal;
    }

    public String listaServicos() {
        String servicos = "";
        for (ServicosPetShop s : servico){
            servicos += s.descricao() + "\n";
        }
        return servicos;
    }

    public String descricaoServico(ServicosPetShop servico){
        return servico.descricao();
    }

}
