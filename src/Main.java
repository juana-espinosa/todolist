import Servicio.ServicioTarea;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ServicioTarea tareas = new ServicioTarea();

        System.out.println("Hola! Bienvenid@ a tu lista de tareas");
        System.out.println("Por favor, a continuacion elija la opcion que desea");
        System.out.println("1- Agregar tarea");
        System.out.println("2- Ver tareas actuales");
        System.out.println("3- Modificar tarea");
        System.out.println("4- Remover tareas");
        System.out.println("5- Dar check a una tarea");
        System.out.println("6- Desmarcar una tarea");
        System.out.println("7- Salir del menu");
        //scanner para String
        Scanner scanner = new Scanner(System.in);

        //scanner para Int
        Scanner scannerInt = new Scanner(System.in);
        int option = scannerInt.nextInt();
        boolean menu = true;
        while (menu) {

            switch (option) {
                case 1 -> {
                    System.out.println("Te vamos a pedir algunas informaciones");
                    tareas.agregarUnaTarea();
                }
                case 2 -> {
                    System.out.println("Te mostraremos las tareas ingresadas");
                    tareas.verTareas();

                }
                case 3 -> {
                    System.out.println("Te pediremos algunos datos para una correcta actualizacion");
                    System.out.println("Ingrese el id de la tarea");
                    int idABuscar = scannerInt.nextInt();
                    System.out.println("Ingrese el nuevo nombre de la tarea");
                    String newName = scanner.nextLine();
                    System.out.println("Ingrese la nueva descripcion de la tarea");
                    String newDescription = scanner.nextLine();
                    tareas.actualizarCliente(idABuscar, newName, newDescription);
                }
                case 4 -> {
                    System.out.println("Te pediremos algunos datos para una correcta eliminacion");
                    System.out.println("Ingrese el id de la tarea");
                    int idABuscar = scannerInt.nextInt();
                    tareas.removerTareas(idABuscar);
                }
                case 5 -> {
                    System.out.println("Ingrese el id de la tarea");
                    int idABuscar = scannerInt.nextInt();
                    tareas.darCheck(idABuscar);
                }
                case 6 -> {
                    System.out.println("Ingrese el id de la tarea");
                    int idABuscar = scannerInt.nextInt();
                    tareas.desmarcarTarea(idABuscar);
                }
            }
                System.out.println("Hola! Bienvenid@ a tu lista de tareas");
                System.out.println("Por favor, a continuacion elija la opcion que desea");
                System.out.println("1- Agregar tarea");
                System.out.println("2- Ver tareas actuales");
                System.out.println("3- Modificar tarea");
                System.out.println("4- Remover tareas");
                System.out.println("5- Dar check a una tarea");
                System.out.println("6- Desmarcar una tarea");
                System.out.println("7- Salir del menu");
                option = scannerInt.nextInt();
                if (option == 7) {
                    System.out.println("Gracias por usar nuestra App :D");
                    menu = false;
                }

        }

    }
}