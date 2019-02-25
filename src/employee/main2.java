/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import javax.swing.JOptionPane;

/**
 *
 * @author Ali Abo Alkhear
 */
public class main2 {
    
    public static void main(String[] args) {
        
        Employee[] employee = new Employee[10];

        for (int i = 0; i < employee.length; i++) {

            Employee e = new Employee();
            /*
                Enter The Enformation 
            */  
            System.out.println("Enter a employee information : ");
            
            e.setName(JOptionPane.
                    showInputDialog(null, "Name", "Employee",
                            JOptionPane.INFORMATION_MESSAGE));
            
            e.setDepartment(JOptionPane.
                    showInputDialog(null, "Department", "Employee",
                            JOptionPane.INFORMATION_MESSAGE));
            
            e.setSalary(Double.parseDouble(JOptionPane.
                    showInputDialog(null, "Salary", "Employee",
                            JOptionPane.INFORMATION_MESSAGE)));
            employee[i] = e;
        }
        
        sortArray(employee);
        showData(employee);

    }

    public static void sortArray(Employee[] e) {
        for (int i = 0; i < e.length; i++) {
            for (int j = i + 1; j < e.length-1; j++) {
                if (e[j].getSalary() > e[i].getSalary()) {
                    Employee temp = e[i];
                    e[i] = e[j];
                    e[j] = temp;
                }
            }
        }
    }
    private static void showData(Employee[] e){
     System.out.println("==================");
        System.out.printf("%-10s%-10s%-13s\n","Name","Department","Salary");
        for (Employee employee : e) {
            System.out.printf("%-10s%-10s%-10.2f\n",
                    employee.getName(),
                    employee.getDepartment(),
                    employee.getSalary());
        }
    }
}
