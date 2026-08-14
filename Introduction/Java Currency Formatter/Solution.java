import java.util.*;
import java.text.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();
        sc.close();
        
        Locale usLocale = Locale.US;
        Locale indiaLocale = new Locale("en", "IN");
        Locale chinaLocale = Locale.CHINA;
        Locale franceLocale = Locale.FRANCE;

        String u = NumberFormat.getCurrencyInstance(usLocale).format(payment);
        String i = NumberFormat.getCurrencyInstance(indiaLocale).format(payment);
        String c = NumberFormat.getCurrencyInstance(chinaLocale).format(payment);
        String f = NumberFormat.getCurrencyInstance(franceLocale).format(payment);
        
        i = i.replace("₹", "Rs.");
        
        System.out.println("US: " +u);
        System.out.println("India: " +i);
        System.out.println("China: " +c);
        System.out.println("France: " +f);
    }
}