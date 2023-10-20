import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularJava {
    public static boolean validIp(String ip)
    {
        //Pattern pattern = Pattern.compile("((0|1\\d{0,2}|2([0-4][0-9]|5[0-5]))\\.){3}(0|1\\d{0,2}|2([0-4][0-9]|5[0-5]))");
        String pattern = "^((\\d{1,3})\\.){3}(\\d{1,3})";
        if (Pattern.matches(pattern,ip))
        {
            String[] s = ip.split("\\.");
            for (String str : s) {
                if (!(Integer.parseInt(str) >= 0 && Integer.parseInt(str) <= 255)) return false;
            }
            return true;
        }
        else return false;
    }
    public static boolean validGUID(String guid)
    {
        String pattern = "^[0-9a-fA-F]{8}-([0-9a-fA-F]{4}-){3}[0-9a-fA-F]{12}$";
        return Pattern.matches(pattern, guid);
    }
    public static boolean validURl(String url)
    {
        Pattern ip = Pattern.compile("^((\\d{1,3})\\.){3}(\\d{1,3})");
        Matcher matcher = ip.matcher(url);
        if (matcher.find()) return false;
        else {
            //String pattern = "^(https?://)?([0-9a-zA-Z][0-9a-zA-Z-]*[0-9a-zA-Z](\\.[0-9a-zA-Z][0-9a-zA-Z-]*[0-9a-zA-Z]+)+)(:[0-9]+)?(/[^?#]*)?(\\?[^#]*=.*)?(#.*)?$";
            String pattern = "^(https?://)?(www\\.)?(((?!www\\b)[\\w][\\w-]*[\\w](\\.[\\w][\\w-]*[\\w]+)+))(:[0-9]+)?(/[^?#]*)?(\\?[^#]*=.*)?(#.*)?$";
            //String pattern = "^(https?://)?((www)(\\.[\\w][\\w-]*[\\w]+){2,})|(\\.[\\w][\\w-]*[\\w]+){2,}))(:[0-9]+)?(/[^?#]*)?(\\?[^#]*=.*)?(#.*)?$";
            return Pattern.matches(pattern,url);
        }
    }
    public static boolean validPassword(String password)
    {
        String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[\\w]{8,}$";   // ?= заглядывание вперед
        return Pattern.matches(pattern, password);

    }
}
