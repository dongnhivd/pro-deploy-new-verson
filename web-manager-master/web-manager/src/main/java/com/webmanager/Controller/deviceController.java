package com.webmanager.Controller;

import com.webmanager.Dao.deviceSevice;
import com.webmanager.Model.device;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class deviceController {
    @Autowired
    private deviceSevice dao;


    @GetMapping("/device")
    public List<device> getDevice() {
        return (List<device>) dao.findAll();
    }

}
