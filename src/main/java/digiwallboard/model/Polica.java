package digiwallboard.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="polica")

public class Polica {

	@Id
	@GeneratedValue
	private int id;
	
	private String ime_pol;
	
	  public Polica() {
	  }
	  
	  public Polica(String ime_pol) {
	        super();
	        this.ime_pol = ime_pol;
	 }  
	  
	  public Polica(int id, String ime_pol) {
	        super();
	        this.id = id;
	        this.ime_pol = ime_pol;
	 }  

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIme() {
		return ime_pol;
	}

	public void setIme(String ime_pol) {
		this.ime_pol = ime_pol;
	}

	
		
	
}
