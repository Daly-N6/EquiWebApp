package ie.example.webapp.models;

import java.util.Date;

public class Wormers
{
    private int microchip;
    private String type;
    private Date dateGiven;
	private Date nextDue;
	//private String SName;
    
   

  
	Wormers(int microchip, String type, Date dateGiven, Date nextDue)
    {
        this.microchip = microchip;
        this.type = type;
        this.dateGiven = dateGiven;
		this.nextDue = nextDue;       
    }

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getDateGiven() {
		return dateGiven;
	}

	public void setDateGiven(Date dateGiven) {
		this.dateGiven = dateGiven;
	}

	public Date getNextDue() {
		return nextDue;
	}

	//public void setFName(String FName) {
	//	this.FName = FName;
	//}

	//public String getSName() {
	//	return SName;
	//}

	//public void setSName(String SName) {
	//	this.SName = SName;
	//}

	public int getMicrochip() {
		return microchip;
	}

	public void setMicrochip(int microchip) {
		this.microchip = microchip;
	}
}