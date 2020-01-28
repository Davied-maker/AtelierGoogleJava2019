package CommandPattern;

public class CloseFileCommand implements Command {
   private FileSystemReciever fileSystem;
   public CloseFileCommand(FileSystemReciever fs){
       this.fileSystem=fs;
   }

    @Override
    public void execute() {
    this.fileSystem.closeOS();
    }
}
