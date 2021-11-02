package Ass7;
import java.util.ArrayList;
import java.util.List;

public class SongCollection implements ISongCollection
{
    private List< Song > songList = new ArrayList<>();

    @Override
    public void addSong( Song song )
    {
        songList.add( song );
    }

    @Override
    public void removeSong( Song song )
    {
        songList.remove( song );
    }

    @Override
    public ISongsIterator iterator()
    {
        return new SongsIterator( songList );
    }

}
