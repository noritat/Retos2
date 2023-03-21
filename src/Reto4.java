import java.util.Scanner;

public class Reto4 {

    public static void main(String[] args) {
        String productos[][];
        int fila;
        int columna;
        Scanner lectura = new Scanner(System.in);
        productos = new String[4][4];

        productos[0][0] = " 00  Papas Margarita  1500";
        productos[0][1] = " 01  Galletas Wafer   800";
        productos[0][2] = " 02  Chocolatina Jet  1000";
        productos[0][3] = " 03  Chiclets Adams   600";

        productos[1][0] = " 10  Manimoto      800";
        productos[1][1] = " 11  Chocorramo    1300";
        productos[1][2] = " 12  Agua Cristal  800";
        productos[1][3] = " 13  CocaCola      2000";

        productos[2][0] = " 20  M&M          3500";
        productos[2][1] = " 21  oreo         1200";
        productos[2][2] = " 22  Festivales   1000";
        productos[2][3] = " 23  Doritos      1500";

        productos[3][0] = " 30  Speed max    1500";
        productos[3][1] = " 31  Jugo Hit     2200";
        productos[3][2] = " 32  Helados      1500";
        productos[3][3] = " 33  Gala         2500";

        for (int i = 0; i < productos.length; i++) {

            for (int j = 0; j < productos.length; j++) {

                System.out.print(productos[i][j] + "\t");
            }
            System.out.println(" ");

        }

        System.out.println("Que producto quieres escoger?");
        System.out.println("digita la fila");
        fila = lectura.nextInt();
        System.out.println("digita la columna");
        columna = lectura.nextInt();

        System.out.println("El producto que escogiste es " + productos[fila][columna]);

        lectura.close();

    }

}
