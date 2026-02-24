package pack1;

import java.util.ArrayList;
import java.util.List;

public class Geo {

    private String name;
    private String code;
    private List<Geo> children;

    public Geo(String name, String code) {
        this.name = name;
        this.code = code;
        this.children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Geo> getChildren() {
        return children;
    }

    public void setChildren(List<Geo> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Geo{" +
                "name='" + name + '\'' +
                ", children=" + children +
                '}';
    }
}
