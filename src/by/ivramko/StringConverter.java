package by.ivramko;

public class StringConverter {
    public static final String INPUT_DATA = "Login;Name;Email" + System.lineSeparator() +
            "peterson;Chris Peterson;peterson@outlook.com" + System.lineSeparator() +
            "james;Derek James;james@gmail.com" + System.lineSeparator() +
            "jackson;Walter Jackson;jackson@gmail.com" + System.lineSeparator() +
            "gregory;Mike Gregory;gregory@yahoo.com";

    public static void main(String[] args) {
        System.out.println(INPUT_DATA);
        System.out.println("===== Convert 1 demo =====");
        System.out.println(convert1(INPUT_DATA));

        System.out.println("===== Convert 2 demo =====");
        System.out.println(convert2(INPUT_DATA));

    }

    public static String convert1(String input) {
        String[] inputArray = input.split(System.lineSeparator());
        for (int i=0; i<inputArray.length; i++){
            if(i==0){
                inputArray[i] = " ";
            }else {
                String temp = inputArray[i];
                int first = temp.indexOf(";");
                int last = temp.lastIndexOf(";");
                inputArray[i] = temp.replaceFirst(temp.substring(first, last+1), " ==> ");
            }
        }
        return String.join(System.lineSeparator(), inputArray).trim();
    }


    public static String convert2(String input) {
        String[] inputArray = input.split(System.lineSeparator());
        for (int i=0; i<inputArray.length; i++){
            if(i==0){
                inputArray[i]=" ";
            }else {
                String temp = inputArray[i];
                int first = temp.indexOf(";");
                int last = temp.lastIndexOf(";");
                inputArray[i] = temp.substring(first+1, last)+" (email: "+temp.substring(last+1)+")";
            }

        }
    return String.join(System.lineSeparator(), inputArray);
    }

}
