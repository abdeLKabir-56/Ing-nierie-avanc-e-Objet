package PackageSMS;

public class ClassA implements Textable {
    @Override
    public String alerter(String msg) {
        msg = "Alerte depuis ClassA: " + msg;
        return msg;
    }
}