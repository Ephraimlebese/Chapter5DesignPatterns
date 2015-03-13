package za.ac.cput.chapter5.structuralParttens.adapterPattern;

/**
 * Created by student on 2015/03/12.
 */
public class ProductStore extends Product implements ProductAdapter{
    @Override
    public Supplier getProductSupplier1(){
        return getProductSupplier();
    }

    @Override
    public Supplier getProductSupplier2(){
        Supplier supplier = getProductSupplier();
        return sellProduct(supplier);
    }

    private Supplier sellProduct(Supplier supplier){
        return new Supplier(supplier.getSupplierName());
    }
}
