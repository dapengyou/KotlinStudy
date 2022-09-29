package study.step2

fun main() {
    //不可变的 list 集合
    val list = listOf("lady_zhou", "mary", "jeck", "lisa")
    // 普通方法取值
    println(list[2])

    //防止崩溃的取值方式 getOrElse() 或 getOrNull() , getOrNull() 一般与 空合并配合使用
    println(list.getOrElse(5) { "下标越界了, 最大只能到 ${list.size - 1} " })
    println(list.getOrNull(5) ?: "下标越界")

    println()

    //可变 list 集合
    val list2 = mutableListOf("书写", "数学", "物理")
    list2.add("生物")
    list2.remove("书写")
    println(list2)

    println()
    // 不可变List  变成 可变list
    val list3 = list.toMutableList()
    list3.add("123")
    println(list3)

    println()
    //可变 list 变成  不可变 list
    val list4 = list2.toList()
//    list4.add

    // mutator 的特性
    list2 += "化学"
    list2 -= "书写"
    println(list2)
    println()

    //removeIf  移除含有“物”字的 元素
    list2.removeIf { it.contains("物") }
    println(list2)
    list2.removeIf { true }//返回 true 自动遍历 整个集合，将元素一个一个删除
    println(list2)

    //list 遍历
    for (i in list) {
        println("元素 $i \t")
    }
    println()

    list.forEach{
        println("元素 $it \t")
    }
    println()
    list.forEachIndexed { index, value ->
        println("下标 $index \t元素 $value \t")

    }

    //list 过滤接收元素
    val(v1) = list
    println("v1:$v1")

    val(_,_,_,v2) = list
    println("v2:$v2")

}