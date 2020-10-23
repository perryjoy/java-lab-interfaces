package ru.spbstu.pipeline;

public class RetCode {
	public enum ConfigCode {
		CODE_SUCCESS,
		CODE_FAILED_TO_READ,
		CODE_BAD_FORMATTING,
		CODE_MISSING_PARAMETER
	}
	public enum SetterCode {
		CODE_SUCCESS,
		CODE_INVALID_ARGUMENT
	}
	public enum AlgorithmCode {
		CODE_SUCCESS,
		CODE_INVALID_ARGUMENT,
		CODE_READING_ERROR,
		CODE_WRITING_ERROR
	}
}
