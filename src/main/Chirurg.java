package main;

public class Chirurg{
    private Hart hart;
    private HartPatient patient;
    
    public void opereer(HartPatient patient){
        this.patient = patient;
        Hart hart = new Hart();
        this.patient.vervangHart(hart);
        this.hart = null;
    }
    
    // methode alleen voor aggrgatie demo
    public Hart getHart(){
        return this.hart;
    }
} 
