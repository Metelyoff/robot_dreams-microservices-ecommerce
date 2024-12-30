package robot_dreams.ms.domains;

import java.net.URI;
import java.util.List;

class Product extends Entity {
    private String name;
    private String description;
    private List<Translation> translations;
    private Brand brand;
    private Category category;
    private Supplier supplier;
    private URI imageUrl;
    private List<SKU> skus;
    private List<Review> reviews;
}
