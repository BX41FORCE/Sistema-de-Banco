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
public class Cliente extends Persona {

    private String numeroCuenta;
    private int saldo;
    private String tipoCuenta;
    private String transaccion;

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setTransaccion(String transaccion) {
        this.transaccion = transaccion;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public String getTransaccion() {
        return transaccion;
    }

    public Cliente(String tipoCuenta, String nombre, String apellido, String fecha) {
        super(nombre, apellido, fecha);
        String cuenta = "";
        for (int i = 0; i < 4; i++) {
            int numero = (int) (Math.random() * 10);
            String con = numero + "";
            cuenta += con;
        }
        this.saldo = 0;
        this.numeroCuenta = cuenta;
        this.tipoCuenta = tipoCuenta;
    }

}
