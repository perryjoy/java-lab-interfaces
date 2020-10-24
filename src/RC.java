package ru.spbstu.pipeline;

public enum RC {

	CODE_SUCCESS, // ошибки не произошло
	CODE_INVALID_ARGUMENT, // аргумент командной строки невалиден
	CODE_FAILED_TO_READ, // невозможно прочитать из потока
	CODE_FAILED_TO_WRITE, // невозможно записать в поток
	CODE_BAD_FORMATTING, // ошибка в грамматике конфига
	CODE_INPUT_FILE_OPEN, // невозможно открыть поток на чтение
	CODE_OUTPUT_FILE_OPEN, // невозможно открыть поток на запись
	CODE_INVALID_SYNTAX_PARAMETER, // ошибка в конфиге - не найден параметр или найден лишний
	CODE_INVALID_SEMANTIC_PARAMETER, // ошибка в конфиге - в параметре ошибка
	CODE_FAILED_PIPELINE_CONSTRUCTION // при конструировании конвейера произошла ошибка
}
