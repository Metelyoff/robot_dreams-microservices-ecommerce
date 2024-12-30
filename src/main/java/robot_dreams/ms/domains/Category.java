package robot_dreams.ms.domains;

import java.net.URI;
import java.util.List;

class Category extends Entity {
    private String name;
    private String description;
    private List<Translation> translations;
    private URI imageUrl;
    private Category parentCategory;
    private List<Category> childCategories;
}
