package bs;

import java.util.List;

import javax.ejb.Remote;

import BO.UtilisateurBO;
import execption.HibernateExecption;

@Remote
public interface UtilisateurBsRemote {
	List<UtilisateurBO> getAllUtilisateur() throws HibernateExecption;
	UtilisateurBO updateUtilisateur(UtilisateurBO utlisateurBO) throws HibernateExecption ; 
	void deleteUtilisateur(UtilisateurBO utlisateurBO) throws HibernateExecption; 
	void createUtilisateur(UtilisateurBO utlisateurBO) throws HibernateExecption; 
	UtilisateurBO getUtilisateurById(UtilisateurBO utlisateurBO) throws HibernateExecption; 
}
