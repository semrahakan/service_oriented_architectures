
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author INM381-User
 */
public class VserService {
    Cars[] CarsDB= new  Cars[4];
    
 //  public VserService(){}
   
   public VserService(){
       Cars car = new Cars();
        car.setId("1");
        car.setMake("bwm"); //make
        car.setModel("316i"); //model
        car.setMileage("1000");//mileage
        car.setPrice("45000");//price
        car.setYear("2010");//year
        CarsDB[0]=car;
      
        Cars car1 = new Cars();
        car1.setId("2");
        car1.setMake("auidi");
        car1.setModel("a3");
        car1.setMileage("1500");
        car1.setPrice("30000");
        car1.setYear("2012");
        CarsDB[1]=car1;
   
        Cars car2 = new Cars();
        car2.setId("3");
        car2.setMake("honda");
        car2.setModel("civic");
        car2.setMileage("2000");
        car2.setPrice("20000");
        car2.setYear("2005");
        CarsDB[2]=car2;
        
       Cars car3 = new Cars();  
       car3.setId("4");
       car3.setMake("mercedes");
       car3.setModel("c180");
       car3.setMileage("1000");
       car3.setPrice("35000");
       car3.setYear("2005");
       CarsDB[3]=car3;  
   } 
    public Cars[] searchVehicle(String make, String model, String mileage,String price, String year)
       {
       Cars[] search = new Cars[2];
       for(int i =0; i< CarsDB.length; i++){
        if(CarsDB[i].getMake().toLowerCase().equals(make.toLowerCase()) && CarsDB[i].getModel().toLowerCase().equals(model.toLowerCase())  && CarsDB[i].getMileage().toLowerCase().equals(mileage.toLowerCase()) && CarsDB[i].getPrice().toLowerCase().equals(price.toLowerCase())
                && CarsDB[i].getYear().toLowerCase().equals(year.toLowerCase()))
        {
            search[i] = CarsDB[i];
        
        }
        
             return search;
       }
       
       
        return CarsDB;
   }
    
         
     
    
}

    
    
 


   
   
    

