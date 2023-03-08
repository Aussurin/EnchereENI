package dal;

import bo.Retrait;

public interface RetraitDAO {
			//Sélectionner un retrait par son no_article
			public Retrait selectByNo(int id) throws DALException;
			
			public Retrait selectByLibelle(String libelle) throws DALException;
			
			//Modifier les attributs d'un retrait connu en BD
			public void update(Retrait retrait) throws DALException;

			void insert(Retrait data) throws DALException;
			
			void delete(Retrait data) throws DALException;
}
