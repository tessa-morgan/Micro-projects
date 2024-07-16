import java.util.ArrayList;
public class Board {
    private ArrayList<Task> tasks = new ArrayList<>();
    private String boardName = "";

    static Integer id = 1;
    static ArrayList<Board> boards = new ArrayList<>();
    
    public Board() {
        this(id.toString());
    }

    public Board(String name) {
        boardName = name;
        boards.add(this);
        id++;
    }

    public Board getBoard(Integer id) {
        return boards.get(id);
    }
    
}