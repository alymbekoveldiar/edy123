public abstract class Ehetote implements WriteToFile {
    private String text;
    private String date;
    TypeTote typeTote;

    public Ehetote(String text, String date, TypeTote typeTote) {
        this.text = text;
        this.date = date;
        this.typeTote = typeTote;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public TypeTote getTypeTote() {
        return typeTote;
    }

    public void setTypeTote(TypeTote typeTote) {
        this.typeTote = typeTote;
    }
}
