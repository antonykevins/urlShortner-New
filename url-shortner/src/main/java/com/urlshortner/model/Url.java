package com.urlshortner.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "url")
public class Url {
    private String id;
    private String longUrl;

    public Url() {

    }

    public Url(String id, String longUrl) {
        this.id = id;
        this.longUrl = longUrl;
    }

    @Id
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    @Column(name = "long_url", nullable = false)
    public String getLongUrl() {
        return longUrl;
    }
    public void setLongUrl(String longUrl) {
        this.longUrl = longUrl;
    }
}
