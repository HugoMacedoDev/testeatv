public class ProcessadorPagamento {

    private Pagamento pagamento;

    public ProcessadorPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void processar(double valor) {
        pagamento.pagar(valor);
    }
}