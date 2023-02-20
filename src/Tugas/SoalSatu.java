package Tugas;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class SoalSatu {
    //regex untuk email
    public static boolean isEmail(String input) {

        String emailPattern = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
    //  yang ini regex untuk date dd-mm-yyyy dan yy-mmmm-dddd
    public static boolean isDate(String input) {
        String datePattern1 = "^\\d{2}-\\d{2}-\\d{4}$";
        String datePattern2 = "^[a-zA-Z]+,\\s[a-zA-Z]+\\s\\d{2}$";
        Pattern pattern1 = Pattern.compile(datePattern1);
        Pattern pattern2 = Pattern.compile(datePattern2);
        Matcher matcher1 = pattern1.matcher(input);
        Matcher matcher2 = pattern2.matcher(input);
        return (matcher1.matches() || matcher2.matches());
    }

    public static boolean isIPAddress(String input) {
        String ipPattern = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
        Pattern pattern = Pattern.compile(ipPattern);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String email = "rinifajarwati20@gmail.com";// pattern email
        String date1 = "23-03-2023";// pattern yang untuk dd-mm-yyyy
        String date2 = "Monday, February 23";// ini pattern untuk yy-mmmm-dddd
        String ipAddress = "255.255.255.255"; // paterrn untuk IP

        System.out.println(email + " is email? " + isEmail(email));
        System.out.println(date1 + " is date? " + isDate(date1));
        System.out.println(date2 + " is date? " + isDate(date2));
        System.out.println(ipAddress + " is IP address? " + isIPAddress(ipAddress));
    }
}
