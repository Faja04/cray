package com.cray.entity;


import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class Post extends EntityBase {
    private String title;
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Post)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Post post = (Post) o;
        return Objects.equals(title, post.title) &&
                Objects.equals(description, post.description);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), title, description);
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                super.toString() + '}';
    }
}
