package org.apache.rocketmq.common;

import org.apache.rocketmq.common.constant.LoggerName;
import org.apache.rocketmq.logging.InternalLogger;
import org.apache.rocketmq.logging.InternalLoggerFactory;

public class MyUtil {
	private static final InternalLogger log = InternalLoggerFactory.getLogger(LoggerName.TOOLS_LOGGER_NAME);

	public static void sleep(long interval) {
		try {
			System.out.println("Begain to sleep for: "+interval/1000+" seconds");
			Thread.sleep(interval);
			System.out.println("Sleep end for: "+interval/1000+" seconds");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void print(String log) {
		System.out.println(log);
		MyUtil.log.info(log);
	}

	public static void print(String log, InternalLogger logger) {
		System.out.println(log);
		logger.info(log);
	}
}
