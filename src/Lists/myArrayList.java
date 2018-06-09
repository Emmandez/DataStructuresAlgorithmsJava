/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lists;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author eherd
 */
public class myArrayList {
    public static void main(String[] args){
        
        List<Employee> employeeList = new ArrayList<>();
        
        employeeList.add(new Employee("Jane", "Jones",123));
        employeeList.add(new Employee("John", "Doe",4567));
        employeeList.add(new Employee("Mary", "Smith",22));
        employeeList.add(new Employee("Mike", "Wilson",3245));
        
        //Getting the second employee. O(1)
        System.out.println(employeeList.get(1));
        
        //check if the list is empty
        System.out.println(employeeList.isEmpty());
        
        //Replace item in a list, (index, element)
        employeeList.set(1, new Employee("John", "Adams", 4568));
        
        
        
        //Number of items in a list
        System.out.println(employeeList.size());
        
        //Add employee at specific position
        employeeList.add(3, new Employee("John", "Doe", 4567));
        
        //For each employee in the list, print out the employee
        employeeList.forEach(employee -> System.out.println(employee));
        
        System.out.println("\n");
        Employee[] employees = employeeList.toArray(new Employee[employeeList.size()]);
        for(Employee em: employees){
            System.out.println(em);
        }
            
        //To know whether a list contains an object/item
        System.out.println(employeeList.contains(new Employee("John", "Doe", 4567) ));
        
        //Get the index of an employee
        System.out.println(employeeList.indexOf(new Employee("John", "Doe", 4567)));
        
        //removing an item from the list using remove
        employeeList.remove(2);
        
        
        
        
    }
    
    
}
