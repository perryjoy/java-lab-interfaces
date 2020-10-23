public class ReturningCode {
	public enum ConfigurationError {
		NO_ERROR,
		INVALID_ARGUMENT_ERROR,
		READ_ERROR,
		GRAMMAR_MISMATCH_ERROR,
		BUFFER_SIZE_ERROR,
		ALGORITHM_PARAM_ERROR
	}
	public enum SetterError {
		NO_ERROR,
		INVALID_ARGUMENT_ERROR
	}
	public enum AlgorithmError {
		NO_ERROR,
		INVALID_ARGUMENT_ERROR,
		READ_ERROR,
		WRITE_ERROR
	}
}
