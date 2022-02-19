fun main(){
    takeNumber(456,20)
    salutation("Conslate")
    interestingFact("I play ultimate frisbee")
    var x=add(45,67,89,65)
    println(x)


}

fun add (a:Int,b:Int,c:Int,d:Int) :Int {
    var sum=a+b+c+d
   return sum
}
fun takeNumber(number1:Int,number2:Int) :Int{
    var sum= number1%number2
   println(sum)
    return sum
}

fun salutation(name:String){
    println("Hello $name")
}

fun interestingFact(name: String) {
    println(name)
}
