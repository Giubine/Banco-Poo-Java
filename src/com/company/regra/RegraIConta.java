package com.company.regra;

import com.company.polimorfismo.PolimorfismoContaPai;

public interface RegraIConta {

     default void sacar(double valor){
    }
    default void depositar(double valor){

    }

    default void transferir(double valor, RegraContaPai contaDestino){
    }

    //criando um método proprio para a impress"ao de extrato
    void imprimirExtrato();
}
