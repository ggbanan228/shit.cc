package com.example.shitcc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{
var myArray : Array<Int> = arrayOf(0,0,0,0,0)

     fun shet (x:Int)
     {
       myArray[0]=editText.text.toString().toInt()
     }
    
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}
