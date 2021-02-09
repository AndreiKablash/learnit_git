package by.ivramko.OOP;

public class VariantProduct extends Product {

    private MasterProduct[] variants;

    public boolean isAvailableInStock(){
        for(MasterProduct m: variants){
            if(m.isAvailableInStock()){
                return true;
            }
        }
        return false;
    }
}
