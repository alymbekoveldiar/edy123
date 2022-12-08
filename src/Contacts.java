public class Contacts extends Ehetote{
    private String phoneNumber;
    private String nameCint;
    TypeNumber typeNumber;

    public Contacts(String text, String date, TypeTote typeTote) {
        super(text, date, typeTote);
    }

    public Contacts(String text, String date, TypeTote typeTote, String phoneNumber, String nameCint, TypeNumber typeNumber) {
        super(text, date, typeTote);
        this.phoneNumber = phoneNumber;
        this.nameCint = nameCint;
        this.typeNumber = typeNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNameCint() {
        return nameCint;
    }

    public void setNameCint(String nameCint) {
        this.nameCint = nameCint;
    }

    public TypeNumber getTypeNumber() {
        return typeNumber;
    }

    public void setTypeNumber(TypeNumber typeNumber) {
        this.typeNumber = typeNumber;
    }


    @Override
    public void printinfo() {

    }
}
