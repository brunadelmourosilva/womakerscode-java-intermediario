package com.bruna.javaintermediario.enumeradores.classes;

public enum TipoDocumento {

    //cada enum precisa implementar o método abstrato
    CPF {
        @Override
        public String geraNumeroTeste() {
            return GeraCpfCnpj.cpf(); //classe
        }
    }, CNPJ {
        @Override
        public String geraNumeroTeste() {
            return GeraCpfCnpj.cnpj(); //classe
        }
    };

    public abstract String geraNumeroTeste();
}
