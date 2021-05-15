package Session4.filedemo;

public class MyFile {
    private String fileName;
    private long size;

    public MyFile() {

    }

    public MyFile(String fileName, long size) {
        this.fileName = fileName;
        this.size = size;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }
}
