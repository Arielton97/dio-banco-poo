package com.example.diotrilhacontabanco;

import lombok.Getter;
import lombok.Setter;

import java.beans.ConstructorProperties;

public class ContaBanco {

    @Getter
    private int conta;

    @Getter
    @Setter
    private double saldo;

    @Getter
    @Setter
    private String titular;

    @ConstructorProperties( { "conta", "saldo", "titular" } )
    public ContaBanco() {}
}
