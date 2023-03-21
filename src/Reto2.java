
import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        // Declaramos las variables //
        int cantidadcompetidores;
        double hora[];
        String nombres[];
        String nombreganador;
        double tiempoganador;
        // captura los datos//
        Scanner lectura = new Scanner(System.in);
        System.out.println("digite cantidad participantes");
        cantidadcompetidores = lectura.nextInt();
        // creamos el objeto-comnplemento de array//
        hora = new double[cantidadcompetidores];
        nombres = new String[cantidadcompetidores];

        for (int i = 0; i < hora.length; i++) {
            System.out.println("digite el nombre");
            nombres[i] = lectura.next();
            System.out.println("digite el tiempo");
            hora[i] = lectura.nextDouble();

        }
        System.out.println("Nombre competidor  tiempo");
        for (int i = 0; i < hora.length; i++) {
            System.out.println(nombres[i] + " " + hora[i]);

        }
        nombreganador = nombres[0];
        tiempoganador = hora[0];
        for (int i = 1; i < hora.length; i++) {
            if (hora[i] > tiempoganador) {
                nombreganador = nombres[i];
                tiempoganador = hora[i];
            }

        }
        System.out.println("el ganador es " + nombreganador + " con un tiempo de " + tiempoganador);
        lectura.close();

    }
}
