package innovation.digital.projetopersonapi.repositories;

import innovation.digital.projetopersonapi.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
