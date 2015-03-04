package net.kamradtfamily.mycoolapp.repository;

import net.kamradtfamily.mycoolapp.domain.Authority;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for the Authority entity.
 */
public interface AuthorityRepository extends MongoRepository<Authority, String> {
}
