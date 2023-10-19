package test;

import jakarta.persistence.EntityManager;
import service.EntityManagerAdmin;
import model.Student;
import service.IDAO;
import service.ImplIDAO;

public class Main {

    public static void main(String[] args) {

        IDAO dao = new ImplIDAO();

        try {
            Integer studentId = 1; // Cambia esto con un ID válido
            Student student = dao.findById(Student.class, studentId);

            if (student != null) {
                System.out.println("Conexión exitosa a la base de datos.");
                System.out.println("Nombre del estudiante: " + student.getName());
            } else {
                System.out.println("No se encontró ningún estudiante con el ID proporcionado.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al conectar a la base de datos.");
        }
    }
}
