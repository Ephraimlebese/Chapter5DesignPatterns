package za.ac.cput.chapter5.creationalParttens.abstractPattern;

/**
 * Created by student on 2015/03/11.
 */
public class ParentFactory implements HumansFactory {
    @Override
    public Humans goodNight(String doSomething){
        if("Parent".equalsIgnoreCase(doSomething))
            return new Parent();
        return null;
    }
}
