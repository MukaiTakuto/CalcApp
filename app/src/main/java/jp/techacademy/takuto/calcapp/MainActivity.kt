package jp.techacademy.takuto.calcapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }


    override fun onClick(v: View) {
//        val Height = EditText(this)
//        if (Height.getText().toString().length() == 0) {
//        }
//        else {




            val editText1 = findViewById(R.id.editText) as EditText
            val editText2 = findViewById(R.id.editText2) as EditText

            val str1 = editText1.text.toString()
            val str2 = editText2.text.toString()

         if(str1.equals("")|| str2.equals("")){
        }
         else{


            val a = str1.toFloat()
            val b = str2.toFloat()

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("VALUE1", a)
            intent.putExtra("VALUE2", b)

            if (v.id == R.id.button) {
                intent.putExtra("VALUE3", 1f)
                startActivity(intent)

            } else if (v.id == R.id.button2) {
                intent.putExtra("VALUE3", 2f)
                startActivity(intent)
            } else if (v.id == R.id.button3) {
                intent.putExtra("VALUE3", 3f)
                startActivity(intent)
            } else if (v.id == R.id.button4) {
                intent.putExtra("VALUE3", 4f)
                startActivity(intent)
            }

        }
    }
}
