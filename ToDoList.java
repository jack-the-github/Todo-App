/**
 * This Class will include the main instances, constructors and methods
 */

import java.util.Date;

public class ToDoTask {
    // instances
    private String taskName;
    private String taskText;
    private Date createdAt;
    private Date deadline;


    // constructors
    //default constructor

    /**
     * Default Constructor
     */
    public ToDoTask(){
    }
    /**
     * Constructor with task name and task description
     * @param taskName as name of the task
     * @param taskText as description of the task
     */
    public ToDoTask(String taskName, String taskText){
        this.taskName = taskName;
        this.taskText = taskText;
    }



    // methods
}
