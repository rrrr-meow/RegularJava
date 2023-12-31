import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularJava {
    /**
     * Метод валидации IP-адреса
     * @param ip
     * @return
     */
    public static boolean validIp(String ip)
    {
        String pattern = "^((25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)$";
        return Pattern.matches(pattern, ip);
    }

    /**
     * Метод валидации GUID
     * @param guid
     * @return
     */
    public static boolean validGUID(String guid)
    {
        String pattern = "^[0-9a-fA-F]{8}-([0-9a-fA-F]{4}-){3}[0-9a-fA-F]{12}$";
        return Pattern.matches(pattern, guid);
    }

    /**
     * Метод валидации URL адреса
     * @param url
     * @return
     */
    public static boolean validURl(String url)
    {
        Pattern ip = Pattern.compile("^((\\d{1,3})\\.){3}(\\d{1,3})");
        Matcher matcher = ip.matcher(url);
        if (matcher.find()) return false;
        else {
            String pattern = "^(https?://)?(www\\.)?(((?!www\\b)[\\w][\\w-]*[\\w](\\.[\\w][\\w-]*[\\w]+)+))(:[0-9]+)?(/[^?#]*)?(\\?[^#]*=.*)?(#.*)?$";
            return Pattern.matches(pattern,url);
        }
    }

    /**
     * Метод валидации пароля
     * @param password
     * @return
     */
    public static boolean validPassword(String password)
    {
        String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[\\w]{8,}$";   // ?= заглядывание вперед
        return Pattern.matches(pattern, password);

    }
}
