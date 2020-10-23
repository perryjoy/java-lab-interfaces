package ru.edu.spbstu.pipiline;

public interface IPipelineStep extends IExecutable {
	RetCode setConsumer(IExecutable c);
	RetCode setProducer(IExecutable p);
}