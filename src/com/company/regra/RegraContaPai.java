package com.company.regra;

public class RegraContaPai implements RegraIConta{
    protected int agencia;
    protected int contaNumero;
    protected double saldo;

    protected static final int AGENCIA_PADRAO =001;
    private static int SEQUENCIAL =1;

    public RegraContaPai(RegraCliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.contaNumero = SEQUENCIAL++;
        this cliente = RegraCliente;

        @Override
        default void sacar(double valor;){
            saldo -= valor;
        }
        @Override
        default void depositar(double valor;){
            saldo += valor;
        }

        @Override
        default void transferir(double valor, RegraContaPai contaDestino);{
            this.sacar(valor);
            contaDestino.depositar(valor);
        }

        //criar um metodo protegido na clase pai para usar nas classses herdeiras
        protected void imprimirInfoComuns() {
            System.out.println("Extrato conta corrente");
            System.out.println((String.format("Agencia: %D", this.agencia)));
            System.out.println((String.format("Numero de Conta: %D", this.contaNumero)));
            System.out.println((String.format("Saldo: %2f", this.saldo)));


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

    public RegraContaPai() {

    }




