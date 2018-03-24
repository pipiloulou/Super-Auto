package BO;

import java.io.Serializable;
import java.lang.String;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: OptionBO
 *
 */
@Entity
@Table(name="options")
public class OptionBO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private long optionsId;
	private String optionsCode;
	private String optionLibelle;
	private float optionPrix; 
	@ManyToMany
	@JoinTable  (name="VEHICULE_OPTIONS",
    joinColumns=
        @JoinColumn(name="options", referencedColumnName="optionsId" ,
        foreignKey=@ForeignKey(name = "FK_vehicule_options_options")),
    inverseJoinColumns=
        @JoinColumn(name="vehicle", referencedColumnName="vehicleId"))
	private Set<VehicleBO> vehicle; 
	
	public OptionBO() {
		super();
	}   
	public long getOptionsId() {
		return this.optionsId;
	}

	public void setOptionsId(long optionsId) {
		this.optionsId = optionsId;
	}   
	public String getOptionsCode() {
		return this.optionsCode;
	}

	public void setOptionsCode(String optionsCode) {
		this.optionsCode = optionsCode;
	}   
	public String getOptionLibelle() {
		return this.optionLibelle;
	}

	public void setOptionLibelle(String optionLibelle) {
		this.optionLibelle = optionLibelle;
	}
	public float getOptionPrix() {
		return optionPrix;
	}
	public void setOptionPrix(float optionPrix) {
		this.optionPrix = optionPrix;
	}
	public Set<VehicleBO> getVehicle() {
		return vehicle;
	}
	public void setVehicle(Set<VehicleBO> vehicle) {
		this.vehicle = vehicle;
	}
   
}
