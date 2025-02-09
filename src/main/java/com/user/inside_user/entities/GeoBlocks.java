package com.user.inside_user.entities;

import jakarta.persistence.*;

@Entity
@Table(schema = "geo_blocks")
public class GeoBlocks {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    private String type;
    private String typeCode;
    private long geoBlockLevelId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public long getGeoBlockLevelId() {
        return geoBlockLevelId;
    }

    public void setGeoBlockLevelId(long geoBlockLevelId) {
        this.geoBlockLevelId = geoBlockLevelId;
    }
}
