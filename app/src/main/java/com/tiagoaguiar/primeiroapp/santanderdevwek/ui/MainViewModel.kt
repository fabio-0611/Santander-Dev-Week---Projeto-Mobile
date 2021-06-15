package com.tiagoaguiar.primeiroapp.santanderdevwek.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tiagoaguiar.primeiroapp.santanderdevwek.data.Conta
import com.tiagoaguiar.primeiroapp.santanderdevwek.local.FakeDate

class MainViewModel : ViewModel(){
    private  val mutableLiveData: MutableLiveData<Conta> =  MutableLiveData()

    fun buscarContaCliente(): LiveData<Conta>{
        mutableLiveData.value= FakeDate().getLocalDate()

        return mutableLiveData
    }

}