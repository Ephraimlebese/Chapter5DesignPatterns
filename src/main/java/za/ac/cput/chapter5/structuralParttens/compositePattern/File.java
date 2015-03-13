package za.ac.cput.chapter5.structuralParttens.compositePattern;

/**
 * Created by student on 2015/03/13.
 */
public class File implements FileSystem {
    String artist;

    public File(String artist){
        this.artist = artist;
    }

    @Override
    public void AddArtist(){
        System.out.println(artist + "is an artist");
    }

    @Override
    public void AddName(){
        System.out.println(artist + "is my name");
    }

    @Override
    public String toString() {
        return "File{" +
                "artist='" + artist + '\'' +
                '}';
    }
}
