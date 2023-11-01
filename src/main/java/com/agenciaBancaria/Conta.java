package com.agenciaBancaria;

public abstract class Conta implements IConta {
    protected static final int AGENCIA_PADRAO = 2325-1;
    protected int agencia;
    protected int numero;
    protected double saldo;

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta ===");
        System.out.printf("Agencia: %d%n",this.agencia);
        System.out.printf("Numero: %d%n",this.numero);
        System.out.printf("Saldo: %.2f%n",this.saldo);
        System.out.println();
    }

}
