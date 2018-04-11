package ru.world_travelers.netdebt

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Party(view: View) {
        //var tmp = findViewById<>(R.id.bTwo)

        // bThree.visibility = View.INVISIBLE


        when (view.id) {
            R.id.bTwo -> {
                val randomIn = Intent(this, SecondActivity::class.java)
                randomIn.putExtra("user", "huihefuihew" )
                startActivity(randomIn)

            }
            R.id.bThree -> {
                textView.setText("3")
            }
            R.id.bFour -> {
                textView.setText("4")
            }
        }


    }
}
