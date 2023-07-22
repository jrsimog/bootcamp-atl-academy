package ATL.ACADEMY.newslatter.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name ="prospecto")
public class Prospecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long id;
    @Column(name = "email")
    public String email;
}
