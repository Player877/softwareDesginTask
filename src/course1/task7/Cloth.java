package course1.task7;

public abstract class Cloth {
    private int value;
    private String description;

    public Cloth(int value, String description) {
        this.value = value;
        this.description = description;
    }

    String getDescription() {
        return description;
    }

    int getValue() {
        return value;
    }
}
