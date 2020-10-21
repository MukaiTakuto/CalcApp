package jp.techacademy.takuto.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*


class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val value1 = intent.getFloatExtra("VALUE1", 0f)
        val value2 = intent.getFloatExtra("VALUE2", 0f)
        val value3 = intent.getFloatExtra("VALUE3", 0f)

        if (value3 == 1f) {
            textView.text = "${value1 + value2}"
        }
        else if (value3 == 2f) {
            textView.text = "${value1 - value2}"
        }
        else if (value3 == 3f) {
            textView.text = "${value1 * value2}"
        }
        else if (value3 == 4f) {
            textView.text = "${value1 / value2}"
        }




    }
}
