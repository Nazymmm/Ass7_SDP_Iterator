package Ass7;
import java.util.List;

public class SongsIterator implements ISongsIterator {

    List< Song > songsList;
    private int position;

    public SongsIterator( List< Song > songsList )
    {
        this.songsList = songsList;

    }

    @Override
    public boolean hasNext()
    {
        if ( position < songsList.size() )
            return true;

        return false;
    }

    @Override
    public Song next()
    {
        return songsList.get( position++ );
    }
}
