public enum Priority {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    private int level;

    Priority(int level) {
        this.level = level;
    }

    public int getPrioirty() {
        return level;
    }

    public static Priority convert(int level) {
        switch (level) {
            case 3:
                return HIGH;
            case 2:
                return MEDIUM;
            default:
                return LOW;
        } 
    }

    public String toString() {
        switch (level) {
            case 3:
                return "High";
            case 2:
                return "Medium";
            default:
                return "Low";
        } 
    }
}