package com.example.kotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var jasd: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val num = init(5, 6)
        fun xxx(a: Int, b: String) = a.toString() + b
//        main_text.text = num.toString() + xxx(5, "哈哈是的")
        main_text.text = num.toString() + "------" + asd(3, 3) + "----------" + erwe("wocaonidaye") + "----" + say("99999")
    }

    fun init(a: Int, b: Int): Int {
        return a + b
    }

    public fun asd(q: Int, w: Int): Int? = q * w

    fun getData(a: Int, b: Int): Unit {
        println(a + b)
    }

    fun say(str: String = "hello"): String = str

    fun erwe(heh: String) = heh + "asdjhasd"

    public fun xxx(c: Int, d: Int): String {
        return (c + d).toString()
    }

    fun qwe() {
        val xx: Long = 5;
        if (xx in 1..5) {
            println()
        }
        for (xx in 1..5) {
            println(xx)
        }
    }

    fun cases(obj: Any) {
        when (obj) {
            1 -> print("第一项")
            "hello" -> print("这个是字符串hello")
            is Long -> print("这是一个Long类型数据")
            !is String -> print("这不是String类型的数据")
            else -> print("else类似于Java中的default")
        }

        when (obj) {
            "q" -> print("xxxx")
            10 -> println("xxx")
            's' -> print("sdfjsd")
            else -> print("xxxxxxxxxxxxxxxx")
        }
    }

    fun vars(vararg v: Int) {
        for (vt in v) {
            print(vt)
        }
    }

    // 测试
    fun main(args: Array<String>) {
        vars(1, 2, 3, 4, 5)  // 输出12345
    }
}
