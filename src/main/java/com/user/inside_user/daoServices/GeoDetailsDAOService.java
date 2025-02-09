package com.user.inside_user.daoServices;

import com.user.inside_user.entities.GeoDetails;
import com.user.inside_user.repository.GeoDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeoDetailsDAOService {
    @Autowired
    private GeoDetailsRepository geoDetailsRepository;

    public GeoDetails getGeoDetailsByName(String name){
        return geoDetailsRepository.findByName(name);
    }
    public GeoDetails save(GeoDetails geoDetails){
        return geoDetailsRepository.save(geoDetails);
    }
}
