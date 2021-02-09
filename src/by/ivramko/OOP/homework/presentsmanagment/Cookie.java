package by.ivramko.OOP.homework.presentsmanagment;

public abstract class Cookie extends Sweet  {

    public double doughWeight;

    public double getDoughWeight() {
        return doughWeight;
    }

    public void setDoughWeight(double doughWeight) {
        this.doughWeight = doughWeight;
    }

    @Override
    public String toString() {
        return "Cookie{" +
                "doughWeight=" + doughWeight +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", sugarWeight=" + sugarWeight +
                '}';
    }
}
