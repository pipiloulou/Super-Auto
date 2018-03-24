import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import bo.StructureBO;
import bo.UtilisateurBO;
import bs.UtilisateurBsRemote;
import execption.HibernateExecption;

public class TestPersistance {

	public static void main(String[] args) throws NamingException, HibernateExecption {
		final Context cxt = new InitialContext();
		// on regarde ce qui est avant l'exported 
		UtilisateurBsRemote utilBs=(UtilisateurBsRemote)
				cxt.lookup("/SuperAutoEjbEAR/SuperAutoEjb/UtilisateurBs!bs.UtilisateurBsRemote"); 
		UtilisateurBO user=new UtilisateurBO();
		StructureBO structure=new StructureBO(); 
		structure.setStructureId(1);
		user.setStructure(structure);
		utilBs.createUtilisateur(user);
		///dede
		cxt.close();
		
	}

}
