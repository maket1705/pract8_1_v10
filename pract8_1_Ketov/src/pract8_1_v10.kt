import java.util.*

fun main(){
    val call1 = Phone_call("89122448771", "28.02.2025", 120, 555)
    val call2 = Phone_call("89120457748", "01.03.2025", 135, 555)
    val call3 = Phone_call("89126759889", "02.03.2025", 155, 555)
    println("Информация о звонке 1: ")
    call1.Call_Detail()
    println("Информация о звонке 2: ")
    call2.Call_Detail()
    println("Информация о звонке 3: ")
    call3.Call_Detail()

    print("Введите номер телефона: ")
    val numberPhone = readLine()!!.toString()
    print("Введите дату разговора: ")
    val dateCall = readLine()!!.toString()
    print("Введите продолжительность разговора: ")
    val durationCall = readLine()!!.toInt()
    print("Введите продолжительность разговора: ")
    val codeTown = readLine()!!.toInt()
    val callFromInput = Phone_call(numberPhone, dateCall, durationCall, codeTown)

    println("Информация о введенном звонке: ")
    callFromInput.Call_Detail()
}