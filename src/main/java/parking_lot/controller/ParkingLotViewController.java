package parking_lot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import parking_lot.model.Area;
import parking_lot.model.AvailableLots;
import parking_lot.model.Value;
import parking_lot.service.ParkingLotService;

import java.util.ArrayList;

@Controller
public class ParkingLotViewController {


    @GetMapping("/parkinglots")
    public String greetingForm(Model model) {
        model.addAttribute("area", new Area());
        return "parkinglots";
    }

//    //modification trial
//    @RequestMapping("/")
//    public ArrayList<AvailableLots> getAvailableLots (@ModelAttribute Area area) {
//        return parkingLotService.getAvailableParkingLots(area.getNameOfArea());
//    }


//    @RequestMapping(value = {"/parkinglots"}, method = RequestMethod.GET)
//    public ModelAndView login() {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("parkinglots");
//        return modelAndView;
//    }
//

//    @PostMapping("/parking-lots")
//    public String getAvailableLots(@ModelAttribute Area area) {
//        return "results";
//    }
}
