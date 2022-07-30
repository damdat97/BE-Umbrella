package beumbrella.model;

import javax.persistence.*;

@Entity
@Table(name = "images")
public class Image {
    @Id
    private Long id;

    private String images;

    public Image() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }
}
