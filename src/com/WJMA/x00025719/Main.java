package com.WJMA.x00025719;


import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, " BIENVENIDO!\n ","CALCULADORA SALARIO", JOptionPane.WARNING_MESSAGE );
        JOptionPane.showMessageDialog(null, "Ingrese los datos que se le piden!\n", "CALCULADORA SALARIO", JOptionPane.WARNING_MESSAGE);
        int op = 0;
        do {
            op = Byte.parseByte(JOptionPane.showInputDialog(null, "1. SERVICIO PROFESIONAL\n2. PLAZA FIJA\n0. SALIR"));
            switch (op) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Saliendo...", "CALCULADORA SALARIO", JOptionPane.WARNING_MESSAGE);
                    break;
                case 1:

                    String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre: ");
                    String puesto = JOptionPane.showInputDialog(null, "Ingrese el servicio: ");
                    double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el salario: "));
                    int meses = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese los meses de contrato: "));

                    ServicioProfesional servicio = new ServicioProfesional(nombre, puesto, salario, meses);
                    servicio.setMesesContrato(meses);
                    JOptionPane.showMessageDialog(null, "Los meses de contrato son: " + servicio.getMesesContrato() + " meses", "CALCULADORA SALARIO", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, CalculadoraImpuestos.calcularPago(servicio), "CALCULADORA SALARIO", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 2:

                    String nombre2 = JOptionPane.showInputDialog(null, "Ingrese el nombre: ");
                    String puesto2 = JOptionPane.showInputDialog(null, "Ingrese el puesto del empleado: ");
                    double salario2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el salario del empleado: "));
                    int extension = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de extension: "));

                    PlazaFija plaza = new PlazaFija(nombre2, puesto2, salario2, extension);
                    plaza.setExtension(extension);
                    JOptionPane.showMessageDialog(null, "El numero de extension es: " + plaza.getExtension(), "CALCULADORA SALARIO", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, CalculadoraImpuestos.calcularPago(plaza), "CALCULADORA SALARIO", JOptionPane.INFORMATION_MESSAGE);

                    JOptionPane.showMessageDialog(null, CalculadoraImpuestos.mostrarTotales(), "CALCULADORA SALARIO", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida, intente con otra!", "CALCULADORA SALARIO", JOptionPane.WARNING_MESSAGE);
                    break;

            }
        }while (op != 0);


    }







}

