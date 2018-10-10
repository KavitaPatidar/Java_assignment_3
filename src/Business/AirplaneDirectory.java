/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author kavit
 */
public class AirplaneDirectory {
    private ArrayList<Airplane>customer1;
    
    public ArrayList<Airplane>getCustomer(){
        return customer1;
    }
    
    public void setCustomer(ArrayList<Airplane>customer){
        this.customer1 = customer;
    }
    
    public AirplaneDirectory(){
     customer1 = new ArrayList<>();   
    }
    
    public Airplane addCustomer(){
        Airplane cus_tomer = new Airplane();
        customer1.add(cus_tomer);
        return cus_tomer;
    }
           
    public void deleteCustomer(Airplane cus_tomer){
        customer1.remove(cus_tomer);
    }
    
    public Airplane searchAirliner(int flightNo){
        for(Airplane cus_tomer:customer1){
        if(cus_tomer.getFlightNo()==flightNo)
        {
            return cus_tomer;
        }
    }
        return null;
    }
}
