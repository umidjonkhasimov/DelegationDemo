package uz.gita.delegationdemo_john

import kotlin.reflect.KProperty

class MyLazy<out T : Any?>(private val init: () -> T) {
    private var value: T? = null
    operator fun getValue(thisRef: Any?, property: KProperty<*>): T {
        return if (value == null) {
            value = init()
            value!!
        } else {
            value!!
        }
    }
}