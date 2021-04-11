import java.io.File
import kotlin.system.measureNanoTime

/*
Num Vegetable     Friends      Foes
0   Watermelon    6,3,2        7,5
1   Tomatoes      8,7,5,4,0    6
2   Sunflowers    6,5,10
3   Zucchini      8,6,2
4   Eggplant      8,5,1        6,9
5   Cucumbers     8,6,2        7,0
6   Corn          7,5,3,2,0    4,1
7   Cantaloup     6,3,2        5,0
8   Bell peppers  5,4,10,9,1
9   Swiss chard   1            4
10  Rhubarb       8,2

Process finished with exit code 0

*/

fun main() {
    val x = measureNanoTime {
        val n = 11
        val mapOfPermutationToScore: MutableMap<List<Int>, Int> = mutableMapOf()
        val Watermelon = 0
        val Tomatoes = 1
        val Sunflowers = 2
        val Zucchini = 3
        val Eggplant = 4
        val Cucumbers = 5
        val Corn = 6
        val Cantaloup = 7
        val BellPeppers = 8
        val SwissChard = 9
        val Rhubarb = 10
        val listOfPlants = listOf(
            Watermelon,
            Tomatoes,
            Sunflowers,
            Zucchini,
            Eggplant,
            Cucumbers,
            Corn,
            Cantaloup,
            BellPeppers,
            SwissChard,
            Rhubarb
        )
        val listOfFriends = listOf(
            listOf(6, 3, 2),
            listOf(8, 7, 5, 4, 0),
            listOf(6, 5, 10),
            listOf(8, 6, 2),
            listOf(8, 5, 1),
            listOf(8, 6, 2),
            listOf(7, 5, 3, 2, 0),
            listOf(6, 3, 2),
            listOf(5, 4, 10, 9, 1),
            listOf(1),
            listOf(8, 2)
        )
        val listOfFoes = listOf(
            listOf(7, 5),
            listOf(6),
            listOf(),
            listOf(),
            listOf(6, 9),
            listOf(7, 0),
            listOf(4, 1),
            listOf(5, 0),
            listOf(),
            listOf(4),
            listOf()
        )
        val resultsFile = File("results.txt")
        resultsFile.createNewFile()
        val writer = resultsFile.bufferedWriter(bufferSize = 8 * 1024 * 100000)
        fun calcPoints(a: Int, b: Int): Int {
            return when {
                b in listOfFoes[a] || a in listOfFoes[b] -> -1
                b in listOfFriends[a] || a in listOfFriends[b] -> 1
                else -> 0
            }
        }

        val permutator = Permutations(n)
        val numberOfIterations = factorial(n)
        val twentyPercent = kotlin.math.round(numberOfIterations * 0.2).toInt()
        val fourtyPercent = kotlin.math.round(numberOfIterations * 0.4).toInt()
        val sixtyPercent = kotlin.math.round(numberOfIterations * 0.6).toInt()
        val eightyPercent = kotlin.math.round(numberOfIterations * 0.8).toInt()
        val ninetyPercent = kotlin.math.round(numberOfIterations * 0.9).toInt()
        for (i in 0 until numberOfIterations) {
            when (i) {
                twentyPercent -> println("Done: 20%")
                fourtyPercent -> println("Done: 40%")
                sixtyPercent -> println("Done: 60%")
                eightyPercent -> println("Done: 80%")
                ninetyPercent -> println("Done: 90%")
            }
            val permutation = permutator.permutation.toList()
//        permutations.add(permutation)
            var counter = 0
            var score = 0
            while (counter < permutation.size - 1) {
                score += calcPoints(permutation[counter], permutation[counter + 1])
                counter++
            }

//        mapOfPermutationToScore[permutation] = score
//        if(score>10) println("Permutation: $permutation...Score: $score\n")
            permutator.buildNextPermutation()
        }
//    for(permutation in permutations) println(permutation)
//    println(mapOfPermutationToScore.toList().sortedBy { (_, value) -> value }.toMap())
    }
    println(x)
}

public fun factorial(num: Int) = (2..num).fold(1, Int::times)