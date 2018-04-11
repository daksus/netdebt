package ru.world_travelers.netdebt

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

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
                val numberPerson = Intent(this, SecondActivity::class.java)
                numberPerson.putExtra("key", "2")
                startActivity(numberPerson)

            }
            R.id.bThree -> {
                val numberPerson = Intent(this, SecondActivity::class.java)
                numberPerson.putExtra("key", "3")
                startActivity(numberPerson)
            }
            R.id.bFour -> {
                val numberPerson = Intent(this, SecondActivity::class.java)
                numberPerson.putExtra("key", "4")
                startActivity(numberPerson)
            }
        }


    }
}
