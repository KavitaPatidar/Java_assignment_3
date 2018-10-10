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
public class AirlinerDirectory {
    
     private ArrayList<Airliner> airliner1;

    public ArrayList<Airliner> getAirliner() {
        return airliner1;
    }

    public void setAirliner(ArrayList<Airliner> airliner) {
        this.airliner1 = airliner;
    }
    
    public AirlinerDirectory()
    {
        airliner1= new ArrayList<Airliner>();
    }
    
    public Airliner addairliner()
    {
        Airliner air_liner = new Airliner();
        airliner1.add(air_liner);
        return air_liner;
        
    }
    
    public void deleteairliner(Airliner air_liner)
    {
        airliner1.remove(air_liner);
    }
    
    public Airliner searchairliner(String airliner_name)
    {
        for(Airliner air_liner:airliner1)
        {
            if(airliner_name.equals(air_liner.getAirlinerName()))
            {
                return air_liner;
            }
        }
        return null;
    }
}
