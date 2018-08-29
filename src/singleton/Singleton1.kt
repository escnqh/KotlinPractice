package singleton

/**
 * 第一种是直接在类内部定义一个类对象的，然后初始化
 * @author nqh 2018/8/16
 */

class Singleton1 private constructor() {
    companion object {
        val instance = Singleton1()
    }

    fun test() {
        print("this is single kotlin class")
    }
}