package com.isc.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.ansi.AnsiColor;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaymentApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(PaymentApplication.class, args);
		while (true) {
			// Get the runtime instance
			Runtime runtime = Runtime.getRuntime();

			// Calculate used memory
			long usedMemory = runtime.totalMemory() - runtime.freeMemory();

			System.out.println("\u001B[31m"+"Application current memory usage " + usedMemory + " bytes" + "\u001B[0m");

			// One day delay
			long oneDayInMillis = 24 * 60 * 60 * 1000; // 24 hours * 60 minutes * 60 seconds * 1000 milliseconds
			Thread.sleep(oneDayInMillis);

		}
	}
}

