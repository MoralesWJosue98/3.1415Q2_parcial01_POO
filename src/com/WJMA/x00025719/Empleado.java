package com.WJMA.x00025719;

public abstract class Empleado {
    protected String Nombre;
    protected String Puesto;
    protected double Salario;

    public Empleado(String nombre, String puesto, double salario) {
        Nombre = nombre;
        Puesto = puesto;
        Salario = salario;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getPuesto() {
        return Puesto;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }



}
