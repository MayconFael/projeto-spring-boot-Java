package br.com.arq.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.arq.entity.Users;

@Repository
public interface UsersRepository extends MongoRepository<Users, String>{
	
      @Query("{email: ?0}")
	  public Users findByEmail(String email);
 
}