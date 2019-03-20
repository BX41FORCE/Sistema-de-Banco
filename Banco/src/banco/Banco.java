/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import banco.views.index;
import javax.swing.JOptionPane;

/**
 *
 * @author bcortez
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Cliente cliente = new Cliente("corriente", "Bryan", "Cortez", "hoy");
        System.out.print(cliente.getNumeroCuenta());*/
        JOptionPane.showMessageDialog(null, "Bienvenido recuerde llenar cada uno de los campos solicitados en el sistema");
        index f = new index();
        f.setVisible(true);
    }

}
