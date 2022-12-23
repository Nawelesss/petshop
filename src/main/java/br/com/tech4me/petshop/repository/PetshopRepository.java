package br.com.tech4me.petshop.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import br.com.tech4me.petshop.model.Petshop;
public interface PetshopRepository extends MongoRepository<Petshop,String>{

}