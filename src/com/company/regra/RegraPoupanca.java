package com.company.regra;

public class RegraPoupanca extends RegraContaPai{
    public RegraPoupanca(RegraCliente cliente){
    super(cliente);
    }

    public RegraPoupanca() {
        super();
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor);
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor);
    }

    @Override
    public void transferir(double valor, RegraContaPai contaDestino) {
        super.transferir(valor, contaDestino);
    }

    @Override
    public void imprimirExtrato() {

    }
}

