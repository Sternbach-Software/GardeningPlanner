import FindAllPermutations.Companion.addAllIterative

fun main() {
    val allPermutations = mutableListOf<List<Int>>()
    allPermutations.addAllIterative(1, mutableListOf(1, 2, 3))
    println(allPermutations)
}
class FindAllPermutations {
    fun main() {
        val allPermutations = mutableListOf<List<Int>>()
        addAllRecursive(3, mutableListOf(1, 2, 3), allPermutations)
        println(allPermutations)
//        println(allPermutations)
//        println(permute(mutable))
        //should give:
        // [
        //  [1,2,3],
        //  [1,3,2],
        //  [2,1,3],
        //  [2,3,1],
        //  [3,1,2],
        //  [3,2,1]
        // ]
    }

    companion object {
        fun <T> addAllRecursive(n: Int, elements: MutableList<T>, finalListOfAllPermutations: MutableList<List<Int>>) {
            if (n == 1) {
                finalListOfAllPermutations.add(elements as List<Int>)
            } else {
                for (i in 0 until n - 1) {
                    addAllRecursive(n - 1, elements, finalListOfAllPermutations)
                    if (n % 2 == 0) {
                        elements.swap(i, n - 1)
                    } else {
                        elements.swap(0, n - 1)
                    }
                }
                addAllRecursive(n - 1, elements, finalListOfAllPermutations)
            }
        }

        fun <T> MutableList<T>.swap(a: Int, b: Int) {
            val tmp = this[a]
            this[a] = this[b]
            this[b] = tmp
        }
        fun <T> MutableList<List<Int>>.addAllIterative(
            n: Int,
            elements: MutableList<T>
        ) {
            val indexes = IntArray(n)
            indexes.fill(0)
//            for(i in 0 until n) =0
            println()
            println()
            println(indexes)
            this.add(elements as List<Int>)
            var i = 0
            while (i < n) {
                if (indexes[i] < i) {
                    elements.swap(if (i % 2 == 0) 0 else indexes[i], i)
                    this.add(elements as List<Int>)
                    indexes[i]++
                    i = 0
                } else {
                    indexes[i] = 0
                    i++
                }
            }
        }
    }
}


