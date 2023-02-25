package edu.notes.hiltapp

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch

class CountViewModel: ViewModel() {
     fun collectFlow(){
       GlobalScope.launch {
           counDownflow.collectLatest {
               println("Flow from viewmodel $it")
           }

       }
    }
    init {
        collectFlow()
    }
    var count=0
    fun addCount(){
        count=count+1
    }

    var counDownflow= flow<Int> {
        var startingValue=10
        var currentValue=startingValue
        emit(startingValue)
        while (startingValue>0){
            delay(1000)
            currentValue--
            emit(currentValue)

        }
    }


}