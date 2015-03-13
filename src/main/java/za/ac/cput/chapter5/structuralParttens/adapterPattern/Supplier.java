package za.ac.cput.chapter5.structuralParttens.adapterPattern;

/**
 * Created by student on 2015/03/12.
 */
public class Supplier {
    private String supplierName;

    public Supplier(String supplierName){
        this.supplierName = supplierName;
    }
    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

}
