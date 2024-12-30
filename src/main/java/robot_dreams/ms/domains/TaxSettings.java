package robot_dreams.ms.domains;

import java.math.BigDecimal;
import java.util.List;

class TaxSettings extends Entity {
    private String name;
    private String description;
    private List<Translation> translations;
    private BigDecimal rate;
    private boolean isActive;
}
