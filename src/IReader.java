package ru.edu.spbstu.pipiline;

import java.io.FileInputStream;

public interface IReader extends IConfigurable, IPipelineStep {
	RetCode setInputStream(FileInputStream fis);
}
