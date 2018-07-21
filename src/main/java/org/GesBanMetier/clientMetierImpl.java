package org.GesBanMetier;

import java.util.List;

import org.GesBanDAO.clientRepository;
import org.GesBanEntities.client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //@service(pour couche metier) ou @component ,c'est obligatoire sinon la classe ne sera ps considérer comme beanspring alors l'injection autowired ne va ps fonctionné  
public class clientMetierImpl implements clientMetier {

	@Autowired //Injection ds dependences par autowired par spring
	private clientRepository Clientrepository;
	@Override
	public client saveClient(client c) {
		// TODO Auto-generated method stub
		return Clientrepository.save(c);
	}

	@Override
	public List<client> ListCient() {
		// TODO Auto-generated method stub
		return Clientrepository.findAll();
	}

	
}
