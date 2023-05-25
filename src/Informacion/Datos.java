/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Informacion;

/**
 *
 * @author deloe
 */
public class Datos {
     String Nombre;
    String dcfecha;
    String Curp;

    public Datos(String Nombre, String dcfecha, String Curp) {
        this.Nombre = Nombre;
        this.dcfecha = dcfecha;
        this.Curp = Curp;
    }

    public Datos() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getdcfecha() {
        return dcfecha;
    }

    public void setdcfecha(String dcfecha) {
        this.dcfecha = dcfecha;
    }

    public String getCurp() {
        return Curp;
    }

    public void setCurp(String Curp) {
        this.Curp = Curp;
    }
    
    
}
