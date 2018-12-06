/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.j2ee.wsdl.bpelmodule2.src.newwsdl;

import java.util.Scanner;

/**
 *
 * @author INM381-User
 */
public class NewClass {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] car = new String[5];
        String carType;
        String[] card = new String[3];
        String userID;
        String idLoan;
        String idCar;
        try {

            BpelServiceStub stub = new BpelServiceStub();


            BpelServiceStub.FindVehicle vehicle = new BpelServiceStub.FindVehicle();
            //write search car parameters
            System.out.println("***  WELCOME TO VPS ***");
            System.out.println(" PLEASE SCEARH FOR CARS...");
            System.out.print("make:");
            car[0] = scan.next();
            vehicle.setMake(car[0]);
            System.out.print("model:");
            car[1] = scan.next();
            vehicle.setModel(car[1]);
            System.out.print("mileage:");
            car[2] = scan.next();
            vehicle.setPart5(car[2]);
            System.out.print("price:");
            car[3] = scan.next();
            vehicle.setPrice(car[3]);
            System.out.print("year:");
            car[4] = scan.next();
            vehicle.setYear(car[4]);

            BpelServiceStub.FindVehicleResponse vehicleRes = stub.findVehicle(vehicle);
            BpelServiceStub.Cars carRes = vehicleRes.getCar();

            // response of bpel for search car
            System.out.println(" the search result is: " + "," + carRes.getMake() + "," + carRes.getMileage() + "," + carRes.getModel() + "," + carRes.getPrice() + "," + carRes.getYear());

            // save search cars..
            BpelServiceStub.SaveVehicle saveVeh = new BpelServiceStub.SaveVehicle();
            System.out.println("ID of cars; bwm : 1 -- auidi : 2 -- honda : 3 -- mercedes : 4 ");
            System.out.println("please enter id number of a car to save");
            idCar = scan.next();
            saveVeh.setPart1(idCar);
            BpelServiceStub.SaveVehicleResponse saveVehRes = stub.saveVehicle(saveVeh);
            BpelServiceStub.Cars saveCar = saveVehRes.getCar();
            System.out.println("the car is saved." + saveCar.getMake() + "," + saveCar.getModel() + "," + saveCar.getMileage() + "," + saveCar.getPrice() + "," + saveCar.getYear());

            // search loan
            BpelServiceStub.SearchLoan loanSearch = new BpelServiceStub.SearchLoan();
            System.out.println("please write a model of a car to see loan products");
            carType = scan.next();
            loanSearch.setPart1(carType);
            BpelServiceStub.SearchLoanResponse res = stub.searchLoan(loanSearch);
            BpelServiceStub.LoanProducts saveres = res.getPart1();
            System.out.println("here is the loan products... borrow: " + saveres.getBorrow() + ", car model:" + saveres.getCars() + ", id loan:" + saveres.getIdLoan() + ", lender:" + saveres.getLender() + ", payment:" + saveres.getPayment() + ",period:" + saveres.getPeriod() + ", total payment:" + saveres.getTotalPayment() + ", user Id:" + saveres.getUserID());


            // save loan products           
            BpelServiceStub.SaveLoanProducts saveLoan = new BpelServiceStub.SaveLoanProducts();
            System.out.println("do you want to save the results of loan products : y/n");
            char c = scan.next().charAt(0);
            if (c == 'y') {
                System.out.println(" please write the id of loan products ");
                idLoan = scan.next();
                System.out.println(" please write the user id ");
                userID = scan.next();
                saveLoan.setIdLoan(idLoan);
                saveLoan.setPart2(userID);
                BpelServiceStub.SaveLoanProductsResponse saveLoanRes = stub.saveLoanProducts(saveLoan);
                BpelServiceStub.LoanProducts saveLoanP = saveLoanRes.getLoanProducts();
                System.out.println(" this is saved loan:.... borrow:" + saveLoanP.getBorrow() + ", car model:" + saveLoanP.getCars() + "," + " id loan:" + saveLoanP.getIdLoan() + ", lender: " + saveLoanP.getLender() + ", payment:" + saveLoanP.getPayment() + ", period:" + saveLoanP.getPeriod() + ", total payment:" + saveLoanP.getTotalPayment());
            } //this is file loan app
             char a;
                System.out.println(" do you want to submit this loan?: y/n ");
                char x = scan.next().charAt(0);
                if (x == 'y') {

                    System.out.println("please write the loan id:");
                    String idL = scan.next();
                    BpelServiceStub.FileLoanApp loanApp = new BpelServiceStub.FileLoanApp();
                    loanApp.setPart1(idL);
                    BpelServiceStub.FileLoanAppResponse appRes = stub.fileLoanApp(loanApp);
                    System.out.println(" the submission..." + appRes.getPart1());

                    // give offer
                
                    System.out.println(" do you want to give offer?: y/n ");
                    a = scan.next().charAt(0);
                    if (a == 'y') {
                        BpelServiceStub.CarOffer offer = new BpelServiceStub.CarOffer();
                        System.out.println("please write vehicle price");
                        int price = scan.nextInt();
                        offer.setVehiclePrice(price);
                        System.out.println("please write the amount of money ");
                        int money = scan.nextInt();
                        offer.setMoney(money);
                        BpelServiceStub.CarOfferResponse offerRes = stub.carOffer(offer);
                        boolean offerC = offerRes.getOffer(); // get true or false


                        System.out.println("this is offer response.." + offerC);

                        if (offerRes.getOffer() == true) {

                            //card payment 
                            //if offer is true, call the payment service
                            System.out.println(" *** you are about to pay... ***");
                            BpelServiceStub.CardPayment payment = new BpelServiceStub.CardPayment();
                            System.out.print("please specify card type");
                            card[0] = scan.next();
                            payment.setCardType(card[0]);
                            System.out.print("please specify card number..");
                            card[1] = scan.next();
                            payment.setCardNumber(card[1]);
                            System.out.print("please specify amount..");
                            card[2] = scan.next();
                            payment.setPart3(card[2]);


                            BpelServiceStub.CardPaymentResponse paymentRes = stub.cardPayment(payment);

                            System.out.println(" here is the response of payment..." + paymentRes.getPart1());
                            if (paymentRes.getPart1() == true) {
                                System.out.println(" paid successfull !!!");

                            } else if (paymentRes.getPart1() == false) {
                                System.out.println(" paid unsuccessfull !!! ");
                                System.out.println(" THANKS FOR USING VPS");
                            }
                        }
                    } } 
                    else if ( c == 'y' && x == 'n') {

                        System.out.println(" do you want to retrieve saved loans? y/n");
                        char ans = scan.next().charAt(0);
                        //   System.out.println("please specify your user id:");
                        //       String user = scan.next();
                        if (ans == 'y') {
                            //retrieve loans
                            // BpelServiceStub.RetrieveLoans ret = new BpelServiceStub.RetrieveLoans();
                            //       String aa = saveLoan.getPart2();
                            //    ret.setPart1(aa);
                            //      BpelServiceStub.RetrieveLoansResponse ress = stub.retrieveLoans(ret);
                            //      BpelServiceStub.LoanProducts pro =  ress.getLoanProducts();
                            saveLoan.setIdLoan(saveLoan.getIdLoan());
                            saveLoan.setPart2(saveLoan.getPart2());
                            BpelServiceStub.SaveLoanProductsResponse saveLoanRes = stub.saveLoanProducts(saveLoan);
                            BpelServiceStub.LoanProducts saveLoanP = saveLoanRes.getLoanProducts();
                            System.out.println(" this is retrieved loan:.... borrow:" + saveLoanP.getBorrow() + ", car model:" + saveLoanP.getCars() + "," + " id loan:" + saveLoanP.getIdLoan() + ", lender: " + saveLoanP.getLender() + ", payment:" + saveLoanP.getPayment() + ", period:" + saveLoanP.getPeriod() + ", total payment:" + saveLoanP.getTotalPayment());
                        }
                        if (ans == 'n' ) {
                            System.out.println(" do you want to see saved vehicles? y/n");
                            char answer = scan.next().charAt(0);
                            if (answer == 'y') {
                 
                         System.out.println("this is saved car." + saveCar.getMake() + "," + saveCar.getModel() + "," + saveCar.getMileage() + "," + saveCar.getPrice() + "," + saveCar.getYear());
                            }
                            if (answer == 'n' ) {
                                System.out.println(" do you want to search cars again? y/n");
                                char xy = scan.next().charAt(0);
                                if (xy == 'y') {

                                    System.out.print("make:");
                                    car[0] = scan.next();
                                    vehicle.setMake(car[0]);
                                    System.out.print("model:");
                                    car[1] = scan.next();
                                    vehicle.setModel(car[1]);
                                    System.out.print("mileage:");
                                    car[2] = scan.next();
                                    vehicle.setPart5(car[2]);
                                    System.out.print("price:");
                                    car[3] = scan.next();
                                    vehicle.setPrice(car[3]);
                                    System.out.print("year:");
                                    car[4] = scan.next();
                                    vehicle.setYear(car[4]);


                                    // response of bpel for search car
                                    System.out.println(" the search result is: " + "," + carRes.getMake() + "," + carRes.getMileage() + "," + carRes.getModel() + "," + carRes.getPrice() + "," + carRes.getYear());
                                }
                            }
                        }
                    
                


            }
            System.out.println("thanks for using VPS");
        } catch (Exception exp) {
            exp.printStackTrace();


        }


    }
}
