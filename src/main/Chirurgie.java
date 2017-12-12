package main;

public class Chirurgie
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		HartPatient patient = new HartPatient(123123, "Henk");
		System.out.println("De hartslag van " + patient.getAchternaam() + " = " + patient.getHart().getHartslag());
		
		Hart nieuwHart = new Hart();
		patient.vervangHart(nieuwHart);
		
		System.out.println("De hartslag van " + patient.getAchternaam() + " = " + nieuwHart.getHartslag());
		System.out.println("Pogingen: " + nieuwHart.getAantalDefibrilleerProgingen());
	}

}
