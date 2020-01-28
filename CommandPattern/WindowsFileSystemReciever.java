package CommandPattern;

public class WindowsFileSystemReciever implements FileSystemReciever{
    @Override
    public void openOS(){
        System.out.println("Opening file in Windows");
    }

    @Override
    public void writeOS() {
       System.out.println("Writing file in Windows");
    }

    @Override
    public void closeOS() {
       System.out.println("Closing file in Windows");
    }

}
