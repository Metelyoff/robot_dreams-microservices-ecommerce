package robot_dreams.ms.domains;

import java.util.List;

class BlogPost extends Entity {
    private String title;
    private String content;
    private User author;
    private List<Comment> comments;
}
