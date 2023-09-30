import java.util.Scanner;

public class LengtSTR {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1, str2;
//        System.out.print("Введите первую строку: ");
//        String s1 = scan.nextLine();
//        System.out.print("Введите вторую строку: ");
//        String s2 = scan.nextLine();
        str1 = "12345";
        str2 = "12345";
        int ln = sravStr(str1,str2);
        System.out.println("Динна максимальной строки " + ln);
    }


    public static int sravStr(String string1, String string2){
        int result = 0;
        if(string1.length()>string2.length() ){
            System.out.println("Строка s1 длиннее");
            result = string1.length();
        }
        if(string1.length()==string2.length() ){
            System.out.println("Строки равны");
            result = string1.length();
        }
        if(string1.length()<string2.length() ){
            System.out.println("Строка s2 длиннее");
            result = string2.length();
        }
        return result;

    }
}
