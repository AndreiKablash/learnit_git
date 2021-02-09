package by.ivramko.enumUsage;

public class DemoEnum {

    public static void main(String[] args) {

        EnumExample app = EnumExample.Jonathan;
        EnumExample app1 = EnumExample.Cortland;
        EnumExample app2 = EnumExample.Jonathan;
        ApplesTwo applesTwo = ApplesTwo.Jonathan;

        if(app.compareTo(app1)<0){
            System.out.println("app before app1");
        }
        if(app.compareTo(app1)>0){
            System.out.println("app after app1");
        }
        if(app.compareTo(app2)==0){
            System.out.println("app equal app2");
        }

        if(app.equals(app1)){
            System.out.println("mistake");
        }
        if(app.equals(app2)){
            System.out.println("app equal app2");
        }
        if(app==app2){
            System.out.println("app==app2");
        }
    }
}
