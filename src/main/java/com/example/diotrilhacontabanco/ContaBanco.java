package com.example.diotrilhacontabanco;

import lombok.Getter;
import lombok.Setter;

import java.beans.ConstructorProperties;

public class ContaBanco {

    @Getter
    int conta;

    @Getter
    @Setter
    double saldo;

    @Getter
    @Setter
    String titular;

    @ConstructorProperties( { "conta", "saldo", "titular" } )
    public ContaBanco() {}
}
