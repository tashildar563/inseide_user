package com.user.inside_user.service.travelDetailsService;

import com.user.inside_user.entities.DestinationEntity;
import com.user.inside_user.entities.GeoDetails;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

public class TravelDetailsService {
    public static void addTravelDetails(String destination, Map<String,String> address, MultipartFile doc, String description){
        DestinationEntity destinationEntity = addDestination(destination,address,description);
    }

    private static DestinationEntity addDestination(String destination, Map<String,String> address, String description) {
        DestinationEntity destinationEntity = new DestinationEntity();
        destinationEntity.setCode(generteDestinationCode(destination,address));
        return null;
    }

    private static String generteDestinationCode(String destination, Map<String, String> address) {
        String des = destination.toUpperCase().replace(" ","").substring(0,2);
        String pincode = address.get("pincode");
        String state = address.get("state");
        String dist = address.get("district");
        String village = address.get("village");
        String censusCode = address.get("census_code");
        return null;
    }

}
/*
* destination:"",
* address:"",
* user_details:"",
* img:MULTIPART_FORM_DATA_VALUE,
* description:""
* */
