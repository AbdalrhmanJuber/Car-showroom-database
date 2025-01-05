package application;


public class Suppliers {
    private int Sid;
    private String Sname;
    private String Sphone;
    private String Scountry;
    private int Srating;

    public Suppliers(int sid, String sname, String scountry, String sphone, int srating) {
        Sid = sid;
        Sname = sname;
        Scountry = scountry;
        Sphone = sphone;
        Srating = srating;
    }

    public int getSid() {
        return Sid;
    }

    public String getSname() {
        return Sname;
    }

    public String getSphone() {
        return Sphone;
    }

    public String getScountry() {
        return Scountry;
    }

    public int getSrating() {
        return Srating;
    }

    public void setSid(int sid) {
        Sid = sid;
    }

    public void setSrating(int srating) {
        Srating = srating;
    }

    public void setSphone(String sphone) {
        Sphone = sphone;
    }

    public void setScountry(String scountry) {
        Scountry = scountry;
    }

    public void setSname(String sname) {
        Sname = sname;
    }
}
