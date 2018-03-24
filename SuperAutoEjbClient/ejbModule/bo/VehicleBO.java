package bo;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Vehicle
 *
 */
@Entity
@Table(name="vehicule")
public class VehicleBO implements Serializable {

	   
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Id
	private long vehicleId;
	private float prixBase;
	@Temporal(TemporalType.DATE)
	private Date dateFabrication; 
	@ManyToOne
	@JoinColumn(name="invoiceId", foreignKey=@ForeignKey(name = "Fk_vehicule_facture"))
	private InvoiceBO invoice; 
	@ManyToOne
	@JoinColumn(name="modelId", foreignKey=@ForeignKey(name = "Fk_vehicule_modele"))
	private ModelBO model; 
	@ManyToMany
	@JoinTable  (name="VEHICULE_OPTIONS",
        joinColumns=
            @JoinColumn(name="vehicle", referencedColumnName="vehicleId" ,
            foreignKey=@ForeignKey(name = "FK_vehicule_options_vehiclule")),
        inverseJoinColumns=
            @JoinColumn(name="options", referencedColumnName="optionsId")
    )
	private Set<OptionBO> options; 
	

	
	public InvoiceBO getInvoice() {
		return invoice;
	}
	public void setInvoice(InvoiceBO invoice) {
		this.invoice = invoice;
	}

	private static final long serialVersionUID = 1L;

	public VehicleBO() {
		super();
	}   
	public long getVehicleId() {
		return this.vehicleId;
	}

	public void setVehicleId(long vehicleId) {
		this.vehicleId = vehicleId;
	}   
	
	public float getPrixBase() {
		return this.prixBase;
	}

	public void setPrixBase(float prixBase) {
		this.prixBase = prixBase;
	}
	public ModelBO getModel() {
		return model;
	}
	public void setModel(ModelBO model) {
		this.model = model;
	}
	public Date getDateFabrication() {
		return dateFabrication;
	}
	public void setDateFabrication(Date dateFabrication) {
		this.dateFabrication = dateFabrication;
	}
	public Set<OptionBO> getOptions() {
		return options;
	}
	public void setOptions(Set<OptionBO> options) {
		this.options = options;
	}
   
}
