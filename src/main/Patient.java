package main;

public class Patient {

    private int patientnummer;
    private String achternaam;
    
    public Patient (int patientnummer, String achternaam){
        this.patientnummer = patientnummer;
        this.achternaam = achternaam;
    }
    
    public String getAchternaam(){
        return this.achternaam;
    }
    
    public int getPatientnummer(){
        return this.patientnummer;
    }      
}
