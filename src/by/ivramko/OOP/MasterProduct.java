package by.ivramko.OOP;

public class MasterProduct extends Product{

    private boolean isAvailableForLease;

    public boolean isAvailableInStock(){
        return getRemainingAmountInStock() >0;
    }
}
