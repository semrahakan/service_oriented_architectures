/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author INM381-User
 */
public class VstoS {
    // this is for save searches
    VserService search = new VserService();
    private String idCar;
     //if the id is the same with VserService, according to that id( which one user want to save) return an array of these values.
    public VstoS (){}
    public Cars[] SaveSearch(String idCar1){
         
         Cars[] search1 = new Cars[4];
         
         this.idCar = idCar1;
         for(int i =0; i< search.CarsDB.length; i++){
         if( search.CarsDB[i].getId().equals(idCar) || search.CarsDB[i].getId().equals(idCar))   
         {    
             search1[i] = search.CarsDB[i];}
     }
         return search1;
             
      
         }
      public Cars[]SeeSavedSearch(String idCar1){
         
         Cars[] search2 = new Cars[4];
         
         this.idCar = idCar1;
         for(int i =0; i< search.CarsDB.length; i++){
         if( search.CarsDB[i].getId().equals(idCar) || search.CarsDB[i].getId().equals(idCar))   
         {    
             search2[i] = search.CarsDB[i];}
     }
         return search2;
             
      
         }  
}
