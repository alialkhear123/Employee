/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.util.Scanner;

/**
 *
 * @author Ali Abo Alkhear
 */
public class main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < employee.length; i++) {

            Employee e = new Employee();

            System.out.println("Enter a employee information : ");
            e.setName(input.next());
            e.setDepartment(input.next());
            e.setSalary(input.nextDouble());

            employee[i] = e;

        }
        sortArray(employee);
        showData(employee);
    }

    /*
        Sorting The Array 
     */
    public static void sortArray(Employee[] e) {
        for (int i = 0; i < e.length; i++) {
            for (int j = i + 1; j < e.length; j++) {
                if (e[j].getSalary() > e[i].getSalary()) {
                    Employee temp = e[i];
                    e[i] = e[j];
                    e[j] = temp;

                }
            }

        }

    }

    /*
        Show The Employee Enformation 
     */
    private static void showData(Employee[] e) {
        System.out.println("==================");
        System.out.printf("%-10s%-10s%-13s\n", "Name", "Department", "Salary");
        for (Employee employee : e) {
            System.out.printf("%-10s%-10s%-10.2f\n",
                    employee.getName(),
                    employee.getDepartment(),
                    employee.getSalary());
        }
    }
    
}
    

