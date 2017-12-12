package main;

public class Patienten {

    private String [] achternaam;
    private int[] patientnummer;
 
    public Patienten(){
        this.achternaam = new String[7];
        this.patientnummer = new int[7];

        this.achternaam[0] = "van Dijk";  this.patientnummer[0] = 12345;
        this.achternaam[1] = "de Meij";   this.patientnummer[1] = 54321;
        this.achternaam[2] = "Rijsdijk";  this.patientnummer[2] = 23451;
        this.achternaam[3] = "Kruizinga"; this.patientnummer[3] = 34512;
        this.achternaam[4] = "Veltmeije"; this.patientnummer[4] = 45123;
        this.achternaam[5] = "Warner";    this.patientnummer[5] = 51234;
        this.achternaam[6] = "Westveer";  this.patientnummer[6] = 41235;     
    }
    
    public HartPatient createHartPatient(int patientId){
        return new HartPatient(this.patientnummer[patientId],
                               this.achternaam[patientId]);
    }
}
