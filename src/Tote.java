public class Tote extends Ehetote{

    private String header;

    public Tote(String text, String date, TypeTote typeTote, String header) {
        super(text, date, typeTote);
        this.header = header;
    }

    public Tote(String text, String date, TypeTote typeTote) {
        super(text, date, typeTote);
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    @Override
    public void printinfo() {

    }
}
