import java.util.HashMap;

public class Data {
    String name;
    String des;

    Data(){

    }
    Data(String name, String des){
        this.name=name;
        this.des=des;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
