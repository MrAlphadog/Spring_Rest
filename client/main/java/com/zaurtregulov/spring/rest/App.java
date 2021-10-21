package com.zaurtregulov.spring.rest;

import com.zaurtregulov.spring.rest.configuration.MyConfig;
import com.zaurtregulov.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication",Communication.class);

        List<Employee> allEmployees = communication.getAllEmployees();
        System.out.println("List of all Employees:");
        System.out.println(allEmployees);
        System.out.println("-------------------------------------------");

        Employee empById = communication.getEmployee(1);
        System.out.println("Information about employee with id = " + empById.getId());
        System.out.println(empById);
        System.out.println("-------------------------------------------");

//        Employee newEmp = new Employee("Sveta","Sokolova",
//                "IT", 1200);
//        newEmp.setId(8);
//        communication.saveEmployee(newEmp);
//        System.out.println("-------------------------------------------");

        communication.deleteEmployee(8);


    }
}
