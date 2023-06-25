



fun main(){

    val size=Size("10","20")
    size.printinfo()

}



class Size<T,E>(val widht:T,val height:E){
    fun printinfo(){
        if (widht is Int){
            println("Int")
        }else{
            println("String")
        }
    }
}