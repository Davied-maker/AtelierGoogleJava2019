package CommandPattern;

public class OpenFileCommand implements Command {
   private FileSystemReciever fileSystem;
   public OpenFileCommand(FileSystemReciever fs){
       this.fileSystem=fs;
   }

    @Override
    public void execute() {
    this.fileSystem.openOS();
    }
}
