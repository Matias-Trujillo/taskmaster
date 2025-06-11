package com.equipo.taskmaster;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testAddTask() {
        App.tasks.clear();
        App.addTask("Terminar ejercicio Maven");
        assertEquals(1, App.tasks.size());
     }
}
 