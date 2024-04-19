package es.ies.puerto.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Personajes")
public class Personaje {
    private static final long serialVersionUID = -7250234396452258822L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "genero")
    private String genero;

}

