package org.example.bootdiary.Exception;

import org.apache.coyote.BadRequestException;

public class BadFileException extends BadRequestException {
    public BadFileException(String message) {
        super(message);
    }
}
