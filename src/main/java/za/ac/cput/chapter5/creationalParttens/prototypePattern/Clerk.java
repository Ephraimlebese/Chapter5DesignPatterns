package za.ac.cput.chapter5.creationalParttens.prototypePattern;

/**
 * Created by student on 2015/03/11.
 */
public class Clerk implements Employees {
    private String title;

    public Clerk(String title){
        this.title = title;
    }

    @Override
    public Employees work(){
        return new Clerk(title);
    }

    @Override
    public String toString(){
        return "Clerk " + " Title:"+ title ;
    }
    
}
