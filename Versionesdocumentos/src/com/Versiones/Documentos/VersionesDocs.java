package com.Versiones.Documentos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VersionesDocs {

    static class Documento {
        private String contenido;
        private int version;

        public Documento(String contenido, int version) {
            this.contenido = contenido;
            this.version = version;
        }

        public String getContenido() {
            return contenido;
        }

        public int getVersion() {
            return version;
        }
    }

    static class SistemaDocumentos {
        private List<Documento> versiones;

        public SistemaDocumentos() {
            this.versiones = new ArrayList<>();
        }

        public void crearDocumento(String contenido) {
            int nuevaVersion = versiones.size() + 1;
            Documento nuevoDocumento = new Documento(contenido, nuevaVersion);
            versiones.add(nuevoDocumento);
            System.out.println("Documento creado, versión: " + nuevaVersion);
        }

        public void modificarDocumento(int version, String nuevoContenido) {
            if (version > 0 && version <= versiones.size()) {
                Documento documentoActual = versiones.get(version - 1);
                int nuevaVersion = version + 1; // Nueva versión incrementada
                Documento nuevoDocumento = new Documento(nuevoContenido, nuevaVersion);
                versiones.add(nuevoDocumento);
                System.out.println("Documento modificado, nueva versión: " + nuevaVersion);
            } else {
                System.out.println("Versión no válida.");
            }
        }

        public void mostrarVersiones() {
            for (Documento doc : versiones) {
                System.out.println("Versión " + doc.getVersion() + ": " + doc.getContenido());
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaDocumentos sistema = new SistemaDocumentos();
        int opcion;

        do {
            System.out.println("1. Crear documento");
            System.out.println("2. Modificar documento");
            System.out.println("3. Mostrar versiones");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el contenido del documento: ");
                    String contenido = scanner.nextLine();
                    sistema.crearDocumento(contenido);
                    break;
                case 2:
                    System.out.print("Ingrese el número de versión del documento a modificar: ");
                    int version = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    System.out.print("Ingrese el nuevo contenido: ");
                    String nuevoContenido = scanner.nextLine();
                    sistema.modificarDocumento(version, nuevoContenido);
                    break;
                case 3:
                    sistema.mostrarVersiones();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 4);
        
        scanner.close();
    }
}

