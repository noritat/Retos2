import java.util.Scanner;

public class Reto1{

    public static void main(String[] args) {
        //creamos la variable con arreglos
        int notas[];
        String nombreestudiante;
        String nombremateria;
        int suma=0;
        int promedio=0;
        int cantidadnotas=0;

        Scanner lectura = new Scanner(System.in);
    
  
        System.out.println("Ingresa el nombre de la materia");
        nombremateria = lectura.next();
        System.out.println("Ingresa Su nombre");
        nombreestudiante = lectura.next();
        System.out.println("Ingresa ingrese cantidad de notas");
        cantidadnotas = lectura.nextInt();

        notas= new int[cantidadnotas];

        for( int i=0;i<cantidadnotas;i++){
            System.out.println("Ingresa las notas");
            notas[i]=lectura.nextInt();

        }
        for(int i=0;i<cantidadnotas;i++){
            suma=suma+notas[i];
        }

        
        promedio=suma/cantidadnotas;
        if(promedio<3.0){
            System.out.println(nombreestudiante+" Lo siento!Reprobaste La materia de:  "+nombremateria+"Con una nota de"+promedio);
        }
        else if(promedio>3 && promedio<=4.0){
            System.out.println(nombreestudiante+ "Pasaste raspando la materia de: "+nombremateria+"Con una nota de"+promedio+"Tienes que mejorar");
        }
        else if(promedio>4){
            System.out.println(nombreestudiante+ "Aprobaste la materia: "+nombremateria+ " con buenos resultados,Tu nota fue"+promedio+"! Sigue asi");
        }
        lectura.close();
}
}