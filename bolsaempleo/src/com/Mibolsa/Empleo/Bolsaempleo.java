package com.Mibolsa.Empleo;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bolsaempleo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int salida, opcionvacante, promedio, anios, industria, ciudad;

       
        List<String> vacantestimed = new ArrayList<>(Arrays.asList("Analista BI", "Cientifico de datos", "Auxiliar de base de datos", "Desarrollador java", "Desarrollador front end"));
        List<String> vacantesfrasmed = new ArrayList<>(Arrays.asList("Analista financiero", "Contador", "Auxiliar de base de datos", "Coordinador financiero", "Gerente financiero"));
        List<String> vacantesdomed = new ArrayList<>(Arrays.asList("Analista de métricas", "Community manager", "Ilustrador", "Analista de redes", "Coordinador de marca"));
        List<String> vacantestibog = new ArrayList<>(Arrays.asList("Analista BI", "Cientifico de datos", "Auxiliar de base de datos"));
        List<String> vacantesfrasbog = new ArrayList<>(Arrays.asList("Analista financiero", "Contador", "Auxiliar de base de datos", "Gerente financiero", "Experto en actuaria"));
        List<String> vacantesdobog = new ArrayList<>(Arrays.asList("Analista de métricas", "Community manager", "Analista de meta", "Auxiliar de mercadeo"));



        do {
            System.out.println("Bienvenido a JDT tu bolsa de empleo. Selecciona tu perfil de usuario");
            System.out.println("1. Empleado");
            System.out.println("2. Empleador");
            int opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Antes de continuar por favor adjunta promedio de calificación y años de experiencia");
                    System.out.print("Años de experiencia: ");
                    anios = entrada.nextInt();
                    System.out.print("Promedio de calificación: ");
                    promedio = entrada.nextInt();
                    System.out.println("A continuación selecciona la industria en la que eres experto");
                    System.out.println("1. TI");
                    System.out.println("2. Finanzas y contabilidad");
                    System.out.println("3. Marketing y ventas");
                    industria = entrada.nextInt();
                    System.out.println("A continuación selecciona la ciudad en la que vives");
                    System.out.println("1. Medellín");
                    System.out.println("2. Bogotá");
                    ciudad = entrada.nextInt();

        
                    System.out.println("A continuación, se muestran las vacantes disponibles:");

                    if (industria == 1) { 
                        if (ciudad == 1) { 
                            for (int i = 0; i < vacantestimed.size(); i++) {
                                System.out.println((i + 1) + ". " + vacantestimed.get(i));
                            }
                        } else if (ciudad == 2) { 
                            for (int i = 0; i < vacantestibog.size(); i++) {
                                System.out.println((i + 1) + ". " + vacantestibog.get(i));
                            }
                        }
                    } else if (industria == 2) { 
                        if (ciudad == 1) { 
                            for (int i = 0; i < vacantesfrasmed.size(); i++) {
                                System.out.println((i + 1) + ". " + vacantesfrasmed.get(i));
                            }
                        } else if (ciudad == 2) {
                            for (int i = 0; i < vacantesfrasbog.size(); i++) {
                                System.out.println((i + 1) + ". " + vacantesfrasbog.get(i));
                            }
                        }
                    } else if (industria == 3) {
                        if (ciudad == 1) { 
                            for (int i = 0; i < vacantesdomed.size(); i++) {
                                System.out.println((i + 1) + ". " + vacantesdomed.get(i));
                            }
                        } else if (ciudad == 2) { 
                            for (int i = 0; i < vacantesdobog.size(); i++) {
                                System.out.println((i + 1) + ". " + vacantesdobog.get(i));
                            }
                        }
                    }

                    
                    System.out.print("Por favor selecciona el número de la vacante que te interesa: ");
                    opcionvacante = entrada.nextInt();

                    
                    List<String> vacantesSeleccionadas = new ArrayList<>();
                    if (industria == 1) {
                        vacantesSeleccionadas = (ciudad == 1) ? vacantestimed : vacantestibog;
                    } else if (industria == 2) {
                        vacantesSeleccionadas = (ciudad == 1) ? vacantesfrasmed : vacantesfrasbog;
                    } else if (industria == 3) {
                        vacantesSeleccionadas = (ciudad == 1) ? vacantesdomed : vacantesdobog;
                    }

                    if (opcionvacante >= 1 && opcionvacante <= vacantesSeleccionadas.size()) {
                        System.out.println("Has seleccionado: " + vacantesSeleccionadas.get(opcionvacante - 1));
                    } else {
                        System.out.println("Opción no válida.");
                    }
                    break;

                case 2:
                System.out.println("Bienvenido, empleador. ¿Deseas añadir una vacante? (1. Sí / 2. No)");
                int opcionAgregar = entrada.nextInt();
                
                if (opcionAgregar == 1) {
                    System.out.println("Selecciona la ciudad:");
                    System.out.println("1. Medellín");
                    System.out.println("2. Bogotá");
                    int ciudadEmpleador = entrada.nextInt();
                    
                    System.out.println("Selecciona la industria:");
                    System.out.println("1. TI");
                    System.out.println("2. Finanzas y contabilidad");
                    System.out.println("3. Marketing y ventas");
                    int industriaEmpleador = entrada.nextInt();
                    
                    
                    System.out.print("Introduce el nombre de la vacante: ");
                    entrada.nextLine(); 
                    String nombreVacante = entrada.nextLine();
                    
              
                    if (industriaEmpleador == 1) { 
                        if (ciudadEmpleador == 1) { 
                            vacantestimed.add(nombreVacante);
                            System.out.println("Vacante añadida en TI, Medellín.");
                        } else if (ciudadEmpleador == 2) { 
                            vacantestibog.add(nombreVacante);
                            System.out.println("Vacante añadida en TI, Bogotá.");
                        }
                    } else if (industriaEmpleador == 2) { 
                        if (ciudadEmpleador == 1) { 
                            vacantesfrasmed.add(nombreVacante);
                            System.out.println("Vacante añadida en Finanzas y contabilidad, Medellín.");
                        } else if (ciudadEmpleador == 2) { 
                            vacantesfrasbog.add(nombreVacante);
                            System.out.println("Vacante añadida en Finanzas y contabilidad, Bogotá.");
                        }
                    } else if (industriaEmpleador == 3) { 
                        if (ciudadEmpleador == 1) { 
                            vacantesdomed.add(nombreVacante);
                            System.out.println("Vacante añadida en Marketing y ventas, Medellín.");
                        } else if (ciudadEmpleador == 2) { 
                            vacantesdobog.add(nombreVacante);
                            System.out.println("Vacante añadida en Marketing y ventas, Bogotá.");
                        }
                    }
                } else {
                    System.out.println("No se ha añadido ninguna vacante.");
                }
                    break;

                default:
                    break;
            }

            System.out.println("Por favor seleccione una de las siguientes opciones:");
            System.out.println("1. Seguir navegando");
            System.out.println("2. Salir");
            salida = entrada.nextInt();
        } while (salida != 2);
    }
}
