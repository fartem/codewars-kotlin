package com.smlnskgmail.jaman.codewarskotlin.kyu6

// https://www.codewars.com/kata/5b0a80ce84a30f4762000069
class FIXMEHello {

    enum class OrderItem {

        Name,
        Age,
        Sex

    }

    private var name: String = ""
    private var age: Int = 0
    private var sex: Char = ' '

    private val order = mutableListOf<OrderItem>()

    fun setAge(age: Int): FIXMEHello {
        this.age = age
        addToOrder(OrderItem.Age)
        return this
    }

    fun setSex(sex: Char): FIXMEHello {
        this.sex = sex
        addToOrder(OrderItem.Sex)
        return this
    }

    fun setName(name: String): FIXMEHello {
        this.name = name
        addToOrder(OrderItem.Name)
        return this
    }

    private fun addToOrder(orderItem: OrderItem) {
        if (!order.contains(orderItem)) {
            order.add(orderItem)
        }
    }

    fun hello(): String {
        val output = StringBuilder("Hello. ")
        order.forEach {
            when (it) {
                OrderItem.Age -> output.append("I am ${age}. ")
                OrderItem.Sex -> output.append("I am ${if (sex == 'M') "male" else "female"}. ")
                OrderItem.Name -> output.append("My name is $name. ")
            }
        }
        return output.toString().trim()
    }

}
