/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author INM381-User
 */
public class Lbros {
   
    //protected String idCars
    LoanProducts[] loanDB= new  LoanProducts[3];
    
    
    public Lbros(){
        
    LoanProducts loan = new LoanProducts();
    loan.setIdLoan("1");
    loan.setBorrow("10.000");
    loan.setLender("NationWideBank");
    loan.setPayment("£181PerMounth");  
    loan.setPeriod("60Mounths");
    loan.setTotalPayment("10.874");
    loan.setCars("bwm");
   
    loanDB[0]=loan;
    
    LoanProducts loan1 = new LoanProducts();
    loan1.setIdLoan("2");
    loan1.setBorrow("11.000");
    loan1.setLender("barclaysBank");
    loan1.setPayment("£206PerMounth");
    loan1.setPeriod("60Mounths");
    loan1.setTotalPayment("12.392");
    loan1.setCars("auidi");
    loanDB[1]=loan1;
    
    LoanProducts loan2 = new LoanProducts();
    loan2.setIdLoan("3");
    loan2.setBorrow("8.000");
    loan2.setLender("Sainsburry'sBank");
    loan2.setPayment("£687PerMounth");
    loan2.setPeriod("12Mounths");
    loan2.setTotalPayment("8.141");
    loan2.setCars("bwm");
    loanDB[2]=loan2;
    }
   //  public LoanProducts[] searchAllLoans(){
      //return loanDB;
  // }
    // if it is matched with user interested car 
   public LoanProducts[] searchLoan(String userCar){
        
        LoanProducts[] search2 = new LoanProducts[3];    
        for(int i =0; i< loanDB.length; i++){
            if(loanDB[i] != null){
        if(loanDB[i].getCars().toLowerCase().equals(userCar.toLowerCase())){
               search2[i]= loanDB[i]; 
               
        }
            }    
   }
        return search2;
   }
   public LoanProducts[] returnsearchLoan(String userCar){
        
        LoanProducts[] search3 = new LoanProducts[3];    
        for(int i =0; i< loanDB.length; i++){
            if(loanDB[i] != null){
        if(loanDB[i].getCars().toLowerCase().equals(userCar.toLowerCase())){
               search3[i]= loanDB[i]; 
               
        }
            }    
   }
        return search3;
   }
}

