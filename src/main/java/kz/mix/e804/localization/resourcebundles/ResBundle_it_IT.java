//CHECKSTYLE:OFF
package kz.mix.e804.localization.resourcebundles;

import java.util.ListResourceBundle;

public class ResBundle_it_IT extends ListResourceBundle {
    public Object[][] getContents() {
        return contents;
    }

    static final Object[][] contents = {
            { "MovieName", "Che Bella Giornata" },
            { "GrossRevenue", (Long) 43000000L }, // in euros
            { "Year", (Integer)2011 }
    };
}
