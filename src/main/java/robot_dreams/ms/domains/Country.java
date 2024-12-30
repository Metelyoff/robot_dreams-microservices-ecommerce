package robot_dreams.ms.domains;

import java.util.Currency;
import java.util.List;

class Country extends Entity {
    private String code;
    private String name;
    private List<Translation> translations;
    private Currency currency;
    private Language language;
    private String phoneCode;
    private String timeZone;
}
