package ru.spbstu.pipiline;

import java.io.FileOutputStream;

public interface IWriter extends IConfigurable, IPipelineStep {
	RetCode setOutputStream(FileOutputStream fos);
}
