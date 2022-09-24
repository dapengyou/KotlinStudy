package study

const val DEFAULT = "lady_zhou is successful aaa"
fun main() {
    val indexOf = DEFAULT.indexOf("u") //取第一个 u 是什么位置

    //substring 字段截取使用
    println(DEFAULT.substring(0 until indexOf))//until： 0 到 indexof 位置的字符
    println(DEFAULT.substring(indexOf))//indexof 位置之后的字符

    //split 字段拆分使用
    val list = DEFAULT.split(" ")
    println("分割后的元素：$list")

    val (v1, v2, v3) = list
    println("变量有： v1:$v1, v2:$v2, v3:$v3")

    //replace
    val test1 = DEFAULT.replace("a", "Y")
    println("替换所有a 变为Y, $test1")
    val test2 = DEFAULT.replaceAfterLast("a", "Y")
    println("替换掉最后一个a后面所有的字段, $test2")
    val test3 = DEFAULT.replaceAfter("a", "Y")
    println("替换掉第一个a后面的所有字段, $test3")

    val test4 = DEFAULT.replaceBefore("a", "Y")
    println("替换掉第一个a前面的所有字段, $test4")
    val test5 = DEFAULT.replaceBeforeLast("a", "Y")
    println("替换掉最后一个a前面的所有字段, $test5")
    val test6 = DEFAULT.replaceFirst("a", "Y")
    println("替换掉第一个字段变成Y, $test6")

    val test7 = DEFAULT.replaceIndent("a1111")
    println("替检测常见的最小缩进，并将其替换为指定的 a1111。, $test7")
    val test8 = DEFAULT.replaceRange(1, 2, "222222")
    println("替换下标到另一个下标之间的内容, $test8")

    val test9 = DEFAULT.replace(Regex("[acu]")){
        when(it.value){
            "a"->"6"
            "c"->"8"
            "u"->"5"
            else -> it.value
        }
    }
    println("变换后：$test9")
}