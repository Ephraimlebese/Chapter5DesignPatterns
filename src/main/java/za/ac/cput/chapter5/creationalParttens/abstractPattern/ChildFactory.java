package za.ac.cput.chapter5.creationalParttens.abstractPattern;

/**
 * Created by student on 2015/03/11.
 */
public class ChildFactory implements HumansFactory {
    @Override
    public Humans goodNight(String doSomething){
        if("Child".equalsIgnoreCase(doSomething))
            return new Child();
        return null;
    }
}
