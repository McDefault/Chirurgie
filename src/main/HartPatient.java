package main;

public class HartPatient extends Patient{
	private Hart hart;
	
	public HartPatient( int patientnummer, String achternaam) {
		super( patientnummer, achternaam);
		this.hart = new Hart();
	}
	
	public void vervangHart(Hart hart) {
		this.hart = hart;
		do {
			hart.defibrilleer();
		}
		while (!hart.heeftHartslag());
		this.hart = hart;
	}
	
	public Hart getHart() {
		return this.hart;
	}
	
}
