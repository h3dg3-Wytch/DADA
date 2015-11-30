package Models.etc;
import java.io.Serializable;
/**
 * 
 * @author Harsh Patel
 *
 */
public abstract class Feat implements Serializable {
	
	
	
	protected String description;
	
	
	public Feat(String feat){
		this.description = feat;
		
	}


	protected String getDescription() {
		return description;
	}


	protected void setDescription(String description) {
		this.description = description;
	}



}
