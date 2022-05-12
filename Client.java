package JavaBegginer.Session14;

public class Client {
    private int id;
    private String emri;
    private char gender;
    private String date;
    private String adress;
    int index = 0;
    static Client[] clients;


    public Client(int i, String e, char g, String d, String a) {
        id = i;
        emri = e;
        gender = g;
        date = d;
        adress = a;
    }

    public int getId() {
        return id;
    }

    public String getEmri() {
        return emri;

    }

    public void setEmri(String e) {
        emri = e;

    }

    public char getGender() {

        return gender;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String a) {

        adress = a;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String d) {
        date = d;
    }


    @Override
    public String toString() {
        return String.format("Id:%d%nEmri:%s%nGender:%c%nDate:%s%nAdress:%s%n", id, emri, gender, date, adress);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Client) {
            Client c = (Client) obj;
            return id == c.getId();
        }
        return false;
    }
}


