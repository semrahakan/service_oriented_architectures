
/**
 * BpelServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */

    package org.netbeans.j2ee.wsdl.bpelmodule2.src.newwsdl;

    /**
     *  BpelServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class BpelServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public BpelServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public BpelServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for saveLoanProducts method
            * override this method for handling normal response from saveLoanProducts operation
            */
           public void receiveResultsaveLoanProducts(
                    org.netbeans.j2ee.wsdl.bpelmodule2.src.newwsdl.BpelServiceStub.SaveLoanProductsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from saveLoanProducts operation
           */
            public void receiveErrorsaveLoanProducts(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for cardPayment method
            * override this method for handling normal response from cardPayment operation
            */
           public void receiveResultcardPayment(
                    org.netbeans.j2ee.wsdl.bpelmodule2.src.newwsdl.BpelServiceStub.CardPaymentResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from cardPayment operation
           */
            public void receiveErrorcardPayment(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for carOffer method
            * override this method for handling normal response from carOffer operation
            */
           public void receiveResultcarOffer(
                    org.netbeans.j2ee.wsdl.bpelmodule2.src.newwsdl.BpelServiceStub.CarOfferResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from carOffer operation
           */
            public void receiveErrorcarOffer(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for retrieveLoans method
            * override this method for handling normal response from retrieveLoans operation
            */
           public void receiveResultretrieveLoans(
                    org.netbeans.j2ee.wsdl.bpelmodule2.src.newwsdl.BpelServiceStub.RetrieveLoansResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from retrieveLoans operation
           */
            public void receiveErrorretrieveLoans(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fileLoanApp method
            * override this method for handling normal response from fileLoanApp operation
            */
           public void receiveResultfileLoanApp(
                    org.netbeans.j2ee.wsdl.bpelmodule2.src.newwsdl.BpelServiceStub.FileLoanAppResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fileLoanApp operation
           */
            public void receiveErrorfileLoanApp(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for findVehicle method
            * override this method for handling normal response from findVehicle operation
            */
           public void receiveResultfindVehicle(
                    org.netbeans.j2ee.wsdl.bpelmodule2.src.newwsdl.BpelServiceStub.FindVehicleResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from findVehicle operation
           */
            public void receiveErrorfindVehicle(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for searchLoan method
            * override this method for handling normal response from searchLoan operation
            */
           public void receiveResultsearchLoan(
                    org.netbeans.j2ee.wsdl.bpelmodule2.src.newwsdl.BpelServiceStub.SearchLoanResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from searchLoan operation
           */
            public void receiveErrorsearchLoan(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for saveVehicle method
            * override this method for handling normal response from saveVehicle operation
            */
           public void receiveResultsaveVehicle(
                    org.netbeans.j2ee.wsdl.bpelmodule2.src.newwsdl.BpelServiceStub.SaveVehicleResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from saveVehicle operation
           */
            public void receiveErrorsaveVehicle(java.lang.Exception e) {
            }
                


    }
    