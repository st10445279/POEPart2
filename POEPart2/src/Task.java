
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */
public class Task {
    // Data members
    private String taskName;
    private String taskDescription;
    private String developerDetails;
    private String taskStatus;
    private int taskDuration;
    private int menu;
    private int numTask;
    private int total = 0;
    private int count = 0;
    private String taskId;
    private String taskDetails;
    private Object taskIdObject;
    
    // Getters
    public String getTaskName() {
        return taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public String getDeveloperDetails() {
        return developerDetails;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public int getTaskDuration() {
        return taskDuration;
    }

    public int getMenu() {
        return menu;
    }

    public int getNumTask() {
        return numTask;
    }

    public int getTotal() {
        return total;
    }

    public int getCount() {
        return count;
    }

    public String getTaskId() {
        return taskId;
    }

    public String getTaskDetails() {
        return taskDetails;
    }
    
    // Setters
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public void setDeveloperDetails(String developerDetails) {
        this.developerDetails = developerDetails;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public void setTaskDuration(int taskDuration) {
        this.taskDuration = taskDuration;
    }

    public void setMenu(int menu) {
        this.menu = menu;
    }

    public void setNumTask(int numTask) {
        this.numTask = numTask;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public void setTaskDetails(String taskDetails) {
        this.taskDetails = taskDetails;
    }
    
    public boolean checkTaskDescription() {
        if (taskDescription.length() < 50) {
            taskDescription = JOptionPane.showInputDialog("Successfully captured");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Please enter the task description of less than 50 characters: ");
            return false;
        }
    }
    
    public String createTaskId() {
        taskId = taskName.substring(0, 2) + ";" + count + ";" + developerDetails.substring(developerDetails.length() - 3);
        taskId = taskIdObject.toString();
        return taskId;
    }
    
    public String printTaskDetails() {
        if (taskStatus.equals("1")) {
            taskStatus = "To Do";
        } else if (taskStatus.equals("2")) {
            taskStatus = "Done";
        } else if (taskStatus.equals("3")) {
            taskStatus = "Doing";
        }
        taskDetails = taskStatus + ";" + developerDetails + ";" + count + ";" + taskName + ";" + taskDescription + ";" + taskId + ";" + taskDuration;
        return taskDetails;
    }
    
    public int returnTotalHours() {
        if (count == 0) {
            total = taskDuration;
        } else if (count >= 1) {
            total += taskDuration;
        }
        count++;
        return total;
    }
}