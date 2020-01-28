package CommandPattern;

public class LinuxFileSystemReciever implements FileSystemReciever{
    @Override
    public void openOS(){
        System.out.println("Opening file in Linux");
    }

    @Override
    public void writeOS() {
       System.out.println("Writing file in Linux");
    }

    @Override
    public void closeOS() {
       System.out.println("Closing file in Linux");
    }

}
