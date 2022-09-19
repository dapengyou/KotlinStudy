package study

/**
 * 判空
 */
fun main() {
    var name: String? = null

    //当name 为 null，后面的不会执行，不会引发空指针异常
    println(name?.length)

}