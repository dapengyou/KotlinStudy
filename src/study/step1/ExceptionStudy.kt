package study.step1

import java.lang.IllegalArgumentException
import kotlin.Exception

/**
 * 自定义异常 和 先决条件函数
 */
fun main() {
    try {
        val info: String? = null
        val value: Boolean = false
        checkException(info)
        //先决条件函数
//        checkNotNull(info)
//        requireNotNull(info)
//        require(value)
    } catch (e: Exception) {
        println(e)
    }

}

fun checkException(info: String?) {
    info ?: throw  CustomException()
}

//自定义异常
class CustomException : IllegalArgumentException("自定义异常")