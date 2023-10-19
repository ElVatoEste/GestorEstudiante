package model;

import jakarta.persistence.*;

import javax.naming.Name;

@Entity
public class Clases {

    @Id
    private Integer ID_Clase;
    private String professor;
    private String name;
}