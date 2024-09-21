package com.Micajero;

import java.util.Scanner;

public class Micajero {
    public static void main(String[] args) throws Exception {
        		Scanner entrada = new Scanner(System.in);
		int pin = 1352;
		int cuenta = 1037665265;
		double saldo= 1500000;
		int cuentaIngresada, pinIngresado, opcion;
		double montoretirado, montodepositado;
		
		System.out.println("Bienvendio señor usuario");
		do {
		System.out.println("Por favor ingrese su numero de cuenta");
		cuentaIngresada = entrada.nextInt();
		System.out.println("Ahora por favor ingrese el pin");
		pinIngresado = entrada.nextInt();
		} 
        while (cuentaIngresada != cuenta || pinIngresado != pin);
		
        do {
            System.out.println("Por favor selecciones una de las siguientes opciones:");
            System.out.println("1. Consulte su saldo");
            System.out.println("2. Retiro cuenta de ahorros");
            System.out.println("3. Deposito cuenta de ahorros");
            System.out.println("4. Salir");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Su saldo es: " + saldo);
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    montoretirado = entrada.nextDouble();
                    if (montoretirado <= saldo) {
                        saldo -= montoretirado;
                        System.out.println("Ha retirado: " + montoretirado);
                    } else {
                        System.out.println("Fondos insuficientes");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad a depositar: ");
                    montodepositado= entrada.nextDouble();
                    saldo += montodepositado;
                    System.out.println("Ha depositado: " + montodepositado);
                    break;
                case 4:
                    System.out.println("Gracias por usar el cajero automático");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (opcion != 4);
   

    entrada.close();
    }
}
