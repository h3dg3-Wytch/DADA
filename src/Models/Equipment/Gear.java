/**
 * 
 * @author Harsh Patel
 *
 */

package Models.Equipment;

<<<<<<< HEAD
import java.io.Serializable;

public class Gear implements Serializable{
=======
public class Gear {
>>>>>>> 9f6a914c431329fcb70f747133cc7f240d0ea281
	
	
	private String item , description;
	private int weight;
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}

	
	
	
}
