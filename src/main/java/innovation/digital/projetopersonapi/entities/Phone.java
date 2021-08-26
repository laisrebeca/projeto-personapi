package innovation.digital.projetopersonapi.entities;

import lombok.*;
import innovation.digital.projetopersonapi.enums.PhoneType;
import javax.persistence.*;

@Table(name = "Phone")
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PhoneType type;

    @Column(nullable = false, unique = true)
    private String number;
}
