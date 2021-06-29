package state;

public class ClienteEstadoFidelidade implements ClienteEstado{
    private ClienteEstadoFidelidade() {};
    private static ClienteEstadoFidelidade instance = new ClienteEstadoFidelidade();
    public static ClienteEstadoFidelidade getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Cliente fidelidade";
    }

    @Override
    public String pagarDinheiro(Cliente cliente) {
        return "Preço final sem alteração";
    }

    @Override
    public String pagarCartao(Cliente cliente) {
        return "Preço final com acréscimo de taxa da bandeira";
    }

    @Override
    public String pagarParcelado(Cliente cliente) {
        return "Parcelamento até 12x";
    }

    @Override
    public String pagarDesconto(Cliente cliente) {
        return "Preço final com 10% de desconto";
    }

    @Override
    public String onOffFidelidade(Cliente cliente) {
        cliente.setEstado(ClienteEstadoComum.getInstance());
        return "Cliente desfidelizado";
    }
}
