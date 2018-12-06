/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author INM381-User
 */
public class VomS {
    //this enables user to make an offer
    int vehicle;
    int money;
UserProfile profile = new UserProfile();
 public VomS(){}
 public boolean giveOffer(int vehiclePrice, int money) // vehiclePrice and money are taken from client
 {
     this.money=money;
     this.vehicle=vehiclePrice;
     
     if( vehiclePrice <= money )
     {
         return true;
     }
                return false;
     
 }
    
    
}
