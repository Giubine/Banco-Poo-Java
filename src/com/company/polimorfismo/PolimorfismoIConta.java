package com.company.polimorfismo;

public interface PolimorfismoIConta {

     default void sacar(double valor){
    }
     default void depositar(){
    }

     default void transferir(double valor, PolimorfismoContaPai contaDestino){
    }
}
