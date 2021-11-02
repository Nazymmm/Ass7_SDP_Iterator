package Ass7;

public interface ISongCollection
{
    void addSong( Song song );

    void removeSong( Song song );

    ISongsIterator iterator();
}
