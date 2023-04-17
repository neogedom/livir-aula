package com.neogedom.anaprojsist.domain.types;

import org.apache.commons.validator.ValidatorException;

import lombok.Getter;

@Getter
public class NonNegativeInteger {
    private Integer valor;

    public NonNegativeInteger() {
      try {
        assertValid(valor);
      } catch (ValidatorException e) {
        e.printStackTrace();
      }
    }

    public Integer getValor() {
        return valor;
    }

    private void assertValid(Integer valor) throws ValidatorException {
       
        if (valor <= 0) {
          throw new ValidatorException("Valor inválido!");
        }
    }
}
