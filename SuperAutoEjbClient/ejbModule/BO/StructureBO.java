package BO;

import java.io.Serializable;
import java.lang.String;
import java.util.Set;

import javax.persistence.*;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: StructureBO
 *
 */
@Entity
@Table(name="structure")
public class StructureBO implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private long structureId;
	private String adresse;
	private String ville;
	private String codePostal;
	private String rib;
	private long numSociete;
	@OneToMany(cascade=CascadeType.ALL, mappedBy="structure")
	private Set<UtilisateurBO> utilisateur; 
	private static final long serialVersionUID = 1L;

	public StructureBO() {
		super();
	}   
	public long getStructureId() {
		return this.structureId;
	}

	public void setStructureId(long structureId) {
		this.structureId = structureId;
	}   
	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}   
	public String getVille() {
		return this.ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}   
	public String getCodePostal() {
		return this.codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}   
	public String getRib() {
		return this.rib;
	}

	public void setRib(String rib) {
		this.rib = rib;
	}   
	public long getNumSociete() {
		return this.numSociete;
	}

	public void setNumSociete(long numSociete) {
		this.numSociete = numSociete;
	}
	public Set<UtilisateurBO> getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Set<UtilisateurBO> utilisateur) {
		this.utilisateur = utilisateur;
	}
   
}
