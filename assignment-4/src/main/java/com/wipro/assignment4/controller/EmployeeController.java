package com.wipro.assignment4.controller;

import com.wipro.assignment4.service.EmployeeService;
import com.wipro.assignment4.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;
import javax.websocket.server.PathParam;
import java.util.Optional;

@Controller
@RequestMapping("/wipro")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    Employee employee;

    @GetMapping("/")
    public String getForm(Model model){
        model.addAttribute("employee", new Employee());
        return "index";
    }

    @PostMapping("/submit-user-details")
    public @ResponseBody String submitUserDetails(@ModelAttribute Employee employee){
        employeeService.addNewEmployee(employee);
        return "Submitted User Details Succesfully";
    }

    @GetMapping("/get-all-users")
    public @ResponseBody Iterable<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/get-user-by-id")
    public @ResponseBody Optional<Employee> getEmployeeById(@PathParam("employeeId") int employeeId){
        return employeeService.getEmployeeById(employeeId);
    }
}
