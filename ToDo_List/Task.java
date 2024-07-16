
public class Task {
    static Integer index;
    int id;
    String name;
    Priority p;
    String description;
    int month, day, year;

    public Task() {
        this(index.toString());
    }

    public Task(String name) {
        this(name, 2);
    }

    public Task(String name, int priority) {
        id = index++;
        this.name = name;
        p = Priority.convert(priority);
    }

    public Task(String name, int priority, String date) {
        this(name, priority);
        editDate(date);
    }

    public void editDate(String date) {
        String m = date.substring(0, 2);
        String d = date.substring(3, 5);
        String y = date.substring(6);

        month = Integer.parseInt(m);
        day = Integer.parseInt(d);
        year = Integer.parseInt(y);
    }

    public void editDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void editDesc(String desc) {
        description = desc;
    }

    public void addDesc(String desc) {
        description += desc;
    }

    public Priority getPriority() {
        return p;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return id;
    }

    public String getDueDate() {
        return String.valueOf(month) + "/" + String.valueOf(day) + "/" + String.valueOf(year);
    }

    public static int getCurrentIndex() {
        return index;
    }

}