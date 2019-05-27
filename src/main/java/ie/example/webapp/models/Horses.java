package ie.example.webapp.models;

import java.util.Date;

public class Horses
{
    private int microchip;
    private String horseName;
    private Date dateOfBirth;
    private String sex;
    private String breed;
    private int height;
    private String weight;
    private int ownID;
    

    public Horses(){
    }
    
	public Horses(int microchip, String horseName, Date dateOfBirth,String sex, String breed, int height, String weight, int ownID){

        this.microchip = microchip;
        this.horseName = horseName;
        this.dateOfBirth = dateOfBirth;    
        this.sex = sex;
        this.breed = breed;
        this.height = height;
        this.weight = weight;
        this.ownID = ownID;
      
    }

	public String getHorseName() {
		return horseName;
	}

	public void setHorseName(String horseName) {
		this.horseName = horseName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateofBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getMicrochip() {
		return microchip;
	}

	public void setMicrochip(int microchip) {
		this.microchip = microchip;
    }
    
    public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
    }
    
    public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
    }
    
    public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
    }
    
    public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
    }

    public int getOwnID() {
		return ownID;
	}

	    
}