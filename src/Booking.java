public class Booking {
    private String owner;
    private String firstHour;
    private String finalHour;
    private String date;
    private String avaiable;
    private int code;

    public Booking() {
        owner = "";
        firstHour = "";
        finalHour = "";
        date = "";
        avaiable = "";
        code = -9999;
    }

    public enum INFORMATIONS {
        OWNER,
        FIRST_HOUR,
        FINAL_HOUR,
        DATE,
        AVAIABLE,
        PERSONAL_CODE
    }

    public Booking(String owner, String firstHour, String finalHour, String date, String avaiable, int code) {
        this.owner = owner;
        this.firstHour = firstHour;
        this.finalHour = finalHour;
        this.date = date;
        this.avaiable = avaiable;
        this.code = code;
    }

    @Override
    public String toString() {
        return owner + ";" + firstHour + ";" + finalHour + ";" + date + ";" + avaiable + ";" + String.valueOf(code);
    }

    public String getOwner() { return owner; }
    public String getFirstHour() { return firstHour; }
    public String getFinalHour() { return finalHour; }
    public String getDate() { return date; }
    public String getAvaiable() { return avaiable; }
    public int getCode() { return code; }
}