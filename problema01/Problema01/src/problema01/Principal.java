/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Principal {

    public static void main(String[] args) {
        Enlace c = new Enlace();
        Scanner entrada = new Scanner(System.in);
        String res;
        entrada.useLocale(Locale.US);
        do {

            System.out.println("Ingrese la cedula del trabajador: ");
            String ce = entrada.nextLine();
            System.out.println("Ingrese el nombre del trabajador: ");
            String n = entrada.nextLine();
            System.out.println("Ingrese el correo del trabajador: ");
            String co = entrada.nextLine();
            System.out.println("Ingrese el sueldo del trabajador: ");
            double s = entrada.nextDouble();
            entrada.nextLine();
            System.out.println("Ingrese el mes del sueldo del trabajador:");
            String m = entrada.nextLine();

            SueldosTrabajadores trabajador = new SueldosTrabajadores(ce, n, co,
                    s, m);
            c.insertarTrabajador(trabajador);
            //entrada.nextLine();
            System.out.println("Ingrese si para ingresar otro trabajador: ");
            res = entrada.nextLine().toLowerCase();
        } while (res.equals("si"));
    }

}
