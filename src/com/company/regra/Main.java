package com.company.regra;

import com.company.regra.RegraContaCorrente;
import com.company.regra.RegraContaPai;

public class Main {

    //classes
    //banco

    public static void main(String[] args) {
	// write your code here

        RegraContaPai cc = new RegraContaCorrente();

        cc.depositar(100);
        RegraContaPai poupanca = new RegraPoupanca();



        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();


    }
}
