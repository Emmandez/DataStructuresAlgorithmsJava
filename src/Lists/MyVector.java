/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lists;

import java.util.List;
import java.util.Vector;

/**
 *
 * @author eherd
 */
public class MyVector {
    //Use the vector class if you need synchronization
    public static void main(String[] args){
        
        List<Employee> vector = new Vector<>();
        vector.add(new Employee("Jane", "Jones",123));
        vector.add(new Employee("John", "Doe",4567));
        vector.add(new Employee("Mary", "Smith",22));
        vector.add(new Employee("Mike", "Wilson",3245));
        
    }
    
}
