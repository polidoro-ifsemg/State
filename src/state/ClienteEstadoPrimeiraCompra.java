package state;

public class ClienteEstadoPrimeiraCompra implements ClienteEstado{
    private ClienteEstadoPrimeiraCompra() {};
    private static ClienteEstadoPrimeiraCompra instance = new ClienteEstadoPrimeiraCompra();
    public static ClienteEstadoPrimeiraCompra getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Primeira compra";
    }

    @Override
    public String pagarDinheiro(Cliente cliente) {
        cliente.setEstado(ClienteEstadoComum.getInstance());
        return "Preço final sem alteração";
    }

    @Override
    public String pagarCartao(Cliente cliente) {
        cliente.setEstado(ClienteEstadoComum.getInstance());
        return "Preço final com acréscimo de taxa da bandeira";
    }

    @Override
    public String pagarParcelado(Cliente cliente) {
        return "Parcelamento até 6x";
    }

    @Override
    public String pagarDesconto(Cliente cliente) {
        return "Preço final com 10% de desconto";
    }

    @Override
    public String onOffFidelidade(Cliente cliente) {
        cliente.setEstado(ClienteEstadoFidelidade.getInstance());
        return "Cliente fidelizado";
    }
}
