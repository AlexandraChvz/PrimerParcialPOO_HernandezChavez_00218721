import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static ArrayList<Articulo> articulosElectronicos = new ArrayList<Articulo>();

    public static void main(String[] args) {
        menuPrincipal();
    }

    private static void menuPrincipal() {
        Scanner sn = new Scanner(System.in);
        int opcion;
        while(true){
            try {
                imprimirMenu();
                opcion = sn.nextInt();
                sn.nextLine();

                if(opcion == 0){
                    System.out.println("\nHasta pronto...");
                    break;
                }

                switch (opcion){
                    case 1:
                        agregarArticulo();
                        break;
                    case 2:
                        modificarArticulo();
                        break;
                    case 3:
                        mostrarListaArticulos();
                        break;
                    default:
                        System.out.println("\nPor favor seleccione una opcion del menu\n");
                        break;
                }
            } catch (InputMismatchException e){
                System.out.println("\nPor favor ingrese un dato valido\n");
                sn.nextLine();
            }
        }
    }

    private static void mostrarListaArticulos() {

        for (int i = 0; i < articulosElectronicos.size(); i++) {
            System.out.println("\n#\t|Nombre\t\t\t|Modelo\t|descripcion\t|Precio");
            Articulo emp = articulosElectronicos.get(i);
            System.out.println(
                    (i+1)
                            +"\t|"+emp.getNombre()
                            +"\t|"+emp.getModelo()
                            +"\t|"+emp.getDescripcion()
                            +"\t|$"+emp.getPrecio()
            );
        }
        System.out.println("\n");
    }



    private static void modificarArticulo() {
        Scanner sn = new Scanner(System.in);
        System.out.println("Ingrese el nombre del articulo a modificar");
        String nombre = sn.nextLine();

        for (int i = 0; i < articulosElectronicos.size(); i++) {
            if (articulosElectronicos.get(i).getNombre().equals(nombre)){
                System.out.print("\nIngrese el nuevo precio de "+ articulosElectronicos.get(i).getNombre()+" en USD: $");
                float nuevoPrecio = sn.nextFloat();

                articulosElectronicos.get(i).setPrecio(nuevoPrecio);
                System.out.println("\nPrecio de "+articulosElectronicos.get(i).getNombre()+" actualizado exitosamente...\n");
                return;
            }
        }
    }

    private static void agregarArticulo() {

        Scanner sn = new Scanner(System.in);

        String nombre;
        String modelo;
        String descripcion;
        Float precio;

        System.out.println("Ingrese el nombre del articulo:");
        nombre = sn.nextLine();
        System.out.println("Ingrese el modelo:");
        modelo = sn.nextLine();
        System.out.println("Ingrese la descripcion del articulo:");
        descripcion = sn.nextLine();
        System.out.println("Ingrese el precio del articulo:");
        precio = sn.nextFloat();
        sn.nextLine();


        Articulo articulo = new Articulo(nombre,modelo,descripcion,precio) {
        };
        
        int tipoArticulo = obtenerTipoArticulo();


        switch (tipoArticulo){
            case 1:
                System.out.println("Ingrese el sistema operativo del telefono:");
                String sistemaOperativo = sn.nextLine();
                System.out.println("Ingrese la capacidad de la memoria interna del telefono:");
                int capacidadMemoriaInterna = sn.nextInt();
                System.out.println("Ingrese la capacidad de la RAM");
                int RAM = sn.nextInt();

                articulo = new Telefono(sistemaOperativo, capacidadMemoriaInterna,RAM);
                break;
            case 2:
                System.out.println("Ingrese el procesador de la laptop:");
                String procesador = sn.nextLine();
                System.out.println("Ingrese la capacidad de la memoria Ram: ");
                int ram = sn.nextInt();
                System.out.println("Ingrese la capacidad del disco duro: ");
                double discoDuro = sn.nextDouble();

                articulo = new Laptop(procesador, ram, discoDuro);
                break;
        }

        System.out.println("\nArticulo agregado exitosamente...\n");

        articulosElectronicos.add(articulo);
    }

    private static int obtenerTipoArticulo() {
        Scanner sn = new Scanner(System.in);
        int opcion;
        while (true) {
            try{
                System.out.println("Seleccione una opcion:\n"
                        + "\t1. Telefono\n"
                        + "\t2. Laptop\n"
                );
                System.out.print("Opcion -> ");
                opcion = sn.nextInt();
                if(opcion >= 1 && opcion <= 2) return opcion;
                System.out.println("\ningrese una opcion valida\n");
            }catch(Exception e){
                System.out.println("\ningrese un dato valido\n");
            }finally {
                sn.nextLine();
            }
        }

    }

    private static void imprimirMenu() {
        System.out.println("Seleccione una opcion:\n"
                + "\t1. Agregar articulo\n"
                + "\t2. Modificar articulo\n"
                + "\t3. Mostrar todos los Articulos\n"
                + "\t0. Salir"
        );
        System.out.print("Opcion -> ");
    }
}