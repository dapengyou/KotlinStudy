package study

fun main() {
    var week = "5 "
    val info = when (week) {
        "-1"-> TODO("错误数据")// nothing 用法，终止程序执行，并抛出一个NotImplementedError 异常
        "1" -> "今天是星期$week"
        "2" -> "今天是星期$week"
        "3" -> "今天是星期${week}"
        "4" -> "今天是星期${week}"
        "5" -> "今天是星期${week}"
        "6" -> "今天是星期${week}"
        "7" -> "今天是星期${week}"
        else -> {
            println("这个日子只在梦里有")
        }
    }
    println(info)

    println("${if ("5".toInt() !in 1..4) "明天可以休息了" else "明天还得上班"}")
}