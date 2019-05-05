package com.example.demo;
import io.javalin.Javalin;

public class DemoApplication {
	public static void main(String[] args) {
		Javalin app = Javalin.create().start(7000);
		app.get("/", ctx -> ctx.result("Hello World"));
	}
}
