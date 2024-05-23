/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poepart2;

import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class POEPart2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarations
        String taskName;
        String taskDescription;
        String developerDetails;
        String taskStatus;
        int taskDuration;
        int menu;
        int numTask;
        
        JOptionPane.showMessageDialog(null, "Login successful");
        JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
        
        menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Select an option:"
                + "\n1. Add Tasks"
                + "\n2. Show Report"
                + "\n3. Quit",
                "Welcome to EasyKanban", JOptionPane.PLAIN_MESSAGE));
        
        switch(menu) {
            case 1:
                numTask = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of tasks: "));
                Task[] tasks = new Task[numTask];
                for(int i = 0; i < numTask; i++) {
                    taskName = JOptionPane.showInputDialog("Enter the task name: ");
                    taskDescription = JOptionPane.showInputDialog("Enter the task description: ");
                    developerDetails = JOptionPane.showInputDialog("Enter the developer details: ");
                    taskDuration = Integer.parseInt(JOptionPane.showInputDialog("Enter task duration: "));
                    taskStatus = JOptionPane.showInputDialog("Enter task status (To Do, Done, Doing)");
                }
                break;
            case 2:
                // Code for showing report
                JOptionPane.showMessageDialog(null, "Coming Soon!");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Exiting EasyKanban. Goodbye!");
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid option. Please try again.");
        }
    }
}