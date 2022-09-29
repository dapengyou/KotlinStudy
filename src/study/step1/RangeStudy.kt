package study

/**
 * range 表达式， 范围 从哪里 到哪里
 */
fun main() {
    val number = 185

    if (number in 0..59) {
        println("不及格")
    } else if (number in 60..84) {
        println("良好")
    } else if (number in 85..100) {
        println("优秀")
    } else if (number !in 0..100) {
        println("异常优秀")
    }
}