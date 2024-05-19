package es.ies.puerto.repositories;

import es.ies.puerto.models.Song;

import java.util.ArrayList;
import java.util.List;

public class SongRepository {

    private List<Song> list;

    public SongRepository(){
        list = new ArrayList<>();
        list.add(new Song("1", "Karma Police","4.00"));
        list.add(new Song("2", "Pepe Benavente","10.00"));

    }
    public Song getSongById(String id) {
        return list.get(Integer.parseInt(id));
    }

    public List<Song> getSongs() {

        return list;
    }

    public void saveSong(Song song){
        if (list.contains(song)) {

        }
        list.add(song);
    }
}
