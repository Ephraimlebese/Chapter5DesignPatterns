package za.ac.cput.chapter5.creationalParttens.prototypePattern;

/**
 * Created by student on 2015/03/11.
 */
public class Programer implements Employees {
    private String title;

    public Programer(String title){
        this.title = title;
    }

    @Override
    public Employees work(){
        return new Programer(title);
    }

    @Override
    public String toString(){
        return "Programer " + " Title:"+ title ;
    }
}
