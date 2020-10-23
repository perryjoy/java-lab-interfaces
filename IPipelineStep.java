public interface IPipelineStep implements IExecutable {
	ReturningCode setConsumer(IExecutable c);
	ReturningCode setProducer(IExecutable p);
}