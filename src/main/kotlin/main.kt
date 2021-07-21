fun main() {
    lovePredict(22,17)
    println(lovePredict(22,17))


    rechanged()

}


fun lovePredict(flower1: Int, flower2: Int): Boolean {
    return flower1 % 2 != flower2 % 2;
}

fun rechanged(){
    var num2 = 987654321
    var reversed = 0

    while (num2 != 0) {
        val digit = num2 % 10
        reversed = reversed * 10 + digit
        num2 /= 10
    }
    println("Reversed Number: $reversed")
}