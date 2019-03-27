package com.example.managamentsystem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@NoArgsConstructor



public class Employeer {
   private float pensja;
   private int czasPracy; //w godzinach
   private int dniRobocze;

   public Employeer(float pensja, int czasPracy, int dniRobocze){
       this.czasPracy = czasPracy;
       this.pensja = pensja;
       this.dniRobocze = dniRobocze;
   }
}

class Manager extends Employeer{
   private int premia;

    public Manager(float pensja, int czasPracy, int dniRobocze) {
        super(pensja, czasPracy, dniRobocze);
    }
}




