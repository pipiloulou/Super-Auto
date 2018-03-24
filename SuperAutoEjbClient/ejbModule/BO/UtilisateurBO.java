package BO;

import java.io.Serializable;
import java.lang.String;
import java.util.Set;

import javax.persistence.*;


/**
 * Entity implementation class for Entity: UtilisateurBO
 *
 */
@Entity
@Table(name="Utilisateur")
public class UtilisateurBO implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private long utilisateurId;
	private String nom;
	private String password; 
	private boolean closed; 
	@OneToMany(cascade=CascadeType.ALL, mappedBy="vendeur")
	private Set<InvoiceBO> invoices;
	@ManyToOne
	@JoinColumn(name="structureId", nullable = false, foreignKey=@ForeignKey(name = "Fk_utilisateur_structure"))
	private StructureBO structure; 

    


	public Set<InvoiceBO> getInvoices() {
		return invoices;
	}
	public void setInvoices(Set<InvoiceBO> invoices) {
		this.invoices = invoices;
	}
	private static final long serialVersionUID = 1L;

	public UtilisateurBO() {
		super();
	}   
	public long getUtilisateurId() {
		return this.utilisateurId;
	}

	public void setUtilisateurId(long utilisateurId) {
		this.utilisateurId = utilisateurId;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isClosed() {
		return closed;
	}
	public void setClosed(boolean closed) {
		this.closed = closed;
	}
	public StructureBO getStructure() {
		return structure;
	}
	public void setStructure(StructureBO structure) {
		this.structure = structure;
	}
   
}
