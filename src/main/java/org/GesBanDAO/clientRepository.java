package org.GesBanDAO;

import org.GesBanEntities.client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface clientRepository extends JpaRepository<client, Long> {
	
	

}



//CREER les intefarces REPOSITORY POUR HERITER DE SPRING DATA( IL SUFFIT D'UTILISER jpaREPO),parce que c'est lui qui va injecter les implementation necessaire pour geré les entité par (un cri manager????) 