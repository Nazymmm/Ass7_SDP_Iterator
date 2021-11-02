package Ass7;

public class Song {

    private String songName;

    private int trackNumber;


    public Song(String songName, int trackNumber )
    {
        this.songName = songName;
        this.trackNumber = trackNumber;
    }


    public String getSongName()
    {
        return songName;
    }

    public void setSongName( String songName )
    {
        this.songName = songName;
    }

    public int getTrackNumber()
    {
        return trackNumber;
    }

    public void setTrackNumber( int trackNumber )
    {
        this.trackNumber = trackNumber;
    }
}
