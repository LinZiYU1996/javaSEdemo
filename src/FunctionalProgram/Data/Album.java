package FunctionalProgram.Data;


import java.util.List;

/*
*
 * @Author Mr.Lin
 * @Description //
 * @Date 10:54 2019/4/27
 **/
public class Album {

    String name;

    List<Track> tracks;

    Artist musicians;


    public String getName() {
        return name;
    }

    public List<Track> getTracks() {
        return tracks;
    }


    public Artist getMusicians() {
        return musicians;
    }
}
