package creational.builder;

public class Guitar {
    private String fretBoard;
    private String body;
    private String head;
    private String strings;

    public Guitar(String fretBoard, String body, String head, String strings) {
        this.fretBoard = fretBoard;
        this.body = body;
        this.head = head;
        this.strings = strings;
    }

    public String getFretBoard() {
        return fretBoard;
    }

    public void setFretBoard(String fretBoard) {
        this.fretBoard = fretBoard;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getStrings() {
        return strings;
    }

    public void setStrings(String strings) {
        this.strings = strings;
    }

    public boolean guitarCheck() {
        if (fretBoard == null || body == null || head == null || strings == null) {
            return false;
        }
        return true;
    }
}
