/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author INM381-User
 */
public class CardDetails implements java.io.Serializable {
    
    private String cardType;
    private String amount;
    private String cardNumber;
    
    public CardDetails(){}
    
    public CardDetails(String cardType, String amount, String cardNumber){
    
        this.amount=amount;
        this.cardNumber=cardNumber;
        this.cardType=cardType;
        
    
    
    }

    /**
     * @return the cardType
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * @param cardType the cardType to set
     */
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    /**
     * @return the amount
     */
    public String getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * @return the cardNumber
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * @param cardNumber the cardNumber to set
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    
}
