/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package poepart2;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Assertions;

public class POEPart2Test {
    
    public POEPart2Test() {
    }

    @Test
    public void testMain() {
    }
    
    @Test
    public void testCheckTaskDescription() {
        Task task = new Task();
        task.setTaskDescription("Create login to authenticate users");
        
        Assertions.assertEquals(false, task.checkTaskDescription());
    }
    
    @Test
    public void testCreateTaskId() {
        Task task1 = new Task();
        task1.setTaskName("Login feature");
        task1.setDeveloperDetails("Robyn Harrison");
        
        Assertions.assertEquals("Lo:0:BYN", task1.createTaskId());
        
        Task task2 = new Task();
        task2.setTaskName("Add task feature");
        task2.setDeveloperDetails("Mike Smith");
        
        Assertions.assertEquals("Ad:1:MS", task2.createTaskId());
    }
}
    

