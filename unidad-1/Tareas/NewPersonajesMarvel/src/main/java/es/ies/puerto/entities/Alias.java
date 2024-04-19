package es.ies.puerto.entities;

import javax.persistence.*;

@Entity
@Table(name = "Alias")
public class Alias {
    private static final long serialVersionUID = -7250234396452258822L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "alias", nullable = false)
    private String alias;

}
