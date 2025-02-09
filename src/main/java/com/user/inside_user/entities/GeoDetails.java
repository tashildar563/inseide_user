package com.user.inside_user.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(schema = "geo_details")
public class GeoDetails {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    private String name;
    private String code;
    private String parentHierarchy;
    private long immediateParentId;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    private String createdBy;
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedOn;
    private String updatedBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getParentHierarchy() {
        return parentHierarchy;
    }

    public void setParentHierarchy(String parentHierarchy) {
        this.parentHierarchy = parentHierarchy;
    }

    public long getImmediateParentId() {
        return immediateParentId;
    }

    public void setImmediateParentId(long immediateParentId) {
        this.immediateParentId = immediateParentId;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
}
