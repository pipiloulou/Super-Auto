package bo;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.*;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Order
 *
 */
@Entity
@Table(name="facture")
public class InvoiceBO implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long invoiceId;
	@Temporal(TemporalType.DATE)
	private Date dateEmisssion;
	
	private float prixTotal;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="invoice")
	private Set<VehicleBO> vehicle; 
	
	
	public Date getDateEmisssion() {
		return dateEmisssion;
	}

	public void setDateEmisssion(Date dateEmisssion) {
		this.dateEmisssion = dateEmisssion;
	}

	@ManyToOne
	@JoinColumn(name = "utilisateurId")
	private UtilisateurBO vendeur;
	public UtilisateurBO getVendeur() {
		return vendeur;
	}

	public void setVendeur(UtilisateurBO vendeur) {
		this.vendeur = vendeur;
	}

	private static final long serialVersionUID = 1L;

	public InvoiceBO() {
		super();
	}

	public long getId() {
		return this.invoiceId;
	}

	public void setId(long id) {
		this.invoiceId = id;
	}

	public Set<VehicleBO> getVehicle() {
		return vehicle;
	}

	public void setVehicle(Set<VehicleBO> vehicle) {
		this.vehicle = vehicle;
	}

	public float getPrixTotal() {
		return prixTotal;
	}

	public void setPrixTotal(float prixTotal) {
		this.prixTotal = prixTotal;
	}

	public long getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(long invoiceId) {
		this.invoiceId = invoiceId;
	}

}
