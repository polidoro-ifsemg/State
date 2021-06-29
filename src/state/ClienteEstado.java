package state;

public interface ClienteEstado {
    public String pagarDinheiro(Cliente cliente);
    public String pagarCartao(Cliente cliente);
    public String pagarParcelado(Cliente cliente);
    public String pagarDesconto(Cliente cliente);
    public String onOffFidelidade(Cliente cliente);
}
