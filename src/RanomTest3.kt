import java.sql.SQLOutput

fun main() {
  /*  val string1 = "Num Vegetable     Friends      Foes\n" +
            "1   Watermelon    7,4,3        8,6\n" +
            "2   Tomatoes      9,8,6,5,1    7\n" +
            "3   Sunflowers    7,6,11  \n" +
            "4   Zucchini      9,7,3   \n" +
            "5   Eggplant      9,6,2        7,10\n" +
            "6   Cucumbers     9,7,3        8,1\n" +
            "7   Corn          8,6,4,3,1    5,2\n" +
            "8   Cantaloup     7,4,3        6,1\n" +
            "9   Bell peppers  6,5,11,10,2 \n" +
            "10  Swiss chard   2            5\n" +
            "11  Rhubarb       9,3"
    val newString = string1
        .replace("\\b1\\b".toRegex(), "0")
        .replace("\\b2\\b".toRegex(), "1")
        .replace("\\b3\\b".toRegex(), "2")
        .replace("\\b4\\b".toRegex(), "3")
        .replace("\\b5\\b".toRegex(), "4")
        .replace("\\b6\\b".toRegex(), "5")
        .replace("\\b7\\b".toRegex(), "6")
        .replace("\\b8\\b".toRegex(), "7")
        .replace("\\b9\\b".toRegex(), "8")
        .replace("\\b10\\b".toRegex(), "9")
        .replace("\\b11\\b".toRegex(), "10")

    val newString1 = newString.split("\n")
    newString1.forEach{println(it)}
//    println(string1)*/
    val string =
            listOf(
                "plant == 0 && permutation1[index + 1] == 7 -> score--",
                "plant == 0 && permutation1[index + 1] == 5 -> score--",
                "plant == 1 && permutation1[index + 1] == 6 -> score--",
                "plant == 4 && permutation1[index + 1] == 6 -> score--",
                "plant == 4 && permutation1[index + 1] == 9 -> score--",
                "plant == 5 && permutation1[index + 1] == 0 -> score--",
                "plant == 5 && permutation1[index + 1] == 7 -> score--",
                "plant == 5 && permutation1[index + 1] == 4 -> score--",
                "plant == 5 && permutation1[index + 1] == 1 -> score--",
                "plant == 7 && permutation1[index + 1] == 5 -> score--",
                "plant == 7 && permutation1[index + 1] == 0 -> score--",
                "plant == 9 && permutation1[index + 1] == 4 -> score--",
                "plant == 0 && permutation1[index + 1] == 6 -> score++",
                "plant == 0 && permutation1[index + 1] == 3 -> score++",
                "plant == 0 && permutation1[index + 1] == 2 -> score++",
                "plant == 1 && permutation1[index + 1] == 8 -> score++",
                "plant == 1 && permutation1[index + 1] == 7 -> score++",
                "plant == 1 && permutation1[index + 1] == 5 -> score++",
                "plant == 1 && permutation1[index + 1] == 4 -> score++",
                "plant == 1 && permutation1[index + 1] == 0 -> score++",
                "plant == 2 && permutation1[index + 1] == 6 -> score++",
                "plant == 2 && permutation1[index + 1] == 5 -> score++",
                "plant == 2 && permutation1[index + 1] == 10 -> score++",
                "plant == 3 && permutation1[index + 1] == 8 -> score++",
                "plant == 3 && permutation1[index + 1] == 6 -> score++",
                "plant == 3 && permutation1[index + 1] == 2 -> score++",
                "plant == 4 && permutation1[index + 1] == 8 -> score++",
                "plant == 4 && permutation1[index + 1] == 5 -> score++",
                "plant == 4 && permutation1[index + 1] == 1 -> score++",
                "plant == 5 && permutation1[index + 1] == 8 -> score++",
                "plant == 5 && permutation1[index + 1] == 6 -> score++",
                "plant == 5 && permutation1[index + 1] == 2 -> score++",
                "plant == 6 && permutation1[index + 1] == 7 -> score++",
                "plant == 6 && permutation1[index + 1] == 5 -> score++",
                "plant == 6 && permutation1[index + 1] == 3 -> score++",
                "plant == 6 && permutation1[index + 1] == 2 -> score++",
                "plant == 6 && permutation1[index + 1] == 0 -> score++",
                "plant == 7 && permutation1[index + 1] == 6 -> score++",
                "plant == 7 && permutation1[index + 1] == 3 -> score++",
                "plant == 7 && permutation1[index + 1] == 2 -> score++",
                "plant == 8 && permutation1[index + 1] == 5 -> score++",
                "plant == 8 && permutation1[index + 1] == 4 -> score++",
                "plant == 8 && permutation1[index + 1] == 10 -> score++",
                "plant == 8 && permutation1[index + 1] == 9 -> score++",
                "plant == 8 && permutation1[index + 1] == 1 -> score++",
                "plant == 9 && permutation1[index + 1] == 1 -> score++",
                "plant == 10 && permutation1[index + 1] == 8 -> score++",
                "plant == 10 && permutation1[index + 1] == 2 -> score++",
                "permutation1[index + 1] == 0 && plant == 7 -> score--",
                "permutation1[index + 1] == 0 && plant == 5 -> score--",
                "permutation1[index + 1] == 1 && plant == 6 -> score--",
                "permutation1[index + 1] == 4 && plant == 6 -> score--",
                "permutation1[index + 1] == 4 && plant == 9 -> score--",
                "permutation1[index + 1] == 5 && plant == 0 -> score--",
                "permutation1[index + 1] == 5 && plant == 7 -> score--",
                "permutation1[index + 1] == 5 && plant == 4 -> score--",
                "permutation1[index + 1] == 5 && plant == 1 -> score--",
                "permutation1[index + 1] == 7 && plant == 5 -> score--",
                "permutation1[index + 1] == 7 && plant == 0 -> score--",
                "permutation1[index + 1] == 9 && plant == 4 -> score--",
                "permutation1[index + 1] == 0 && plant == 6 -> score++",
                "permutation1[index + 1] == 0 && plant == 3 -> score++",
                "permutation1[index + 1] == 0 && plant == 2 -> score++",
                "permutation1[index + 1] == 1 && plant == 8 -> score++",
                "permutation1[index + 1] == 1 && plant == 7 -> score++",
                "permutation1[index + 1] == 1 && plant == 5 -> score++",
                "permutation1[index + 1] == 1 && plant == 4 -> score++",
                "permutation1[index + 1] == 1 && plant == 0 -> score++",
                "permutation1[index + 1] == 2 && plant == 6 -> score++",
                "permutation1[index + 1] == 2 && plant == 5 -> score++",
                "permutation1[index + 1] == 2 && plant == 10 -> score++",
                "permutation1[index + 1] == 3 && plant == 8 -> score++",
                "permutation1[index + 1] == 3 && plant == 6 -> score++",
                "permutation1[index + 1] == 3 && plant == 2 -> score++",
                "permutation1[index + 1] == 4 && plant == 8 -> score++",
                "permutation1[index + 1] == 4 && plant == 5 -> score++",
                "permutation1[index + 1] == 4 && plant == 1 -> score++",
                "permutation1[index + 1] == 5 && plant == 8 -> score++",
                "permutation1[index + 1] == 5 && plant == 6 -> score++",
                "permutation1[index + 1] == 5 && plant == 2 -> score++",
                "permutation1[index + 1] == 6 && plant == 7 -> score++",
                "permutation1[index + 1] == 6 && plant == 5 -> score++",
                "permutation1[index + 1] == 6 && plant == 3 -> score++",
                "permutation1[index + 1] == 6 && plant == 2 -> score++",
                "permutation1[index + 1] == 6 && plant == 0 -> score++",
                "permutation1[index + 1] == 7 && plant == 6 -> score++",
                "permutation1[index + 1] == 7 && plant == 3 -> score++",
                "permutation1[index + 1] == 7 && plant == 2 -> score++",
                "permutation1[index + 1] == 8 && plant == 5 -> score++",
                "permutation1[index + 1] == 8 && plant == 4 -> score++",
                "permutation1[index + 1] == 8 && plant == 10 -> score++",
                "permutation1[index + 1] == 8 && plant == 9 -> score++",
                "permutation1[index + 1] == 8 && plant == 1 -> score++",
                "permutation1[index + 1] == 9 && plant == 1 -> score++",
                "permutation1[index + 1] == 10 && plant == 8 -> score++",
                "permutation1[index + 1] == 10 && plant == 2 -> score++"
            )
        val individualLines = string
        /*for (line1 in individualLines) {
            for (line2 in individualLines) {
                val firstNumberOnLine1 = line1.fin
                if (
                    line1 != line2 &&
                    line1[line1.indexOf("==") + 3] == line2[line2.indexOf("==") + 3] &&
                    line1[line1.lastIndexOf("==") + 3] == line2[line2.lastIndexOf("==") + 3]
                ) println("line1:$line1\nline2:$line2")
            }
        }*/

        val individualLinesSortedByFirstNumber = mutableListOf<String>()

        var temp = individualLines.toMutableList()
        temp = temp.sortedBy { firstNumber(it) } as MutableList<String>
//    findDuplicates(temp)?.asIterable()?.let { temp.removeAll(it) }
        val total = mutableListOf<List<String>>()
        for(line in temp) {
            total+=line.split("&&").sorted()
        }
        for(i in findDuplicates(total)!!) println(i)
    }
fun firstNumber(line: String): Int? {
    return if(line[1]=='l') "\\d\\d?(?= &&)".toRegex().find(line)?.value?.toInt() else {"\\d\\d?(?= ->)".toRegex().find(
        line
    )?.value?.toInt()}
}
private fun <T> findDuplicates(collection: Collection<T>): Set<T>? {
    val duplicates: MutableSet<T> = LinkedHashSet()
    val uniques: MutableSet<T> = HashSet()
    for (t in collection) {
        if (!uniques.add(t)) {
            duplicates.add(t)
        }
    }
    return duplicates
}