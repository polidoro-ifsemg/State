package state;

public class ClienteEstadoComum implements ClienteEstado{
    private ClienteEstadoComum() {};
    private static ClienteEstadoComum instance = new ClienteEstadoComum();
    public static ClienteEstadoComum getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Cliente comum";
    }

    @Override
    public String pagarDinheiro(Cliente cliente){
        return "Preço final sem alteração";
    }

    @Override
    public String pagarCartao(Cliente cliente){
        return "Preço final com acréscimo de taxa da bandeira";
    }

    @Override
    public String pagarParcelado(Cliente cliente){
        return "Parcelamento até 6x";
    }

    @Override
    public String pagarDesconto(Cliente cliente){
        return "Preço final sem desconto";
    }

    @Override
    public String onOffFidelidade(Cliente cliente){
        cliente.setEstado(ClienteEstadoFidelidade.getInstance());
        return "Cliente fidelizado";
    }
}
