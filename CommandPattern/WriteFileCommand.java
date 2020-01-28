package CommandPattern;

public class WriteFileCommand implements Command {
   private FileSystemReciever fileSystem;
   public WriteFileCommand(FileSystemReciever fs){
       this.fileSystem=fs;
   }

    @Override
    public void execute() {
    this.fileSystem.writeOS();
    }
}
