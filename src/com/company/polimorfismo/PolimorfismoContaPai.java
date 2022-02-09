package com.company.polimorfismo;


//poder referenciar os objetos de varias formas
//conta corrente como conta oou como conta corrente, se tiver algo especifico na conta corrente que eu precise acessar ou se for metodos genericos que estão na classse conta eu posso usar apenas a classe conta pois faz parte da hieerarquia dac onta corrente

public class PolimorfismoContaPai implements PolimorfismoIConta {

    //altrar de private para protected par que a classe pai consiga acessar os medtodos
    protected int agencia;
    protected int contaNumero;
    protected double saldo;

    // Criando uma nova constante na conta Pai para a utilização de sequencia de numeros de agencia.
    protected static final int AGENCIA_PADRAO =001;
    private static int SEQUENCIAL =1;
    public PolimorfismoContaPai(){
        this.agencia = AGENCIA_PADRAO;
        this.contaNumero = SEQUENCIAL++; // criar uma constante no java = objeto estatico, sendo controlado apenas por essa classe.
    }

    @Override
    public void sacar(double valor) {
    }

    @Override
    public void depositar() {
    }
    @Override
    public void transferir(double valor, PolimorfismoContaPai contaDestino) {

    }
    ///////////
    public int getAgencia() {return agencia;}

    public int getContaNumero() {
        return contaNumero;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setContaNumero(int contaNumero) {
        this.contaNumero = contaNumero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
}

