import java.util.Random;
import java.util.Scanner;

public class Reto3 {

    public static void main(String[] args) throws InterruptedException {
        int fila;
        int columna;
        int vidas = 10;
        String emoji;
        String encontrada;
        int termino=0;
        //declaramos las matrices que necsitamos 
        String emojis[][];
        String oculta[][];
        //declaramosel arreglo para almacenar los emojis posible spara el juego de concentrese 
        String nombre[] = { ";)", ":v", ":n", ":b", ":l", ":P", ":P", ":3", ":&", ":N", ":e", ":H", ":c", ":B", "-_-",":D","o.O",
    ":/","(y)","8)","8/","^.^","^_^" };
       
        Scanner lectura = new Scanner(System.in);

        System.out.println("ingrese el tamaño de la fila ");
        fila = lectura.nextInt();
        System.out.println("ingrese el tamaño de columna ");
        columna = lectura.nextInt();
//creamos el objeto
        emojis = new String[fila][columna];
        oculta = new String[fila][columna];
        
        for (int i = 0; i < fila; i++) {

            for (int j = 0; j < columna; j++) {

                Random numaleatorio = new Random();
                int numero = numaleatorio.nextInt((nombre.length) + 0);

                emojis[i][j] = nombre[numero];
                oculta[i][j] = "-";

            }
        }
        System.out.println("Tabla de emoji");
        
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {

                System.out.print(emojis[i][j] + "\t");

            }
            System.out.println("");

        }
        System.out.println("tienes 5 segundos para observar los emojis ");
        Thread.sleep(5000);

        System.out.println("\033[H\033[2J");
        System.out.flush();

        while (!(vidas == 0) && !(termino==(fila*columna))) {
            System.out.println("digite un emoji");
            encontrada = "no";
            emoji = lectura.next();
            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < columna; j++) {
                    if (emojis[i][j].equals(emoji)) {
                        oculta[i][j] = emoji;
                        encontrada = "si";
                        termino++;
                    }
                }
            }
            if (encontrada.equalsIgnoreCase("si")) {
                System.out.println("Encontraste una muy bien");
                for (int i = 0; i < fila; i++) {
                    for (int j = 0; j < columna; j++) {

                        System.out.print(oculta[i][j] + "\t");

                    }
                    System.out.println("");

                }
            } else {
                System.out.println("fallaste vidas restantes " + vidas);
                vidas--;
            }
        }

        System.out.println("Se termino el juego has"+ (termino==(fila*columna)?" GANADO " : " PERDIDO") );

        lectura.close();

    }

}
