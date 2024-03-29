package com.example.SpringCourse.Service;

import com.example.SpringCourse.Entity.Department;
import com.example.SpringCourse.Error.DepartmentNotFoundException;
import com.example.SpringCourse.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException {
        Optional<Department> department =  departmentRepository.findById(departmentId);
        if(!department.isPresent()){
            throw new DepartmentNotFoundException("Department Not Found");
        }
        return department.get();
    }

    @Override
    public void deleteDepartmentById(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }

    @Override
    public Department updateDepartment(Long departmentId, Department department) {
        Department db = departmentRepository.findById(departmentId).get();
        if(Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase(department.getDepartmentCode())){
            db.setDepartmentCode(department.getDepartmentCode());
        }
        if(Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())){
            db.setDepartmentName(department.getDepartmentName());
        }
        if(Objects.nonNull(department.getDepartmentAddress()) && !"".equalsIgnoreCase(department.getDepartmentAddress())){
            db.setDepartmentAddress(department.getDepartmentAddress());
        }

        return departmentRepository.save(db);
    }

    @Override
    public Department fetchDepartmentByName(String departmentName) {
        return departmentRepository.findByDepartmentNameIgnoreCase(departmentName);
    }
}
