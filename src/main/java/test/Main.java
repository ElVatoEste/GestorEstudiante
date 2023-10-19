package test;

import jakarta.persistence.EntityManager;
import service.EntityManagerAdmin;
import model.Student;

public class Main {

    public static void main(String[] args) {
        // Obtén una instancia de EntityManager configurada para "DEMOSQLSERVER"
        EntityManager entityManager = EntityManagerAdmin.getInstance();

        try {
            Integer studentId = 1; // Cambia esto con un ID válido
            Student student = entityManager.find(Student.class, studentId);

            if (student != null) {
                System.out.println("Conexión exitosa a la base de datos.");
                System.out.println("Nombre del estudiante: " + student.getName());
            } else {
                System.out.println("No se encontró ningún estudiante con el ID proporcionado.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al conectar a la base de datos.");
        } finally {
            entityManager.close();
        }
    }
}
