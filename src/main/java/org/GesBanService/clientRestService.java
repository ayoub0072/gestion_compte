package org.GesBanService;

import java.util.List;

import org.GesBanEntities.client;
import org.GesBanMetier.clientMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController  
public class clientRestService {

	@Autowired
	private clientMetier clientMetier;
	//declaré des méthodes par délégation (par generation)
	
		//put:Mise à jour; get:consultation ; post: ajout
		//@RequestBody pour recuperer les données à partir de la requete en format JASON non pas XML
		//@responsebody pour recuperer les données à partir de la reponse mais si on a declaré @restcontroller c ps la pene de faire @responsebody 
	
		
	@RequestMapping(value="/clients",method=RequestMethod.POST)//pour acceder au client
		public client saveClient(@RequestBody client c) {
		return clientMetier.saveClient(c);
	}

	
	
	@RequestMapping(value="/clients",method=RequestMethod.GET)
	public List<client> ListCient() {
		return clientMetier.ListCient();
	}
	
	
	
	
	
}
