package exercises.technology;

public abstract class AbstractEntity {
    private static int count = 0;
    private int ID;

    public AbstractEntity() {
        this.ID = ++count;
    }
    public int getID(){
        return this.ID;
    }
}
