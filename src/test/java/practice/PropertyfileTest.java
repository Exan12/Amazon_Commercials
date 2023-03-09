package practice;

import GenericLibraries.PropertyFileLibrary;

public class PropertyfileTest {

	public static void main(String[] args) throws Throwable {
		
		PropertyFileLibrary pLib = new PropertyFileLibrary();
		
		String URL = pLib.getpropertyfile("url");
		System.out.println(URL);
		
		String BROWSER = pLib.getpropertyfile("browser");
		System.out.println(BROWSER);
		
		String EMAIL = pLib.getpropertyfile("email");
		System.out.println(EMAIL);
		
		String PASSWORD = pLib.getpropertyfile("password");
		System.out.println(PASSWORD);
		
		String PRODUCT = pLib.getpropertyfile("product");
		System.out.println(PRODUCT);
	}

}
