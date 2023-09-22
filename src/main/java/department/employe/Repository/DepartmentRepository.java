package department.employe.Repository;

import department.employe.DepartmentModel.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Model, Integer> {
    boolean existsByUsername(String username);
}
