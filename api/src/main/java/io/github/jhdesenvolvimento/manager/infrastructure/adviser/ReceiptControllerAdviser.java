package io.github.jhdesenvolvimento.manager.infrastructure.adviser;

import io.github.jhdesenvolvimento.manager.domain.exception.ReceiptNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ReceiptControllerAdviser {

    @ExceptionHandler(ReceiptNotFoundException.class)
    public ResponseEntity<String> receiptNoFoundHandler(ReceiptNotFoundException exception) {
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
    }
}
