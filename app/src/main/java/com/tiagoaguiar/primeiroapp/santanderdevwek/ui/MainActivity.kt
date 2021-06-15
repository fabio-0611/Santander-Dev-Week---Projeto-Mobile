package com.tiagoaguiar.primeiroapp.santanderdevwek.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.widget.Toolbar
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import androidx.lifecycle.observe
import com.tiagoaguiar.primeiroapp.santanderdevwek.R
import com.tiagoaguiar.primeiroapp.santanderdevwek.data.Conta

class MainActivity : AppCompatActivity() {
    private lateinit var mainViewMode: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewMode = ViewModelProvider(this).get(MainViewModel::class.java)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        this.setSupportActionBar(toolbar)
        onNavigationOnClick(toolbar)
        getSupportActionBar()?.setTitle("")
        buscarContaCliente()
    }

    private fun buscarContaCliente() {

        mainViewMode.buscarContaCliente().observe(this,{ result ->
            bindOnView(result)
        })
    }


    fun bindOnView(conta : Conta) {
        findViewById<TextView>(R.id.tv_agencia).text = conta.agencia
        findViewById<TextView>(R.id.tv_conta_corrente).text = conta.numero
        findViewById<TextView>(R.id.tv_saldo).text = conta.saldo
        findViewById<TextView>(R.id.tv_saldo_limite).text = conta.limite
        findViewById<TextView>(R.id.tv_cartao_final_value).text = conta.cartao
        findViewById<TextView>(R.id.tv_usuario).text = conta.cliente
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflate = menuInflater
        inflate.inflate(R.menu.main_menu, menu)
        return true
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    fun onNavigationOnClick(toolbar: Toolbar) {
        toolbar.setNavigationOnClickListener {
            showToast("Click Nav Menu")
        }
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.item_1 -> {
                showToast("Click Notifications")
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
