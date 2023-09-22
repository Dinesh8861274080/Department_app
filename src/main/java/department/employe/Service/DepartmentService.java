package department.employe.Service;

import department.employe.DepartmentModel.Model;

import java.util.List;

public interface DepartmentService {
    public Model createDepartment(Model model);
    public List<Model> getAllDepartments();
    // public void deleteDepartmentById(Integer id);
}
