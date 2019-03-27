package com.example.managamentsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ManagamentSystemController {
    @Autowired
    ManagamentSystemApi managamentSystemApi;

    @GetMapping("/")
    public List<Employeer> getEmployeers() {
        return managamentSystemApi.getEmployeers();
    }


    @GetMapping("/app/addemployeer")
    public Employeer employeer(
            @RequestParam(value = "pensja") float pensja,
            @RequestParam(value = "czasPracy") int czasPracy,
            @RequestParam(value = "dniRobocze") int dniRobocze) {

        return managamentSystemApi.addEmployer(pensja, czasPracy, dniRobocze);
    }


}


 /*   public Employeer addEmployer(float pensja,int CzasPracy, int DniRobocze) {

        Employeer employeer = new Employeer(pensja, CzasPracy, DniRobocze);
        Employeers.add(employeer);
        return employeer;
    }
}
*/