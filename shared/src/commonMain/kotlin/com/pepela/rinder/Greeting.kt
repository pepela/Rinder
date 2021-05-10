package com.pepela.rinder

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}