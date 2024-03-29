package com.example.SpringCourse.Controller;

import com.example.SpringCourse.Entity.Department;
import com.example.SpringCourse.Error.DepartmentNotFoundException;
import com.example.SpringCourse.Service.DepartmentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;
    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department){
        return  departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartments(){
        return departmentService.fetchDepartments();
    }

    @GetMapping("/departments/{id}")
    public Optional<Department> fetchDepartmentById(@PathVariable("id") Long departmentId) throws DepartmentNotFoundException {
        return Optional.ofNullable(departmentService.fetchDepartmentById(departmentId));
    }
    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId){
        departmentService.deleteDepartmentById(departmentId);
        return "Department Deleted Successfully";
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId,@RequestBody Department department){
        return departmentService.updateDepartment(departmentId,department);
    }

    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String departmentName){
            return departmentService.fetchDepartmentByName(departmentName);
    }
}
