package za.ac.cput.chapter5.structuralParttens.adapterPattern;

/**
 * Created by student on 2015/03/12.
 */
public class Product {
    public Supplier getProductSupplier(){
        return new Supplier("Game");
    }
}
