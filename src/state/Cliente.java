package state;

public class Cliente {
    private ClienteEstado estado;

    public Cliente() {
        this.estado = ClienteEstadoPrimeiraCompra.getInstance();
    }

    public void setEstado(ClienteEstado estado) {
        this.estado = estado;
    }

    public String pagarCartao() {
        return estado.pagarCartao(this);
    }

    public String pagarDinheiro() {
        return estado.pagarCartao(this);
    }

    public String pagarDesconto() {
        return estado.pagarDesconto(this);
    }

    public String pagarParcelado() {
        return estado.pagarParcelado(this);
    }

    public String onOffFidelidade() {
        return estado.onOffFidelidade(this);
    }

}
