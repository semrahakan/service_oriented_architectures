/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author INM381-User
 */
public class CpayS {
    
    
CardDetails[] detail = new CardDetails[3];
//LappS submission = new LappS(); // for functionality 8
public CpayS()
{
    CardDetails cd = new CardDetails();
    cd.setCardType("masterCard");
    cd.setCardNumber("5105105105105100");
    cd.setAmount("10000");
    detail[0]= cd;
    
    CardDetails cd1 = new CardDetails();
    cd1.setCardType("AmericanExpress");
    cd1.setCardNumber("378282246310005");
    cd1.setAmount("25000");
    detail[1]=cd1;
    
    CardDetails cd2 = new CardDetails();
     cd2.setCardType("visa");
    cd2.setCardNumber("4222222222222");
    cd2.setAmount("50000");
    detail[2]=cd2;
}
    public boolean resultPayment(String CardType,String CardNumber, String Amount,String userID)
    {
       for(int i =0; i< detail.length; i++){
           if(detail[i].getCardType().toLowerCase().equals(CardType.toLowerCase()) && detail[i].getCardNumber().toLowerCase().equals(CardNumber.toLowerCase())
                && detail[i].getAmount().toLowerCase().equals(Amount.toLowerCase())){
              return true;
       }
       }
        return false;
        }
        
    
    
}

    
    
    

