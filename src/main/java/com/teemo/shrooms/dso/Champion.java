package com.teemo.shrooms.dso;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CHAMPION")
public class Champion extends BaseEntity{

    @Column(name = "key")
    private Long key;

    @Column(name = "name")
    private String name;

    @Column(name = "title")
    private String title;

    @Column(name = "image")
    private String image;

    public Long getKey() {
        return key;
    }
    public void setKey(Long key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }

}
