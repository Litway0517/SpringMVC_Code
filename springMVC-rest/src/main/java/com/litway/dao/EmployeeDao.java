package com.litway.dao;

import com.litway.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 员工DAO
 *
 * @author DELL_
 * @date 2022/02/24
 */
@Repository
public class EmployeeDao {

    /**
     * 员工
     */
    private static Map<Integer, Employee> employees = null;

    static{
        employees = new HashMap<Integer, Employee>();

        employees.put(1001, new Employee(1001, "E-AA", "aa@163.com", 1));
        employees.put(1002, new Employee(1002, "E-BB", "bb@163.com", 1));
        employees.put(1003, new Employee(1003, "E-CC", "cc@163.com", 0));
        employees.put(1004, new Employee(1004, "E-DD", "dd@163.com", 0));
        employees.put(1005, new Employee(1005, "E-EE", "ee@163.com", 1));
    }

    /**
     * init id
     */
    private static Integer initId = 1006;

    /**
     * 保存 和 修改员工信息.
     *
     * @param employee 员工
     */
    public void save(Employee employee){
        if(employee.getId() == null){
            employee.setId(initId++);
        }
        // 当id有值的时候, id一样, 但是实体内容不一样, 所以就是更新覆盖原来的信息.
        employees.put(employee.getId(), employee);
    }

    /**
     * 得到所有
     *
     * @return {@link Collection}<{@link Employee}>
     */
    public Collection<Employee> getAll(){
        return employees.values();
    }

    /**
     * 得到
     *
     * @param id id
     * @return {@link Employee}
     */
    public Employee get(Integer id){
        return employees.get(id);
    }

    /**
     * 删除
     *
     * @param id id
     */
    public void delete(Integer id){
        employees.remove(id);
    }
}
