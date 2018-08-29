package singleton

/**
 *利用 lazy 进行懒加载，当有实质性的调用的时候再初始化
 * @author nqh 2018/8/16
 */

class Singleton2 private constructor() {
    private object Holder {
        val INSTANCE = Singleton2()
    }

    companion object {
        val instance: Singleton2 by lazy { return@lazy Holder.INSTANCE }
    }

    fun test() {
        println("this is single kotlin class: " + instance.toString())
    }

}