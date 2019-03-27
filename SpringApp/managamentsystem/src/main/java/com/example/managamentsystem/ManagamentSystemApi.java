package com.example.managamentsystem;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Service

public class ManagamentSystemApi {
    List<Employeer> Employeers = new ArrayList<>();

    public List<Employeer> getEmployeers(){
        return Employeers;
    }


   public Employeer addEmployer(float pensja,int CzasPracy, int DniRobocze){

        Employeer employeer = new Employeer(pensja, CzasPracy, DniRobocze);
        Employeers.add(employeer);
        return employeer;
    }


}


