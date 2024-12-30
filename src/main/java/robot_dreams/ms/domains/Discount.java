package robot_dreams.ms.domains;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

class Discount extends Entity {
    private String promoCode;
    private String name;
    private String description;
    private List<Translation> translations;
    private BigDecimal percentage;
    private LocalDateTime validFrom;
    private LocalDateTime validUntil;
    private boolean active;
}
