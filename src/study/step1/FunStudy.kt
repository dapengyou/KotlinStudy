package study

/**
 * 函数参数调用
 */
fun main() {
    /* method("lady_zhou", "123456", "56789")
     method1("mary")
     method(phone = "xxxxx", username = "kotlin", password = "qwer")

     //反引号 `` 用法1：作为测试方法
     `测试功能 在测试环境下测试登录功能`("test", "0000", "1111")
     //反引号 `` 用法 2： 当与 Java 文件交互时，所遇到的方法名是 kt 里面的关键字，用 ``
     Test.`in`()
     Test.`is`()

     charCount("hello kotlin")*/

    //1、函数输入输出声明
    val methodAction: () -> String
    //2、对上面实现
    methodAction = {
        val value = 666
        "lady_zhou study kotlin is $value"//隐式返回，省略 return
    }

    //1 和 2 合并
//    val methodAction: () -> String = {
//        val value = 666
//        "lady_zhou study kotlin is $value"
//    }
    println(methodAction()) //     methodAction.invoke() 与 methodAction() 是等价的
}

private fun method(username: String, password: String, phone: String) {
    println("用户$username 的手机号是: $phone, 密码是: $password")
}

private fun method1(username: String, password: String = "23456", phone: String = "987654") {
    println("用户$username 的手机号是: $phone, 密码是: $password")
}

//反引号 `` 的使用
private fun `测试功能 在测试环境下测试登录功能`(username: String, password: String, phone: String) {
    println("测试环境下：用户$username 的手机号是: $phone, 密码是: $password")
}

//匿名函数
private fun charCount(name: String) {
    val len = name.count()
    println(len)

    val len2 = name.count {
        //匿名函数，it 代表 具体的 char 比如 h,e,l,l,o; 只有一个参数时 会有隐式的 it
        it == 'o'
    }
    println(len2)
}
