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
public class Airliner {
    
    private String airlinerName;
    private AirplaneDirectory cd;

    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }

    public AirplaneDirectory getCd() {
        return cd;
    }

    public void setCd(AirplaneDirectory cd) {
        this.cd = cd;
    }
    
    
    public Airliner(){
        cd = new AirplaneDirectory();
    }
        
    @Override
    
    public String toString(){
        return airlinerName;
    }
    
    
    
}
