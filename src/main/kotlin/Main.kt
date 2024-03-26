fun main() {
    printNationality("Tanzania")
    printNationality("Uganda")
    printNationality("congo")
    printNationality("Southsudan")
    printNationality("Malawi")
    val languages = arrayOf("Kiswahili", "Luganda", "Kinyarwanda", "Somali")
    //loop
    for (lang in languages) {
        println(lang)
        //range
    }
    for (num in 1..100) {
        println(num * num)

    }
    for (num in 1..50) {
        println(num)
    }
    //if th number is greater than 0 its decreased by one thus the output
    var num = 12
    while (num > 0) {
        println(num)
        num--
    }
    for (num in 1..100) {
        val square = num * num
        if (square >= 1000) {
            println(square)
        }
    }
    for (num in 1..100) {
        val square = num * num
        if (square >= 1000) {
            println(square)
        } else {
            break
        }
    }
}







        fun printNationality(country: String) {
            if (country == "Tanzania") {
                println("Tanzanian")
            } else if (country == "Uganda")
                println("Ugandan")
            else if (country == "Southsudan") {
                println("Southsudanese")
            } else if (country == "Malawi") {
                println("Malawian")
            } else {
                println("Foreigner")

            }
        }

        //fun assignSchool(marks:Int) {
//    if (marks > 390) {
//        if (marks > 430) {
//            println("Scholarship")
//        } else {
//            println("No scholarship")
//
//        }
//        else if (marks 389>350) {
//            println("provinsial")
//        }
//        else{
//
//        }
//
//
//   }
//}
        fun printNationalityWhen(country: String) {
            when (country) {
                "Tanzania" -> println("Tanzanian")
                "Uganda" -> println("Ugandan")
                "South Sudan" -> println("South Sudanese")
                "Kenya" -> println("Kenyan")
                "Malawi" -> println("Malawian")
                else -> println("Foreigner")
            }
        }

        fun selectContainer(litres: Int) {
            when (litres) {
                1, 2, 3 -> println("bottle")
                4, 5, 6, 7 -> println("bucket")
                8, 9 -> println("big bucket")
                else -> println("jerrycan")
            }
        }

        fun calculate(x: Int, y: Int, Sign: String): Int {
            var result = 0
            when (Sign) {
                "+" -> {
                    result = x + y
                }

                "-" -> {
                    result = x - y
                }

                "/" -> {
                    result = x / y
                }

                "%" -> {
                    result = x % y
                }

                "*" -> {
                    result = x * y
                }


            }
            return result
        }

        fun printRangeSquares(start: Int, end: Int) {
            for (num in start..end) {

            }

        }

