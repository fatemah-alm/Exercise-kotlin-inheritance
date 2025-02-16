package library

class NonFictionBook (title:String, author:String, ISBN:Int, var subject:String):Book(title,author,ISBN){
    override fun displayInfo(){
        println("${displayInfo()} - This book talks about the great subject of $subject")
    }
}