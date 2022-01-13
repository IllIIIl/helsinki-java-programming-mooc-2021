/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zac
 */
import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbreviations;
    
    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        abbreviation.toLowerCase();
        abbreviation.trim();
        explanation.toLowerCase();
        explanation.trim();
        
        this.abbreviations.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation (String abbreviation) {
        abbreviation.toLowerCase();
        abbreviation.trim();
        
        if(abbreviations.containsKey(abbreviation)){
            return true;
        }else{
            return false;
        }
    }
    
    public String findExplanationFor(String abbreviation) {
        abbreviation.toLowerCase();
        abbreviation.trim();
        
        return this.abbreviations.get(abbreviation);
    }
}
