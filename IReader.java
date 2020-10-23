import java.io.FileInputStream;

public interface IReader extends IConfigurable, IPipelineStep {
	ReturningCode setInputStream(FileInputStream fis);
}
