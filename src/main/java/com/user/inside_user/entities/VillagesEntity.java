package com.user.inside_user.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(schema = "villages")
public class VillagesEntity {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    private String name;
    private String censusCode;
    private String villageCode;
    private String parentGeoDetailsId;
    private String pincode;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    private String createdBy;
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedOn;
    private String updatedBy;
    private boolean isDeleted;

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

    public String getCensusCode() {
        return censusCode;
    }

    public void setCensusCode(String censusCode) {
        this.censusCode = censusCode;
    }

    public String getVillageCode() {
        return villageCode;
    }

    public void setVillageCode(String villageCode) {
        this.villageCode = villageCode;
    }

    public String getParentGeoDetailsId() {
        return parentGeoDetailsId;
    }

    public void setParentGeoDetailsId(String parentGeoDetailsId) {
        this.parentGeoDetailsId = parentGeoDetailsId;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
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

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}
