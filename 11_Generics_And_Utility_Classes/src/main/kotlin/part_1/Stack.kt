package org.example.part_1

class Stack<T> {
    private val stack = mutableListOf<T>()

    fun push(item: T) {
        stack.add(item)
    }

    fun pop(): T? {
        return if (isEmpty()) null
        else {
            val lastIndex = stack.lastIndex
            stack[lastIndex]
            stack.removeAt(lastIndex)
        }
    }

    fun isEmpty() = (stack.isEmpty())
}