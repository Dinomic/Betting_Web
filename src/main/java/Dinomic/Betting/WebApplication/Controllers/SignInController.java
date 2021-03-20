package Dinomic.Betting.WebApplication.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class SignInController {

    @RequestMapping("/validateSignIn")
    public String validateSignIn(HttpServletRequest request, Model model){
        model.addAttribute("name", request.getParameter("Name"));
        model.addAttribute("role", request.getParameter("Role"));
        return "bookie/bookieHome";
    }

    @RequestMapping({"/", "/signIn"})
    public String home(Model model){
        return "signIn";
    }
}
