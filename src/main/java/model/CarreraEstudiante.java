package model;

import jakarta.persistence.*;
import org.hibernate.boot.registry.internal.StandardServiceRegistryImpl;

@Entity
@Table(name="Carrera_Estudiante")
public class CarreraEstudiante{

    @Id
    private Integer id;

    private String name;
}
