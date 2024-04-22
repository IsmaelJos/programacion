package es.ies.puerto.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Poderes")
public class Poderes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "poder", nullable = false)
    private String poder;

    @ManyToMany
    private Set<Personaje> personajes;

    public Poderes() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public Set<Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(Set<Personaje> personajes) {
        this.personajes = personajes;
    }
}