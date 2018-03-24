package bs;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContexts;
import javax.persistence.Query;

import bo.UtilisateurBO;
import execption.HibernateExecption;
import javafx.scene.control.TreeTableRow;

/**
 * Session Bean implementation class UtilisateurBs
 */
@Stateless
public class UtilisateurBs implements UtilisateurBsRemote, UtilisateurBsLocal {
	@PersistenceContext
	private EntityManager entityManager;


	@Override
	public List<UtilisateurBO> getAllUtilisateur() throws HibernateExecption{
		 Query query = entityManager.createQuery("SELECT user FROM Utilisateur user");
		 List<UtilisateurBO> resultat= new ArrayList<UtilisateurBO>(); 
		 resultat= query.getResultList(); 
		return resultat;
	}

	@Override
	public UtilisateurBO updateUtilisateur(UtilisateurBO utlisateurBO) throws HibernateExecption {
		UtilisateurBO result = entityManager.merge(utlisateurBO);

		if (result.getUtilisateurId() != utlisateurBO.getUtilisateurId()) {
			throw new HibernateExecption();
		}
		return result;
	}

	@Override
	public void deleteUtilisateur(UtilisateurBO utlisateurBO) throws HibernateExecption {
		entityManager.remove(utlisateurBO);

	}

	@Override
	public void createUtilisateur(UtilisateurBO utlisateurBO) throws HibernateExecption {
		entityManager.persist(utlisateurBO);
		entityManager.flush();

		if (utlisateurBO.getUtilisateurId() == 0) {
			throw new HibernateExecption();
		}
	}

	@Override
	public UtilisateurBO getUtilisateurById(UtilisateurBO utlisateurBO) throws HibernateExecption {
		UtilisateurBO result = entityManager.find(UtilisateurBO.class, utlisateurBO.getUtilisateurId());
		
				if(result.getUtilisateurId()!=utlisateurBO.getUtilisateurId()){
					 throw new HibernateExecption();
				}
				
				return result;
	}

}
