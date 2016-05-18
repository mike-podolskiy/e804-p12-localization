//CHECKSTYLE:OFF
package kz.mix.e804.localization.resourcebundles;

import java.util.ListResourceBundle;

public class ResBundle_ru_RU extends ListResourceBundle {
    public Object[][] getContents() {
        return contents;
    }

    static final Object[][] contents = {
            { "MovieName", "Avatar" },
            { "GrossRevenue", (Long) 2782275172L }, // in US dollars
            { "Year", (Integer)2009 }
    };
}
