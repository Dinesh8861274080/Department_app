package department.employe.Controller;

import department.employe.DepartmentModel.Model;
import department.employe.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Department")
public class DepartmentController {
    @Autowired
    DepartmentService department;

    @PostMapping("/create department")
    public String createDepartment(@RequestBody Model model) {
         department.createDepartment(model);
         return "created ssuccessfully";
    }

    @GetMapping("all Departments")
    List<Model> getAllDepartments() {
        return department.getAllDepartments();
    }



}
