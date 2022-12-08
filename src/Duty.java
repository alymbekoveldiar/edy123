public class Duty extends Ehetote{
    private int sumDute;

    public Duty(String text, int date, TypeTote typeTote, int sumDute) {
        super(text, date, typeTote);
        this.sumDute = sumDute;
    }

    public int getSumDute() {
        return sumDute;
    }

    public void setSumDute(int sumDute) {
        this.sumDute = sumDute;
    }

    public Duty(String text, int date, TypeTote typeTote) {
        super(text, date, typeTote);
    }

    @Override
    public void printinfo() {

    }
}
