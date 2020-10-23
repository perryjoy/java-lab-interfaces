package ru.spbstu.pipeline;

import java.io.FileInputStream;

public interface IReader extends IConfigurable, IPipelineStep {
	RetCode.SetterCode setInputStream(FileInputStream fis);
}
