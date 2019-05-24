package com.cricket.wc2019.Controllers;

import com.cricket.wc2019.Services.ManiacService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ManiacController {

    @Autowired
    ManiacService service;

    @PostMapping("/submitTeam")
    public void saveTeam(@RequestHeader String maniacName, @RequestHeader List<String> team, @RequestHeader String orange, @RequestHeader String purple)
    {

        service.submitTeam(team,orange,purple,maniacName);

    }
}
