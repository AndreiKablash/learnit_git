package by.ivramko.OOP.homework.presentsmanagment;

import java.util.Arrays;
import java.util.Objects;

public class Present {

    private static final int DEFAULT_GIFT_CAPACITY = 10;
    private Sweet[] sweets;
    private int lastIndexAdded;

    {
        sweets = new Sweet[DEFAULT_GIFT_CAPACITY];
    }

    // the method that adds sweet to the present
    public void addSweet(Sweet sweet) {
        if(sweet==null){
            return;
        }
        if(sweets.length<=lastIndexAdded){
            sweets=Arrays.copyOf(sweets,sweets.length*2);
        }
        sweets[lastIndexAdded++]=sweet;
    }


    // the method filters sweets by sugar weight inclusively
    public Sweet[] filterSweetsBySugarRange(double minSugarWeight, double maxSugarWeight) {

        return Arrays.stream(getSweets())
                .filter(Objects::nonNull)
                .filter(sweet -> sweet.getSugarWeight() >= minSugarWeight && sweet.getSugarWeight() <= maxSugarWeight)
                .toArray(Sweet[]::new);
    }

    // the method calculates total weight of the present
    public double calculateTotalWeight() {
        return  Arrays.stream(getSweets())
                .filter(Objects::nonNull)
                .mapToDouble(Sweet::getWeight)
                .sum();
    }


    // the method returns copy of the Sweet[] array so that nobody could
    // modify state of the present without addSweet() method.
    // Also array shouldn’t contain null values.
    public Sweet[] getSweets() {

        return sweets = Arrays.stream(sweets)
                .filter(Objects::nonNull)
                .toArray(Sweet[]::new);

    }
}
