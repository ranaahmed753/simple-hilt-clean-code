package edu.notes.hiltapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import edu.notes.hiltapp.databinding.ActivityCounterBinding

class CounterActivity : AppCompatActivity() {
    //private lateinit var counterBinding: ActivityCounterBinding
    private lateinit var countViewModel: CountViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        countViewModel=ViewModelProvider(this).get(CountViewModel::class.java)
       var counterBinding: ActivityCounterBinding = DataBindingUtil.setContentView(this,R.layout.activity_counter)
        counterBinding.countText.text= countViewModel.count.toString()
        counterBinding.addCount.text="Increase By 1"
        counterBinding.addCount.setOnClickListener {
            countViewModel.addCount()
            counterBinding.countText.text=countViewModel.count.toString()
        }
    }
}