package com.neogedom.anaprojsist.domain.types;

import br.com.caelum.stella.validation.CPFValidator;
import lombok.Getter;

@Getter
public class CPF {
    private String valor;

    public CPF() {
      assertValid(valor);
    }

    public String getValor() {
        return valor;
    }

    private void assertValid(String valor) {
       CPFValidator cpfValidator = new CPFValidator();
       cpfValidator.assertValid(valor);
    }
}
