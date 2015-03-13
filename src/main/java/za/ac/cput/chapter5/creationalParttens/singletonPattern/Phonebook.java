package za.ac.cput.chapter5.creationalParttens.singletonPattern;

/**
 * Created by student on 2015/03/10.
 */
public class Phonebook {
    private static Phonebook pBook = null;

    private Phonebook(){

    }

    public static Phonebook getInstance(){
        if(pBook == null)
        {
            pBook = new Phonebook();
        }
        return pBook;
    }

    public String addName(){
        return "thabo";
    }

    public int addNumber(){
        return 072;
    }
}
