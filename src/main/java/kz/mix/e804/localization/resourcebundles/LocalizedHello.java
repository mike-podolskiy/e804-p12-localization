//CHECKSTYLE:OFF
package kz.mix.e804.localization.resourcebundles;

import java.util.*;

/**
 * Created by Podolskiy.Mikhail on 18.05.2016.
 */
public class LocalizedHello {
    public static void main(String args[]) {
        Locale currentLocale = Locale.getDefault();
        ResourceBundle resBundle =
                ResourceBundle.getBundle("ResourceBundle", currentLocale);
        System.out.printf(resBundle.getString("Greeting"));
    }
}
