package ATL.ACADEMY.newslatter.models;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;

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

    @DateTimeFormat(pattern = "yyyy-MM-dd H:i:s")
    @Column(name = "deletedAt")
    public Date deletedAt;
}
