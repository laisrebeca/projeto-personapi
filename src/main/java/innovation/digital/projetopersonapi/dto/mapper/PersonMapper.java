package innovation.digital.projetopersonapi.dto.mapper;

import innovation.digital.projetopersonapi.dto.request.PersonDTO;
import innovation.digital.projetopersonapi.entities.Person;
import org.springframework.web.bind.annotation.Mapping;


public interface PersonMapper {

    @Mapping (target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO dto);

    PersonDTO toDTO(Person dto);
}
