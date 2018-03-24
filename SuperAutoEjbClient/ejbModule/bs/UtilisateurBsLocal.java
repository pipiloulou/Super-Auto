package bs;

import java.util.List;

import javax.ejb.Local;

import bo.UtilisateurBO;
import execption.HibernateExecption;

@Local
public interface UtilisateurBsLocal {
	
	List<UtilisateurBO> getAllUtilisateur() throws HibernateExecption;
	UtilisateurBO updateUtilisateur(UtilisateurBO utlisateurBO) throws HibernateExecption; 
	void deleteUtilisateur(UtilisateurBO utlisateurBO) throws HibernateExecption; 
	void createUtilisateur(UtilisateurBO utlisateurBO) throws HibernateExecption; 
	UtilisateurBO getUtilisateurById(UtilisateurBO utlisateurBO) throws HibernateExecption; 
	
	
}
