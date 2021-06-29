package state;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

class ClienteTest {

    Cliente cliente;

    @BeforeEach
    public void setUp() {
        cliente = new Cliente();
    }

    // Aluno matriculado

    @Test
    public void deveFidelizarCliente() {
        cliente.setEstado(ClienteEstadoComum.getInstance());
        assertEquals("Cliente fidelizado", cliente.onOffFidelidade());
    }

    @Test
    void pagarCartao() {
        cliente.setEstado(ClienteEstadoFidelidade.getInstance());
        assertEquals("Preço final com acréscimo de taxa da bandeira", cliente.pagarCartao());
    }

    @Test
    void pagarDinheiro() {
        cliente.setEstado(ClienteEstadoFidelidade.getInstance());
        assertEquals("Preço final com acréscimo de taxa da bandeira", cliente.pagarCartao());
    }

    @Test
    void pagarDescontoPrimeiraCompra() {
        cliente.setEstado(ClienteEstadoPrimeiraCompra.getInstance());
        assertEquals("Preço final com 10% de desconto", cliente.pagarDesconto());
    }

    @Test
    void pagarDescontoClienteComum() {
        cliente.setEstado(ClienteEstadoComum.getInstance());
        assertEquals("Preço final sem desconto", cliente.pagarDesconto());
    }

    @Test
    void pagarDescontoClienteFidelidade() {
        cliente.setEstado(ClienteEstadoFidelidade.getInstance());
        assertEquals("Preço final com 10% de desconto", cliente.pagarDesconto());
    }

    @Test
    void pagarParceladoClienteComum() {
        cliente.setEstado(ClienteEstadoComum.getInstance());
        assertEquals("Parcelamento até 6x", cliente.pagarParcelado());
    }

    @Test
    void pagarParceladoClienteFidelidade() {
        cliente.setEstado(ClienteEstadoFidelidade.getInstance());
        assertEquals("Parcelamento até 12x", cliente.pagarParcelado());
    }

    @Test
    void onOffFidelidadeClienteComum() {
        cliente.setEstado(ClienteEstadoComum.getInstance());
        assertEquals("Cliente fidelizado", cliente.onOffFidelidade());
    }
}