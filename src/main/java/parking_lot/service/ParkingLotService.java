package parking_lot.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import parking_lot.model.AvailableLots;
import parking_lot.model.CarParkRoot;

import java.util.ArrayList;


@Service("parkinglotservice")
public class ParkingLotService {

    @Autowired
    RestTemplate restTemplate;

    @Value("${parkinglot.apiKey}")
    private String apiKey;

    //method that get the API Key to the header
    public HttpHeaders sendApiKeyInHeader() {
        HttpHeaders header = new HttpHeaders();
        header.add("AccountKey",apiKey);
        return header;
    }

    public ArrayList<AvailableLots> getAvailableParkingLots(String area) {

        //sending API key in the query
        HttpEntity<String> request = new HttpEntity<>(sendApiKeyInHeader());

        //the url query
        String url = "http://datamall2.mytransport.sg/ltaodataservice/CarParkAvailabilityv2";

        //using restTemplate to send the request
        CarParkRoot response = restTemplate.exchange(url, HttpMethod.GET,request,CarParkRoot.class).getBody();

        //arraylist to store the parking lots that has the same String area
        ArrayList<AvailableLots> response2 = new ArrayList<>();

        //check for development field that has the same String area
        for (int i = 0; i < response.getValue().length; i++) {

            if (response.getValue()[i].getDevelopment().contains(area)) {

                //create new obj of AvailableLots to add to the arraylist
                AvailableLots obj = new AvailableLots();
                obj.setCarParkID(response.getValue()[i].getCarParkID());
                obj.setArea(response.getValue()[i].getArea());
                obj.setAvailableLots(response.getValue()[i].getAvailableLots());
                obj.setDevelopment(response.getValue()[i].getDevelopment());
                obj.setLotType(response.getValue()[i].getLotType());
                response2.add(obj);
            }
            else continue;
        }
        return response2;

    }
}
