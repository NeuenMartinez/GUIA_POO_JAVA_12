package Servicios12;

import Entidades12.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author NeuenMartinez
 */
public class PersonaService {

    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {
        System.out.println("Ingrese su nombre:");
        String nombre = leer.nextLine();
        System.out.println("Ingrese su fecha de nacimiento:");
        System.out.println("Dia:");
        int dia = leer.nextInt();
        System.out.println("Mes:");
        int mes = leer.nextInt();
        System.out.println("Año:");
        int año = leer.nextInt();
        Date fecha = new Date(año - 1900, mes - 1, dia);
        return new Persona(nombre, fecha);
    }

    public int calcularEdad(Persona p) {
        Date fechaActual = new Date();
        Date aux = p.getFecha();
        int años = (fechaActual.getYear() - aux.getYear());
        return años;
    }

    public boolean menorQue(int edad, int años) {
        return (edad < años);
    }

    public void mostrarPersona(Persona p) {
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Fecha de nacimiento: " + p.getFecha());
    }
}
