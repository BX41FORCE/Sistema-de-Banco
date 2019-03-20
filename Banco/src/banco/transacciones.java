/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author bcortez
 */
public class transacciones {

    private String tipo;
    private String cuenta;
    private String depositante;
    private int saldo;
    private String tipoCuenta;
    private String titular;
    private String empleado;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getEmpleado() {
        return empleado;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getDepositante() {
        return depositante;
    }

    public void setDepositante(String depositante) {
        this.depositante = depositante;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public transacciones(String tipo, String cuenta, String depositante, int saldo, String tipoCuenta, String titular, String empleado) {
        this.tipo = tipo;
        this.cuenta = cuenta;
        this.depositante = depositante;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
        this.titular = titular;
        this.empleado = empleado;
    }

}
