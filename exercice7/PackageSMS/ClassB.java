package PackageSMS;

public class ClassB implements Textable {
    @Override
    public String alerter(String msg) {
        msg = "Alerte depuis ClassB: " + msg;
        return msg;
    }
}