package by.ivramko;

import java.util.Scanner;

public class FirstCharCapital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter any text: ");
        String userInput = sc.nextLine();
        System.out.println(firstCharToTitleCase(userInput));
    }

    public static String firstCharToTitleCase(String string) {

        char[] chars = string.toLowerCase().toCharArray();
        boolean flag = false;
        for(int i =0; i<chars.length; i++){
            if(!flag &&Character.isLetter(chars[i])){
                chars[i] = Character.toUpperCase(chars[i]);
                flag = true;
            }else if(Character.isWhitespace(chars[i])){
                flag =false;
            }
        }
        return String.valueOf(chars);
//        String lowerCaseString = string.toLowerCase();
//        String[] arrays = lowerCaseString.split(" ");
//        for (int i = 0; i < arrays.length; i++) {
//            char firstLetter = arrays[i].charAt(0);
//            if(arrays[i].length()>1){
//                arrays[i] = Character.toUpperCase(firstLetter) + arrays[i].substring(1);
//            }else {
//                arrays[i] = String.valueOf(Character.toUpperCase(firstLetter));
//            }
//        }
//        return String.join(" ", arrays);
    }
}
