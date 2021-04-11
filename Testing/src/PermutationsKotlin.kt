class PermutationsKotlin(numElements: Int) : MutableIterator<MutableList<Int>> {
    /**
     * direction[i] = -1 if the element i has to move to the left, +1 to the
     * right, 0 if it does not need to move
     */
    var direction: MutableList<Int>

    /**
     * inversePermutation[i] is the position of element i in permutation; It's
     * called inverse permutation because if p2 is the inverse permutation of
     * p1, then p1 is the inverse permutation of p2
     */
    var inversePermutation: MutableList<Int>

    /**
     * current permutation
     */
    var permutation: MutableList<Int>?

    override fun remove() {
        TODO("Not yet implemented")
    }
    fun buildNextPermutation() {
        // find the largest element with a nonzero direction, and swaps it in
        // the indicated direction
        var index = -1
        for (i in direction.indices) {
            println("Direction size: ${direction.size} vs. permutation size: ${permutation?.size}")
            if (direction[permutation!![i]] != 0
                && (index < 0 || permutation!![index] < permutation!![i])
            ) {
                index = i
            }
        }
        if (index < 0) {
            // there are no more permutations
            permutation = null
        } else {
            // element we're moving
            val chosenElement = permutation!![index]
            // direction we're moving
            val dir = direction[chosenElement]
            // index2 is the new position of chosenElement
            val index2 = index + dir

            // we'll swap positions elements permutation[index] and
            // permutation[index2] in permutation, to keep inversePermutation we
            // have to swap inversePermutation's elements at index
            // permutation[index] and permutation[index2]
            swap(inversePermutation, permutation!![index], permutation!![index2])
            swap(permutation, index, index2)

            // update directions
            if (index2 == 0 || index2 == permutation!!.size - 1 || permutation!![index2 + dir] > permutation!![index2]) {
                // direction of chosen element
                direction[chosenElement] = 0
            }

            // all elements greater that chosenElement set its direction to +1
            // if they're before index-1 or -1 if they're after
            for (i in chosenElement + 1 until direction.size) {
                if (inversePermutation[i] > index2) {
                    direction[i] = -1
                } else {
                    direction[i] = 1
                }
            }
        }
    }

    override fun hasNext(): Boolean {
        return permutation != null
    }

    override fun next(): MutableList<Int> {
        val result = permutation?.toMutableList()
        buildNextPermutation()
        return result ?: mutableListOf()
    }

    companion object {
        /**
         * Swaps the elements in array at positions i1 and i2
         *
         * @param array
         * @param i1
         * @param i2
         */
        fun swap(array: MutableList<Int>?, i1: Int, i2: Int) {
            val temp = array!![i1]
            array[i1] = array[i2]
            array[i2] = temp
        }
    }

    /**
     * @param numElements
     * >= 1
     */
    init {
        // initial permutation
        permutation = MutableList(numElements){ it }
        println("permutation: $permutation")
        // the support elements
        inversePermutation = MutableList(numElements){ permutation!![it] }//permutation!!.toMutableList()
        direction = mutableListOf(numElements)
        direction.fill(-1)
        direction[0] = 0
    }
}