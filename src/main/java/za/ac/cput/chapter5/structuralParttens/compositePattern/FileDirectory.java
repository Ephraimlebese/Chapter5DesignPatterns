package za.ac.cput.chapter5.structuralParttens.compositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/03/13.
 */
public class FileDirectory implements FileSystem{
    List<FileSystem> fileSystems = new ArrayList<FileSystem>();

    @Override
    public void AddArtist(){
        for (FileSystem fileSystem : fileSystems){
            fileSystem.AddArtist();
        }
    }

    @Override
    public void AddName(){
        for(FileSystem fileSystem : fileSystems){
            fileSystem.AddName();
        }
    }

    public void add(FileSystem fileSystem){
        fileSystems.add(fileSystem);
    }

    public void remove(FileSystem fileSystem){
        fileSystems.remove(fileSystem);
    }

    public List<FileSystem> getFileSystems(){
        return fileSystems;
    }

    public FileSystem getFileSystem(int index){
        return fileSystems.get(index);
    }
}
