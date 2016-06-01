package nightglyuk.gojavaonline.FileSystem;


public class TextFile extends File{
    String Text= new String();

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }
}
