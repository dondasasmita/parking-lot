package parking_lot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import parking_lot.model.Area;
import parking_lot.model.AvailableLots;
import parking_lot.model.Value;
import parking_lot.service.ParkingLotService;

import java.util.ArrayList;

@RestController
@RequestMapping("/")
public class ParkingLotController {

    @Autowired
    ParkingLotService parkingLotService;
//
//
//    @RequestMapping("/")
//    public ArrayList<AvailableLots> getAvailableLots (@RequestParam(value = "area", defaultValue = "Marina") String area) {
//        return parkingLotService.getAvailableParkingLots(area);
//    }

    //modification trial
    @RequestMapping("/")
    public ArrayList<AvailableLots> getAvailableLots (@ModelAttribute Area area) {
        return parkingLotService.getAvailableParkingLots(area.getNameOfArea());
    }


//    @GetMapping("/parkinglots")
//    public String greetingForm(Model model) {
//        model.addAttribute("area", new Area());
//        return "/parkinglots";
//    }




}
