package nightglyuk.gojavaonline.FileSystem;


public abstract class AudioFile extends File{
    private int Length;
    private int Quality;

        public int getLength() {
            return Length;
        }

        public int getQuality() {
            return Quality;
        }

        public abstract void  play();

}
