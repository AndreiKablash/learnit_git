package by.ivramko.enumUsage;

public enum EnumExample {
    Jonathan(1), GoldenDel , RedDel(12) , Winesap(15) , Cortland(8);

    private int price;

    EnumExample(int price) {
        this.price = price;
    }
    EnumExample(){
        this.price = -1;
    }

    public int getPrice(){
        return price;
    }
}
