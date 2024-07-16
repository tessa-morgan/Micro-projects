import java.util.ArrayList;

public class Board {
    private ArrayList<Task> tasks = new ArrayList<>();
    private String boardName;

    private static Integer id = 1;
    private static ArrayList<Board> boards = new ArrayList<>();
    
    public Board() {
        this(id.toString());
    }

    public Board(String name) {
        boardName = name;
        boards.add(this);
        id++;
    }

    public String getBoard() {
        return boardName;
    }

    /**
     * Returns the entire tasks array.
     */
    public ArrayList<Task> getTasks() {
        return tasks;
    }

    /**
     * Returns the task with the specified ID.
     * Note that the task ID is different from its index in tasks.
     * If no task exists with that ID, returns null.
     * @param i
     * @return
     */
    public Task getTask(int i) {
        for (Task t : tasks) {
            if (t.getID() == i)
                return t;
        }
        return null;
    }

    /**
     * Returns a sub-array of all the tasks at the specified priority level.
     * @param level
     * @return
     */
    public ArrayList<Task> getPriority(Priority level) {
        return null;
    }

    /** 
     * Orders tasks highest to lowest priority. Within same priority levels, orders earliest due date to latest.
     * If due date not specified, adds at end of priority level. If due date and priority not specified, adds at 
     * the end of list sorted alphebetically. This is called after a new task is added. 
     */
    private void orderTasks() {

    }

    public static ArrayList<Board> getAllBoards() {
        return boards;
    }
    
}