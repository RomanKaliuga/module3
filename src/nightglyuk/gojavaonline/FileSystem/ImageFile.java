package nightglyuk.gojavaonline.FileSystem;


public abstract class ImageFile extends File{
    int Width;
    int Height;

    public int getWidth() {
        return Width;
    }

    public int getHeight() {
        return Height;
    }

    public abstract void paint();
}
