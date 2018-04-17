
package flyable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class flyer implements flyable{

    private List<flyable> flyers = new ArrayList<flyable>();
    
    public void add(flyable f){
        flyers.add(f);
    }
    
    public void remove(flyable f){
        flyers.remove(f);
    }
    
    public void getDetails(){
        
        flyers.forEach((f) -> {
            f.getDetails();
        });
}

    
}
    class flightBhvr implements flyable{
        
    public String flightbhvr;
    
    
    
    public void setFlightBhvr(String fb){
        this.flightbhvr = fb;
    }
    
    public void removeFlightBhvr(){
        this.flightbhvr = null;
    }
    
     public void getDetails(){
        
         System.out.println(flightbhvr);
        }
    
    }




class solution{
    public static void main(String[] args){
        
        flightBhvr helibhvr = new flightBhvr();
        helibhvr.setFlightBhvr("increasing altitude");
        
   

        flyer x = new flyer();
        x.add(helibhvr);
        
        
        
        flightBhvr pontoon = new flightBhvr();
        pontoon.setFlightBhvr("lNDING ON WATER");
        
        x.add(pontoon);
        
        x.getDetails();
        
        flyer z = new flyer();
        z.add(x);
        
        z.getDetails();
    }
}


