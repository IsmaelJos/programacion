package es.ies.puerto.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Song {
    private String id;
    private String name;
    private String duration;
    public Song() {
    }
    public Song(String id){
        this.id = id;
    }

    public Song(String id, String name, String duration) {
        this.id = id;
        this.name = name;
        this.duration = duration;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

}
