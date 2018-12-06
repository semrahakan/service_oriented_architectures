

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author INM381-User
 */
public class Cars implements java.io.Serializable {
    private String id;
    private String price;
    private String mileage;
    private String make;
    private String model;
    private String year;
    
  public Cars(){}
  
    public  Cars(String id,String make, String model, String mileage,String price, String year){
        this.id =id;
        this.price = price;
        this.make= make;
        this.mileage= mileage;
        this.model= model;
        this.year= year;
    
    
    }
     public String getPrice() {
        return price;
    }

    public String getMileage() {
        return mileage;
    }


    public String getMake() {
        return make;
    }

   
    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

  
    public void setPrice(String price) {
        this.price = price;
    }

   
    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    
    public void setMake(String make) {
        this.make = make;
    }

   
    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
      
}
