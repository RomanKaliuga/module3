package nightglyuk.gojavaonline.FileSystem;


public class File {
    private String Name = new String();
    private String Type = new String();

    public int getSize() {
        return Size;
    }

    public String getType() {
        return Type;

    }

    public void setType(String type) {
        Type = type;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    private int Size;
}
