package com.example.helloworld

import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class HelloworldApplication

fun main(args: Array<String>) {

	val helloWorld = GreetingController()
	println(helloWorld.greeting("World").name)

}
