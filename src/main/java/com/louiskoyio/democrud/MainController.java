package com.louiskoyio.democrud;


import com.louiskoyio.democrud.player.PlayerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    PlayerRepository playerRepository;
    @GetMapping("")
    public String showHomepage(){
        return "index";
    }

    @GetMapping("/register")
    public String registerAPlayer(){
        return "register";
    }

    @GetMapping("/teams")
    public String showTeams(Model model){
        model.addAttribute("teams", playerRepository.findAll());
        return "teams";
    }
    @GetMapping("/fixtures")
    public String showFixtures(){
        return "fixtures";
    }
}
