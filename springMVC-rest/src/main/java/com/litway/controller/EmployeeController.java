package com.litway.controller;


import com.litway.dao.EmployeeDao;
import com.litway.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * 员工控制器
 *
 * @author DELL_
 * @date 2022/02/24
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {


    // 默认根据类型创建, 没有类型就是用name创建
    @Autowired
    private EmployeeDao employeeDao;


    @GetMapping
    public String list(Model model) {
        Collection<Employee> employeeList = employeeDao.getAll();
        model.addAttribute("employeeList", employeeList);
        return "employee_list";
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable("id") Integer id) {
        employeeDao.delete(id);
        return "redirect:/employee";
    }


    @PostMapping
    public String addEmployee(Employee employee) {
        employeeDao.save(employee);
        return "redirect:/employee";
    }
}
