package Servicio;

import Entidades.Tarea;
import java.util.Scanner;

import java.util.ArrayList;

public class ServicioTarea {
    ArrayList<Tarea>listaTareas;
    int id = 1;

    public ServicioTarea() {
        listaTareas = new ArrayList<>();
    }

    public void agregarUnaTarea(){
        Tarea tarea = new Tarea();

        System.out.println("Por favor, ingrese el nombre de su tarea");
        Scanner scanner = new Scanner(System.in);
        String nombrecito = scanner.nextLine();
        tarea.setName(nombrecito);
        System.out.println("Por favor, ingrese la descripcion de su tarea");
        String descripcion = scanner.nextLine();
        tarea.setDescription(descripcion);
        tarea.setId(id);
        listaTareas.add(tarea);
        id++;
    }
    public void actualizarCliente(int id, String nombre, String description) {
        for (Tarea tarea : listaTareas) {
            if (tarea.getId() == id) {
                tarea.setName(nombre);
                tarea.setDescription(description);
            }
        }
    }
    public void verTareas(){
        for (Tarea tarea : listaTareas) {
            System.out.println("---------------------------------------------");

            System.out.println(" ID: " + tarea.getId() + " Nombre: " + tarea.getName() + " Está hecha? " + tarea.isCheck());
            System.out.println();
            System.out.println("Objetivo: " + tarea.getDescription());
            System.out.println("---------------------------------------------");

    }

    }
    public void removerTareas(int id){
        Tarea tareaABorrar = null;
        for (Tarea tarea : listaTareas) {
            if (tarea.getId() == id) {
                tareaABorrar = tarea;
            }
        }
        if (tareaABorrar != null) {
            listaTareas.remove(tareaABorrar);
        }
    }
    public void darCheck(int id){
        for (Tarea tarea : listaTareas) {
            if (tarea.getId() == id) {
                tarea.setCheck(true);
            }
        } System.out.println("Tarea " +id+ "check");
    }
    public void desmarcarTarea(int id){
        for (Tarea tarea : listaTareas) {
            if (tarea.getId() == id) {
                tarea.setCheck(false);
            }
        }System.out.println("Tarea " +id+ "desmarcada");
    }
}
