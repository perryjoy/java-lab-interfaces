package ru.spbstu.pipeline;

public interface IPipelineStep extends IExecutable {
	RetCode setConsumer(IExecutable c);
	RetCode setProducer(IExecutable p);
}