public enum Priority {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    final private int level;

    Priority(int level) {
        this.level = level;
    }

    public int getPrioirty() {
        return level;
    }

    public static Priority convert(int level) {
        return switch (level) {
            case 3 -> HIGH;
            case 2 -> MEDIUM;
            default -> LOW;
        }; 
    }

    @Override
    public String toString() {
        return switch (level) {
            case 3 -> "High";
            case 2 -> "Medium";
            default -> "Low";
        }; 
    }
}