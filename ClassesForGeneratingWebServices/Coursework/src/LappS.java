/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author INM381-User
 */
public class LappS {
    // this is for save loans. if the parameter is match with loan id
    Lbros saveLoan = new Lbros();
    UserProfile user = new UserProfile();
    private String idLoan;
    private String userID;
    private String userID1;
    public LappS(){}
    public LoanProducts[] SaveLloan(String idLoan, String userID) //save the loan
    {
       // LoanProducts products = new  LoanProducts();
        this.idLoan= idLoan;
        this.userID=userID;
        
        LoanProducts[] save = new LoanProducts[3];
      
        
        for(int i =0; i < saveLoan.loanDB.length; i++)
        {
            if(saveLoan.loanDB[i].getIdLoan().toLowerCase().equals(idLoan.toLowerCase()))  
              {
                saveLoan.loanDB[i].setUserID(userID);
                  save[i]= saveLoan.loanDB[i];
              
              }
            
            
        }
        return   save;
        
    }
    public LoanProducts[] retrieveLoan(String userID) //retrieve loans according to userid
    {
       
        LoanProducts[] retrieve = new LoanProducts[3];
      
      for(int i =0; i < saveLoan.loanDB.length; i++)
      {
        
        if(userID.equals(saveLoan.loanDB[i].getUserID()))
        {
           retrieve[i]= saveLoan.loanDB[i];
        }  
        
            
      } return retrieve;   
    }
    public boolean loanApp( String userID ) // to submit loan
    {
       LoanProducts[] submit = new LoanProducts[3];
       for(int i =0; i < saveLoan.loanDB.length; i++)
       {
      if(userID.equals(saveLoan.loanDB[i].getUserID()))
        {
            submit[i]= saveLoan.loanDB[i];
             return true;
        }
    }
       return false;
       
    }
    
}
