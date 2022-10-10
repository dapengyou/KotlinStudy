package study.step2

fun main() {
    val set = setOf("lady_zhou", "mary", "jeck", "lisa")
    println(set.elementAt(2))
    println(set.elementAtOrElse(6) {
        "下标越界了"
    })
    println(set.elementAtOrNull(7) ?: "下标又越界了")

    //可变 set 集合
    val set1 = mutableSetOf("书写", "数学", "物理")
    set1.add("生物")
    set1.remove("书写")
    println(set1)

    set1 += "地理"
    set1 += "物理"// 相同 的元素 会被覆盖
    println(set1)
    set1 -= "数学"
    println(set1)


}