package ru.world_travelers.netdebt

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Party (view: View)
    {
        val ttt = view.id.toString()
        val myToast = Toast.makeText(this, ttt, Toast.LENGTH_SHORT)

        myToast.show()


    }
}
