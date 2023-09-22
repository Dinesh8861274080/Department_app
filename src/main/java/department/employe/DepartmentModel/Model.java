package department.employe.DepartmentModel;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "departments")
@Data
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String firstname;
    private String lastname;


}
