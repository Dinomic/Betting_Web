package Dinomic.Betting.WebApplication.Controllers.Bookie;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookieHomeController {

    @RequestMapping("bookie/home")
    public String bookieHome(){
        return "bookie/bookieHome";
    }
}
