package singleton

/**
 *
 * @author nqh 2018/8/16
 */

class Singleton3 private constructor() {
    companion object {
        @Volatile
        var instance: Singleton3? = null
            get() {
                if (instance == null) {
                    synchronized(Singleton3::class.java) {
                        if (instance == null) {
                            instance = Singleton3()
                        }
                    }
                }
                return instance!!
            }
    }

    fun text() {
        println("this is single kotlin class: " + instance.toString())
    }
}
