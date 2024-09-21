package com.Tickets.Micine;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Tickets {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        String pelicula,asiento;
        int asientoselec,peliculaselec, opcion=0;
        List<String> asientoshp = new ArrayList<>(Arrays.asList("A1", "A2", "A3","A4", "A5"));
        List<String> asientosorigen = new ArrayList<>(Arrays.asList("A1", "A2", "A3","A4", "A5"));
        List<String> asientosspirit = new ArrayList<>(Arrays.asList("A1", "A2", "A3","A4", "A5"));
        List<String> peliculas = new ArrayList<>(Arrays.asList("Harry Potter", "El origen", "Spirit"));
        System.out.println("Bienvenido señor usuario");
        System.out.println("Seleccione la pelicula que desea ver");
        
        
        do{for(int i=0;i <peliculas.size();i++){
            pelicula= peliculas.get(i);
            System.out.println((i+1) + "-"+ pelicula);
        }
        System.out.println("Ingrese la opción debahjo");
        peliculaselec= entrada.nextInt();

        System.out.println("Seleccione el asiento");
        switch (peliculaselec) {
            case 1:
            for(int i=0;i< asientoshp.size();i++){
                asiento= asientoshp.get(i);
                System.out.println(i+1 + "-"+asiento);
                
            }
            System.out.println("Ingrese la opción debajo");
            asientoselec= entrada.nextInt();
            System.out.println("Has reservado el asiento " + asientoshp.get(asientoselec) + " para la película " + peliculas.get(peliculaselec - 1) + ".");
            List<String> asientoshpreservados = new ArrayList<>();
            asientoshpreservados.add(asientoshp.get(asientoselec-1));
            asientoshp.remove(asientoselec-1);

                break;
        
            case 2:
            for(int i=0;i< asientosorigen.size();i++){
                asiento= asientosorigen.get(i);
                System.out.println(i + "-"+asiento);
            }
            System.out.println("Ingrese la opción debajo");
            asientoselec= entrada.nextInt();
            System.out.println("Has reservado el asiento " + asientoshp.get(asientoselec) + " para la película " + peliculas.get(peliculaselec - 1) + ".");
            List<String> asientosorgienreservados = new ArrayList<>();
            asientosorgienreservados.add(asientoshp.get(asientoselec-1));
            asientosorigen.remove(asientoselec);
                break;
            case 3:
                for(int i=0;i< asientosspirit.size();i++){
                    asiento= asientosspirit.get(i);
                    System.out.println(i + "-"+asiento);
                }
                System.out.println("Ingrese la opción debajo");
                asientoselec= entrada.nextInt();
                System.out.println("Has reservado el asiento " + asientoshp.get(asientoselec) + " para la película " + peliculas.get(peliculaselec - 1) + ".");
                List<String> asientosspiritreservados = new ArrayList<>();
                asientosspiritreservados.add(asientoshp.get(asientoselec-1));
                asientosspirit.remove(asientoselec);
                break;
            }

        System.out.println("Por favor seleccione una de las siguientes opciones:");
        System.out.println("1. Seguir comprando");
        System.out.println("2. Salir");
        opcion = entrada.nextInt();

         } while(opcion!=2);

         entrada.close(); 

    }

}
