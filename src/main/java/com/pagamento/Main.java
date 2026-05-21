import com.pagamento.collection.ListaPagamentos;
import com.pagamento.iterator.PagamentoIterator;
import com.pagamento.model.Pagamento;

public class Main {
    public static void main(String[] args) {

        ListaPagamentos lista = new ListaPagamentos(5);

        lista.adicionarPagamento(new Pagamento("Pix", 150.00));
        lista.adicionarPagamento(new Pagamento("Cartão de Crédito", 320.50));
        lista.adicionarPagamento(new Pagamento("Boleto", 89.90));
        lista.adicionarPagamento(new Pagamento("Carteira Digital", 45.00));

        PagamentoIterator iterator = lista.createIterator();

        System.out.println("=== Lista de Pagamentos ===");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}