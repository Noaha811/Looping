//Noah Anderson
fun main() {
    var userInput: Int
    var i = 0

    //initializes an array of strings for each menu option
    val options = arrayOf("Ruffles, Plain", "Ruffles, All Dressed", "Ruffles, Cheddar", "Doritos, Nacho Cheese",
                                "Sun Chips, Harvest Cheddar", "Pretzels", "Takis")

    do{
        println("Available types of salty snacks")

        //prints all options of the menu
        while(i < options.size){
            println("" + (i+1) + ". " + options[i])
            i++
        }
        i = 0
        println("8. Exit")
        println("Please enter your selection: ")

        //Input validation, try/catch statement to make sure input is of type Int
        try {
            userInput = readLine()!!.toInt()

            //makes sure Integer input is between 1 and 8, inclusive
            if(userInput == 8){
                println("Hasta la vista, baby")
            }
            else if(userInput > 7 || userInput < 1){
                println("Invalid input! Please enter an integer between 1 and 8!")
            }
        }//catches any exception when validating user input, defaults userInput to an invalid value of 99
        catch(e: Exception) {
            userInput = 99
            println("Invalid input! Please enter an integer between 1 and 8!")
        }

     //loop to maintain the menu while user input is not valid
    }while(userInput > 8 || userInput < 1)

    //if user's choice was not "exit" then prints out the user's selection
    if(userInput!=8) {
        val selection = options[userInput - 1]
        println("You have chosen $selection")
    }
}