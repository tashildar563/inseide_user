package com.user.inside_user.repository;

import com.user.inside_user.entities.GeoDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GeoDetailsRepository extends JpaRepository<GeoDetails,Long> {
    GeoDetails findByName(String name);
}
