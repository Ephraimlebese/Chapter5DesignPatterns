package za.ac.cput.chapter5.structuralParttens.adapterPattern;

/**
 * Created by student on 2015/03/12.
 */
public class ProductStoreX implements ProductAdapter{

    private Product product = new Product();

    @Override
    public Supplier getProductSupplier1(){
        return product.getProductSupplier();
    }

    @Override
    public Supplier getProductSupplier2(){
        Supplier supplier = product.getProductSupplier();
        return sellProduct(supplier);
    }

    private Supplier sellProduct(Supplier supplier){
        return new Supplier(supplier.getSupplierName());
    }
}
