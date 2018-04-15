
package flyable;

import java.util.Scanner;

public abstract class canFly implements flyable{
    
    String takeOff;
    String landing;
    
    public canFly(){
            }
    
    public String takeOffBehaviour(){
        this.setTakeOffBehaviour();
        return this.takeOff;
    };
    
    public String landingBehaviour(){
        this.setLandingBehaviour();
        return this.landing;
        
    
    }
    
     void setTakeOffBehaviour(){
         
        heli heli1 = new heli();
        plane plane1 = new plane();
        pontoon pontoon1 = new pontoon();
         
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("how do you want this flying object to take off?\n 1 for helicopter takeoff. \n 2 for plane takeoff. \n 3 for pontoon takeoff.");
        
        while(n < 1 || n > 3){
         
            n = sc.nextInt();
           }
        
        switch(n){
            case 1: this.takeOff = heli1.takeOffBehaviour();
            break;
            case 2: this.takeOff = plane1.takeOffBehaviour();
            break;
            case 3: this.takeOff = pontoon1.takeOffBehaviour();
            break;
            default:this.takeOff = sc.nextLine();
            break;
        }

    }
     
    void setLandingBehaviour(){
        
        heli heli1 = new heli();
        plane plane1 = new plane();
        pontoon pontoon1 = new pontoon();
        
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("how do you want this flying object to land?\n 1 for helicopter landing. \n 2 for plane landing. \n 3 for pontoon landing.");
        
        while(n < 1 || n > 3){
         
            n = sc.nextInt();
           }
        
        switch(n){
            case 1: this.landing = heli1.landingBehaviour();
            break;
            case 2: this.landing = plane1.landingBehaviour();
            break;
            case 3: this.landing = pontoon1.landingBehaviour();
            break;
            default: this.landing = sc.nextLine();
        }

    }
    
    
    
public static void main(String[] args) {
    
    canFly xplane = new canFly(){};
    System.out.println(xplane.takeOffBehaviour());
    System.out.println(xplane.landingBehaviour());
       
    
    }

}

class heli extends canFly{

    
    public String takeOffBehaviour() {
        
       return "I am increasing my hover altitude\n";
    }

    
    public String landingBehaviour() {
        return "I am lowering my hover altitude\n";
    }
    
}

class plane extends canFly{

    public String takeOffBehaviour() {
       return "I am taking off from the runway\n";
    }

    public String landingBehaviour() {
        return "I am landing on the runway\n";
    }

    
}

class pontoon extends canFly{

    public String takeOffBehaviour() {
        return "I am taking off from the water\n";
    }

    public String landingBehaviour() {
        return "I am landing on the water\n";
    }
    
}

