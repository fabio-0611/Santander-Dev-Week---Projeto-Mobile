package com.tiagoaguiar.primeiroapp.santanderdevwek.local

import com.tiagoaguiar.primeiroapp.santanderdevwek.data.Cartao
import com.tiagoaguiar.primeiroapp.santanderdevwek.data.Cliente
import com.tiagoaguiar.primeiroapp.santanderdevwek.data.Conta

class FakeDate{
    fun getLocalDate(): Conta{
        val cliente = Cliente(nome = "Fábio Lima")
        val cartao= Cartao(numeroCartao = "47777777777")
        return Conta(
            numero= "44555-4",
            agencia="6552-4",
            saldo="R$ 2.547,25",
            limite="R$ 4.500,00",
            cliente = "Fábio Lima",
            cartao = "47777777777"
        );

    }
}