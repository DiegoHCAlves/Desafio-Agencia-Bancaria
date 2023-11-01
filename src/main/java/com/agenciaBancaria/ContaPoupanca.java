package com.agenciaBancaria;

public class ContaPoupanca extends Conta {

    private static int SEQUENCIAL = 1000;

    public ContaPoupanca() {
        super.agencia = Conta.AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++;
    }

}
