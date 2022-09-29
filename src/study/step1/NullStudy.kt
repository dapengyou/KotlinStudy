package study

/**
 * 判空
 */
fun main() {
    var name: String? = null

    name = "lady_zhou"
    //当name 为 null，后面的不会执行，不会引发空指针异常
    println(name?.length)

    // !! 表示无论name 是否为 null 都会执行后面的语句
//    println(name!!.length)

    //空合并操作符 如果值为 null 会执行?: 后面的语句
    println(name ?: "name 值为 null")

    //let 函数 + 空合并操作符, 当值不为 null 时 走到let， let 可以将传入的值返回到 name 身上
    println(name?.let { "$it" } ?: "name 值为 null")
}