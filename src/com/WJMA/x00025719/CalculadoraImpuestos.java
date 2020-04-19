
package com.WJMA.x00025719;

import javax.swing.*;
import javax.swing.text.html.parser.Parser;
import java.awt.*;

public final class CalculadoraImpuestos {
    private static double totalRenta;
    private static double totalISSS;
    private static double totalAFP;

    private CalculadoraImpuestos(){
    }

    public static double calcularPago(Empleado n){
        if(n instanceof ServicioProfesional){
            String nombre = n.getNombre();
            JOptionPane.showMessageDialog(null, "NOMBRE: " + nombre, "CALCULADORA SALARIO ", JOptionPane.INFORMATION_MESSAGE);
            String puesto = n.getPuesto();
            JOptionPane.showMessageDialog(null, "PUESTO: " + puesto, "CALCULADORA SALARIO ", JOptionPane.INFORMATION_MESSAGE);
            double auxSalario = n.getSalario();
            JOptionPane.showMessageDialog(null, "Salario antes del descuento: " + "$ " + auxSalario, "CALCULADORA SALARIO ", JOptionPane.INFORMATION_MESSAGE);
            double totalRenta = auxSalario * 0.1;
            JOptionPane.showMessageDialog(null, "La renta es: " + "$ " + totalRenta, "CALCULADORA SALARIO ", JOptionPane.INFORMATION_MESSAGE);
            double salarioT = auxSalario - totalRenta;
            JOptionPane.showMessageDialog(null, "EL SALARIO NETO ES:  ", "CALCULADORA SALARIO ", JOptionPane.INFORMATION_MESSAGE);
            return salarioT;

        }
        else {
            String nombre = n.getNombre();
            JOptionPane.showMessageDialog(null, "NOMBRE: " + nombre, "CALCULADORA SALARIO ", JOptionPane.INFORMATION_MESSAGE);
            String puesto = n.getPuesto();
            JOptionPane.showMessageDialog(null, "PUESTO: " + puesto,"CALCULADORA SALARIO ", JOptionPane.INFORMATION_MESSAGE);
            double auxSalario2 = n.getSalario();
            JOptionPane.showMessageDialog(null, "Salario antes de los descuentos: " + auxSalario2, "CALCULADORA SALARIO ", JOptionPane.INFORMATION_MESSAGE);
            double AFP =  auxSalario2 * 0.0625;
            totalAFP = AFP;
            JOptionPane.showMessageDialog(null, "AFP: " + "$ " + AFP, "CALCULADORA SALARIO ", JOptionPane.INFORMATION_MESSAGE);
            double ISSS = auxSalario2 * 0.03;
            totalISSS = ISSS;
            JOptionPane.showMessageDialog(null, "ISSS: " + "$ " + ISSS, "CALCULADORA SALARIO ", JOptionPane.INFORMATION_MESSAGE);
            double auxRestante =  auxSalario2 - AFP - ISSS;
            if(auxRestante > 0.01 && auxRestante < 472.00){
                JOptionPane.showMessageDialog(null, "TRAMO A: ", "CALCULADORA SALARIO ", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "El salario neto es: ", "CALCULADORA SALARIO ", JOptionPane.INFORMATION_MESSAGE);
                return auxRestante;
            }
            else if(auxRestante > 472.1 && auxRestante < 895.24 ){
                JOptionPane.showMessageDialog(null, "TRAMO B: ", "CALCULADORA SALARIO ", JOptionPane.INFORMATION_MESSAGE);
                double auxRenta = (0.1 * (auxRestante - 472) + 17.67);
                totalRenta = auxRenta;
                JOptionPane.showMessageDialog(null, "El total de renta es: " + auxRenta, "CALCULADORA SALARIO ", JOptionPane.INFORMATION_MESSAGE);
                double auxTotal = auxRestante - auxRenta;
                JOptionPane.showMessageDialog(null, "El salario neto es: ", "CALCULADORA SALARIO ", JOptionPane.INFORMATION_MESSAGE);
                return auxTotal;
            }
            else if(auxRestante > 895.25 && auxRestante < 2038.10){

                JOptionPane.showMessageDialog(null, "TRAMO C: ", "CALCULADORA SALARIO ", JOptionPane.INFORMATION_MESSAGE);
                double auxRenta = (0.2 * (auxRestante - 895.24) + 60 );
                totalRenta = auxRenta;
                JOptionPane.showMessageDialog(null, "El total de renta es: " + auxRenta, "CALCULADORA SALARIO ", JOptionPane.INFORMATION_MESSAGE);
                double auxTotal = auxRestante - auxRenta;
                JOptionPane.showMessageDialog(null, "El salario neto es: ", "CALCULADORA SALARIO ", JOptionPane.INFORMATION_MESSAGE);
                return auxTotal;
            }
            else if(auxRestante > 2038.11){

                JOptionPane.showMessageDialog(null, "TRAMO D: ", "CALCULADORA SALARIO ", JOptionPane.INFORMATION_MESSAGE);
                double auxRenta = (0.3 * (auxRestante - 2038.10) + 288.57 );
                totalRenta = auxRenta;
                JOptionPane.showMessageDialog(null, "El total de renta es: " + auxRenta, "CALCULADORA SALARIO ", JOptionPane.INFORMATION_MESSAGE);
                double auxTotal = auxRestante - auxRenta;
                JOptionPane.showMessageDialog(null, "El salario neto es: ","CALCULADORA SALARIO ", JOptionPane.INFORMATION_MESSAGE);

                return auxTotal;
            }
        return 0;
        }







    }

    public static String mostrarTotales(){
        String message, message2 = "";
        String totalRentaString = Double.toString(totalRenta);
        String totalAFPString = Double.toString(totalAFP);
        String totalISSSstring = Double.toString(totalISSS);
        double total = totalRenta + totalAFP + totalISSS;
        String totalString = Double.toString(total);

        message = "RENTA: " + "$ " + totalRentaString + "\n" + "AFP: " + "$ " + totalAFPString + "\n" + "ISSS: " + "$ " + totalISSSstring + "\n" ;

        message2 = "El total de los descuentos realizados es: " + totalString;

        return message + message2;



    }




}