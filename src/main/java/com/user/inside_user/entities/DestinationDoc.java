package com.user.inside_user.entities;

import jakarta.persistence.*;

@Entity
@Table(schema = "destination_doc")
public class DestinationDoc {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    private long desinationId;
    private String descriptionDocId;
    private boolean isDeleted;
    private String photoId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getDesinationId() {
        return desinationId;
    }

    public void setDesinationId(long desinationId) {
        this.desinationId = desinationId;
    }

    public String getDescriptionDocId() {
        return descriptionDocId;
    }

    public void setDescriptionDocId(String descriptionDocId) {
        this.descriptionDocId = descriptionDocId;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public String getPhotoId() {
        return photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }
}
