
var psychoPass:Boolean = false;
var greeting:String ?= "Good Morning";

//@JvmName("getGreeting1")
fun assignGreeting():String {
    return "Welcome";
}

fun reassignGreeting() = "Bonjour"; // single (line) function expression and function return type inference

fun sayHello() {
    println("Hello, You're my Haloooooooooooooooooooooooooo");
}
fun main(args: Array<String>){
    sayHello();
    psychoPass = true;
    val name:String = if(psychoPass) "PsychoSam" else "Sashi Bhushan";
    var rollNo:Int = 13;
    rollNo = 35;
    val introduction = "My name is ${name} and my roll number is ${rollNo}";

    if(greeting == null){
        println("Please greet others, it's a good manner to do so.")
    }else{
        println(greeting + ", " + introduction);
    }

    greeting = null;
    when(greeting){
        null -> {
            greeting = assignGreeting();
        }else -> greeting = reassignGreeting();

    }
    print(greeting + ", " + introduction);

}