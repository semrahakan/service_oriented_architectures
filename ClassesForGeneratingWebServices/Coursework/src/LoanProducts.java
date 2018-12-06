/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author INM381-User
 */
public class LoanProducts implements java.io.Serializable{
    private String borrow; // money
    private String period; // months
    private String payment; // monthly payment
    private String totalPayment; 
    private String lender; // different lenders
    private String idLoan; // to identify the loan of the user interest 
    private String cars; // interested cars
    private String userID;
    
    public LoanProducts(){}
    public LoanProducts(String borrow, String period, String payment, String totalPayment, String lender, String idLoan)
    {
        this.borrow= borrow;
        this.lender= lender;
        this.period= period;
        this.payment = payment;
        this.totalPayment= totalPayment;
    
    
    }
    /**
     * @return the borrow
     */
    public String getBorrow() {
        return borrow;
    }

    /**
     * @param borrow the borrow to set
     */
    public void setBorrow(String borrow) {
        this.borrow = borrow;
    }

    /**
     * @return the period
     */
    public String getPeriod() {
        return period;
    }

    /**
     * @param period the period to set
     */
    public void setPeriod(String period) {
        this.period = period;
    }

    /**
     * @return the payment
     */
    public String getPayment() {
        return payment;
    }

    /**
     * @param payment the payment to set
     */
    public void setPayment(String payment) {
        this.payment = payment;
    }

    /**
     * @return the totalPayment
     */
    public String getTotalPayment() {
        return totalPayment;
    }

    /**
     * @param totalPayment the totalPayment to set
     */
    public void setTotalPayment(String totalPayment) {
        this.totalPayment = totalPayment;
    }

    /**
     * @return the lender
     */
    public String getLender() {
        return lender;
    }

    /**
     * @param lender the lender to set
     */
    public void setLender(String lender) {
        this.lender = lender;
    }

    /**
     * @return the idLoan
     */
    public String getIdLoan() {
        return idLoan;
    }

    /**
     * @param idLoan the idLoan to set
     */
    public void setIdLoan(String idLoan) {
        this.idLoan = idLoan;
    }

    /**
     * @return the cars
     */
    public String getCars() {
        return cars;
    }

    /**
     * @param cars the cars to set
     */
    public void setCars(String cars) {
        this.cars = cars;
    }

    /**
     * @return the userID
     */
    public String getUserID() {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }
    
    
}
