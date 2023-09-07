/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miprimerproyecto2.pkg0;

/**
 *
 * @author 56998
 */
public class Tarjeta {
    private int numero;
    private int cvv;
    private int saldo;
    private int lineaCredito;
    private boolean estado;

    public Tarjeta() {
    }

    public Tarjeta(int numero, int cvv, int saldo, int lineaCredito, boolean estado) {
        this.numero = numero;
        this.cvv = cvv;
        this.saldo = saldo;
        this.lineaCredito = lineaCredito;
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getLineaCredito() {
        return lineaCredito;
    }

    public void setLineaCredito(int lineaCredito) {
        this.lineaCredito = lineaCredito;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Tarjeta{" + "numero=" + numero + ", cvv=" + cvv + ", saldo=" + saldo + ", lineaCredito=" + lineaCredito + ", estado=" + estado + '}';
    }
    
}
