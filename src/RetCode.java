package ru.spbstu.pipeline;

public class RetCode {
	public enum ConfigCode {
		SUCCESS,
		FILE_NOT_FOUND,
		READING_ERROR,
		BAD_FORMATTING,
		MISSING_PARAMETER
	}
	public enum SetterError {
		SUCCESS,
		INVALID_ARGUMENT
	}
	public enum AlgorithmError {
		SUCCESS,
		INVALID_ARGUMENT,
		READING_ERROR,
		WRITING_ERROR
	}
}
