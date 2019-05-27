package ie.example.webapp.dao; 

import java.util.List; 
import ie.example.webapp.models.Horses; 

// HorsesDAo Interface definition 
public interface HorsesDao { 
    // Return a list containing all the horses objects 
    public List<Horses> findAll(); 
    // Return a product with matching id 
    public Horses findById(int microchip); 
    // return a list of horses by name
    public List<Horses> findByHorseName(String horseName); 
    // return a list of products matching search term
	public List<Horses> findBySearchText(String searchText);
	// Create a new product
	public Horses create(final Horses horses);
	// update an exiting product - return the number or fows affected
	public int update(final Horses horses);
	// Delete product with matching id
	public int delete(int microchip);	

}
