import java.io.FileOutputStream;

public interface IWriter extends IConfigurable, IPipelineStep {
	ReturningCode setOutputStream(FileOutputStream fos);
}
