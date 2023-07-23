package uz.gita.delegationdemo_john

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity(),
    ActivityLogger by ActivityLoggerImpl() {

    private val myLazy by MyLazy {
        Log.d("GGG", "MyLazy fired")
        3
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("GGG", "Firing MyLazy: $myLazy")

        registerLifecycleOwner(this)
    }
}