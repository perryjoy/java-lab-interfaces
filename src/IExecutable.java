package ru.spbstu.pipeline;

public interface IExecutable {
	RetCode.AlgorithmCode execute(byte [] data);
}
