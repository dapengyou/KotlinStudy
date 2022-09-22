package study

// 内联函数的使用
fun main() {
    login("lady_zhou", "1234") { msg: String, code: Int ->
        println("登录结果: msg:$msg,code:$code")
    }
}

const val USERNAME = "lady_zhou"
const val PASSWORD = "1234"

//当函数中有 lambda 作为参数，就需要声明成内联，为的是减少性能消耗，避免在调用时 会生成多个对象来完成 lambda 的调用
inline fun login(userName: String, userPwd: String, responseResult: (String, Int) -> Unit) {
    if (userName == null || userPwd == null) {
        TODO("用户名或密码不能为空")
    }
    if (userName == USERNAME && userPwd == PASSWORD) {
        responseResult("登录成功", 200)
    } else {
        responseResult("登录失败", 400)
    }
}