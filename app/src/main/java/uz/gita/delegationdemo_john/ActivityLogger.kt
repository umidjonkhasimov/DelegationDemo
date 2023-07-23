package uz.gita.delegationdemo_john

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner

interface ActivityLogger {
    fun registerLifecycleOwner(owner: LifecycleOwner)
}

class ActivityLoggerImpl : ActivityLogger, LifecycleEventObserver {

    override fun registerLifecycleOwner(owner: LifecycleOwner) {
        owner.lifecycle.addObserver(this)
    }

    override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {
        when (event) {
            Lifecycle.Event.ON_CREATE -> {
                Log.d("GGG", "onStateChanged: ON_CREATE")
            }

            Lifecycle.Event.ON_START -> {
                Log.d("GGG", "onStateChanged: ON_START")
            }

            Lifecycle.Event.ON_RESUME -> {
                Log.d("GGG", "onStateChanged: ON_RESUME")
            }

            Lifecycle.Event.ON_PAUSE -> {
                Log.d("GGG", "onStateChanged: ON_PAUSE")
            }

            Lifecycle.Event.ON_STOP -> {
                Log.d("GGG", "onStateChanged: ON_STOP")
            }

            Lifecycle.Event.ON_DESTROY -> {
                Log.d("GGG", "onStateChanged: ON_DESTROY")
            }

            Lifecycle.Event.ON_ANY -> {
                Log.d("GGG", "onStateChanged: ON_ANY")
            }
        }
    }
}