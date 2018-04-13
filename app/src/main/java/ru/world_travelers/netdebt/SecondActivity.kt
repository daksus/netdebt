package ru.world_travelers.netdebt

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*


class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var key = getIntent().getExtras().getString("key")
        if (key == "2") {
            edName3.visibility = View.INVISIBLE
            edName4.visibility = View.INVISIBLE
        }
        if (key == "3") {
            edName4.visibility = View.INVISIBLE
        }

    }

    fun fСonfirm (view: View) {

        val name1 = edName1.text
        val name2 = edName2.text
        val name3 = edName3.text
        val name4 = edName4.text

        val myToast = Toast.makeText(this, name1.toString(), Toast.LENGTH_SHORT)
        myToast.show()


    }
}
