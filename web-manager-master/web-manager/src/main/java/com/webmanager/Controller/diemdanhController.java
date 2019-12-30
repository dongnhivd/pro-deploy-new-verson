package com.webmanager.Controller;

import com.webmanager.Dao.diemdanhService;
import com.webmanager.Model.diem_danh;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class diemdanhController {
    @Autowired
    private diemdanhService employ;


    @GetMapping("/employee")
    public List<diem_danh> getEmployee() {
        return (List<diem_danh>) employ.findAll();
    }
}
