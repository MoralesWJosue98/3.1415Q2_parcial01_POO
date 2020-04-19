package com.WJMA.x00025719;

public class PlazaFija extends Empleado {
    public int Extension;

    public PlazaFija(String nombre, String puesto, double salario, int extension) {
        super(nombre, puesto, salario);
        Extension = extension;
    }

    public int getExtension() {
        return Extension;
    }

    public void setExtension(int extension) {
        Extension = extension;
    }

}
