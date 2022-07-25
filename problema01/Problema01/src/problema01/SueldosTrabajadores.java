/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema01;

/**
 *
 * @author USUARIO
 */
public class SueldosTrabajadores {

    private String cedula;
    private String nombre;
    private String correo;
    private double sueldo;
    private String mes;

    public SueldosTrabajadores(String c, String n, String co, double s, String m) {
        cedula = c;
        nombre = n;
        correo = co;
        sueldo = s;
        mes = m;
    }

    public void establecerCedula(String n) {
        cedula = n;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerCorreo(String n) {
        correo = n;
    }

    public void establecerSueldo(double n) {
        sueldo = n;
    }

    public void establecerMes(String n) {
        mes = n;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCorreo() {
        return correo;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public String obtenerMes() {
        return mes;
    }

     @Override
    public String toString(){
        String data = String.format("Cedula: %s\n"
                + "Nombres: %s\n"
                + "Correo: %s\n"
                + "Sueldo: %.2f\n"
                + "Mes del Sueldo: %s\n",
                obtenerCedula(),
                obtenerNombre(), obtenerCorreo(),
                obtenerSueldo(),obtenerMes());
        return data;
    }
}
