/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author kavit
 */
public class Airplane {
    
    private String departLocation;
    private String arrLocation;
    private String prefTime;
    private String date;
    private int flightNo;

    public String getDepartLocation() {
        return departLocation;
    }

    public void setDepartLocation(String departLocation) {
        this.departLocation = departLocation;
    }

    public String getArrLocation() {
        return arrLocation;
    }

    public void setArrLocation(String arrLocation) {
        this.arrLocation = arrLocation;
    }

    public String getPrefTime() {
        return prefTime;
    }

    public void setPrefTime(String prefTime) {
        this.prefTime = prefTime;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(int flightNo) {
        this.flightNo = flightNo;
    }
    
    
    @Override
    public String toString()
    {
        return departLocation;
    }
    
    
}