package org.apache.rocketmq.remoting.common;

import org.apache.rocketmq.logging.InternalLogger;

public class MyUtil {

	public static void sleep(long interval) {
		try {
			System.out.println("Begain to sleep for: "+interval/1000+" seconds");
			Thread.sleep(interval);
			System.out.println("Sleep end for: "+interval/1000+" seconds");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void print(String log, InternalLogger logger) {
		System.out.println(log);
		logger.info(log);
	}
}
