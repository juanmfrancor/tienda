package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.model.*;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Tienda tienda = new Tienda("technologi", "29839208","31029903" );

        Cliente cliente1= new Cliente("1090276007",
                "juan",tienda,"3144933157","juan@gg","tebaida");

        String mensajeResultado=tienda.registrarCliente(cliente1);

        JOptionPane.showMessageDialog(null,mensajeResultado);

        Factura factura1= new Factura("12902","23/0733",23333, EstadoFactura.PAGADA, MetodoPago.EFECTIVO,cliente1,"kkkkkkkkkkkkk");

        }
    }

