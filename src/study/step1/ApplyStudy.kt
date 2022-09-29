package study

/**
 * apply 用法, apply 函数始终返回的是 自己本身， 所以可以链式调用
 */
fun main() {
    val info = "apply used"
    info.apply {
        println("长度是：${this.length}")
    }.apply {
        println("最后一个字符： ${this[length - 1]}")
    }.apply {
        println("转换为大写: ${uppercase()}")//可以省略 this
    }
}