package com.up2test.amazon.e2eTestAutomation.utils;

public class DriverManagerFactory {

		public static DriverManager getManager(DriverType type) {

			DriverManager driverManager;

			switch (type) {
			case CHROME:
				driverManager = new ChromeDriverManager();
				break;
			case FIREFOX:
				driverManager = new FirefoxDriverManager();
				break;
			case IE:
				driverManager = new IEDriverManager();
				break;
			default:
				driverManager = new EdgeDriverManager();
				break;
			}
			return driverManager;

		}
	}


