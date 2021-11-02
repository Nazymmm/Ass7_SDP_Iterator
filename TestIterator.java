package Ass7;

public class TestIterator {

    public static void main(String[] args) {
        SongCollection collections = newSongs();
        ISongsIterator iterator = collections.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getSongName());
        }
    }

    static SongCollection newSongs() {
        SongCollection collection = new SongCollection();
        collection.addSong(new Song("halo", 1));
        collection.addSong(new Song("price tag", 2));
        collection.addSong(new Song("dop", 3));
        collection.addSong(new Song("lovely", 4));
        collection.addSong(new Song("lofi", 5));
        return collection;
    }
}