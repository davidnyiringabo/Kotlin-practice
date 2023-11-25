package Lists

class Lists {
    var shopingList  = listOf("Lambogini", "Tesla","V8","Mercedes","RAVA","Fiat","")
    constructor()
    constructor(elements: List<String>){
        this.shopingList = elements;
    }

    fun printElement(){
        println(this.shopingList[0]);
    }
}

fun main(){
    var list = Lists();
    list.printElement()
}