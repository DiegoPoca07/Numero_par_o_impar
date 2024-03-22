package diego.rodriguez.numerparoimpar

class Calcular {
    fun comprobar(num: Int): String{
        var msg: String

        if(num % 2 == 0){
            msg = "Es par"
        }else{
            msg = "es impar"
        }
        return msg


    }
}