package com.neogedom.anaprojsist.domain.types;

import org.apache.commons.validator.ValidatorException;
import org.apache.commons.validator.routines.ISBNValidator;

import lombok.Getter;

@Getter
public class ISBN {
    private String valor;

    public ISBN() {
      try {
        assertValid(valor);
      } catch (ValidatorException e) {
        e.printStackTrace();
      }
    }

    public String getValor() {
        return valor;
    }

    private void assertValid(String valor) throws ValidatorException {
        ISBNValidator isbnValidator = ISBNValidator.getInstance();
       
        if (!isbnValidator.isValid(valor)) {
          throw new ValidatorException("ISBN inválido!");
        }
    }
}
