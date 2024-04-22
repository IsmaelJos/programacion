package es.ies.puerto.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Personajes")
public class Personaje {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "genero")
    private String genero;

    @OneToMany(mappedBy = "Personaje")
    private Set<Alias> aliases;

    @ManyToMany(mappedBy = "Personaje")
    @JoinTable(name = "Personaje",
            joinColumns = { @JoinColumn(name = "personaje_id") },
            inverseJoinColumns = { @JoinColumn(name = "poder_id")})
    private Set<Poderes> poderes;

    public Personaje() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Set<Alias> getAliases() {
        return aliases;
    }

    public void setAliases(Set<Alias> aliases) {
        this.aliases = aliases;
    }

    public Set<Poderes> getPoderes() {
        return poderes;
    }

    public void setPoderes(Set<Poderes> poderes) {
        this.poderes = poderes;
    }
}

