/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author INM381-User
 */
public class UserProfile implements java.io.Serializable{
    private String idUser;
    private String InterestedCar;
    VserService search = new VserService();
    
    public UserProfile(){}
    public UserProfile(String idUser,String InterestedCar ){
    
        this.InterestedCar= InterestedCar;
        this.idUser = idUser;
       
    
    }

    /**
     * @return the idUser
     */
    public String getIdUser(String idUser) {
        return idUser;
    }

    /**
     * @param idUser the idUser to set
     */
    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    /**
     * @return the InterestedCar
     */
    public String getInterestedCar() {
        return InterestedCar;
    }

    /**
     * @param InterestedCar the InterestedCar to set
     */
    public void setInterestedCar(String InterestedCar) {
        this.InterestedCar = InterestedCar;
    }
    
}
