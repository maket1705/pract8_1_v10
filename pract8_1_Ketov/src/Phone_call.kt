//Создаем класс Телефонный разговор
class Phone_call{
    var number: String = "" //номер телефона
    var date: String = "" //дата разговора
    var durable: Int = 0 //продолжительность
    var code_town: Int = 0 //код города
    constructor(number: String, date: String, durable: Int, code_town: Int):
        this(number, date, durable, code_town)

    fun Call_Detail(){
        println("Номер телефона: $number")
        println("Дата разговора: $date")
        println("Продолжительность: $durable секунд")
        println("Код города: $code_town")
    }
}


