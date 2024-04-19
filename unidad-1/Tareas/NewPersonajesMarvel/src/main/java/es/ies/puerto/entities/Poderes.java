package es.ies.puerto.entities;

import javax.persistence.*;

@Entity
@Table(name = "Poderes")
public class Poderes {
    private static final long serialVersionUID = -7250234396452258822L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "poder", nullable = false)
    private String poder;



}