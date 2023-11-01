package com.agenciaBancaria;

public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta poupanca = new ContaPoupanca();

        cc.depositar(1000);
        poupanca.depositar(1500);

        cc.sacar(200);
        poupanca.sacar(200);

        cc.transferir(150,poupanca);
        poupanca.transferir(200,cc);


        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
