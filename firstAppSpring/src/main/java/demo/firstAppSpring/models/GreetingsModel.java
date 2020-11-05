package demo.firstAppSpring.models;

public class GreetingsModel {
    private int ID;
    private String content;

    public GreetingsModel(int ID, String content) {
        this.ID = ID;
        this.content = content;
    }

    public int getID() {
        return this.ID;
    }

    public String getContent() {
        return this.content;
    }
}
