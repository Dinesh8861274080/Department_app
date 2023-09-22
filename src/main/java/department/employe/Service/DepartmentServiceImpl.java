package department.employe.Service;

import department.employe.DepartmentModel.Model;
import department.employe.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Override
    public Model createDepartment(Model model) {
            return department.save(model);
        // return "created Successfully";

    }

    @Override
    public List<Model> getAllDepartments() {
        return department.findAll();
    }

    @Override
    public void deleteDepartmentById(Integer id) {
        department.deleteById(id);
        // "deleted Successfully";

    }
    @Override
    public boolean doesUsernameExist(String username) {
        return department.existsByUsername(username);
    }

    @Autowired
    DepartmentRepository department;



}
