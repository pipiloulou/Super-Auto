package bo;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Model
 *
 */
@Entity
@Table(name="modele")
public class ModelBO implements Serializable {

	   
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Id
	private long modelId;
	private boolean available;
	@OneToMany(cascade=CascadeType.ALL, mappedBy="model")
	private Set<VehicleBO> vehicle; 
	private static final long serialVersionUID = 1L;

	public ModelBO() {
		super();
	}   
	public long getModelId() {
		return this.modelId;
	}

	public void setModelId(long modelId) {
		this.modelId = modelId;
	}   
	public boolean getAvailable() {
		return this.available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
	public Set<VehicleBO> getVehicle() {
		return vehicle;
	}
	public void setVehicle(Set<VehicleBO> vehicle) {
		this.vehicle = vehicle;
	}
   
}
