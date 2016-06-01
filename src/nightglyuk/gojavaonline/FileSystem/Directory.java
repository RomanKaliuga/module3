package nightglyuk.gojavaonline.FileSystem;


import java.util.List;

public abstract class Directory {
    List<File>  Files;

    public List<File> getFiles() {
        return Files;
    }

    public void setFiles(List<File> files) {
        Files = files;
    }

    File addedFile = new File();

    public void addFile (File addedFile){
        addedFile.setName("Some name");
        addedFile.setType("text,audio or image");
        addedFile.getSize();
    }

        public abstract void deleteFile(File deletedFile);

}
