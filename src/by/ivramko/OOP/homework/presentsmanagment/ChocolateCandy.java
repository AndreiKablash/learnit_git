package by.ivramko.OOP.homework.presentsmanagment;

public class ChocolateCandy extends Candy {

    public double chocolateWeight;

    public double getChocolateWeight() {
        return chocolateWeight;
    }

    public void setChocolateWeight(double chocolateWeight) {
        this.chocolateWeight = chocolateWeight;
    }

    @Override
    public String toString() {
        return "ChocolateCandy{" +
                "chocolateWeight=" + chocolateWeight +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", sugarWeight=" + sugarWeight +
                '}';
    }
}
