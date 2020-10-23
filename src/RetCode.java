package ru.spbstu.pipeline;

public class RetCode {
	public enum ConfigCode {
		CODE_SUCCESS,
		CODE_FILE_NOT_FOUND,
		CODE_READING_ERROR,
		CODE_BAD_FORMATTING,
		CODE_MISSING_PARAMETER
	}
	public enum SetterError {
		CODE_SUCCESS,
		CODE_INVALID_ARGUMENT
	}
	public enum AlgorithmError {
		CODE_SUCCESS,
		CODE_INVALID_ARGUMENT,
		CODE_READING_ERROR,
		CODE_WRITING_ERROR
	}
}
