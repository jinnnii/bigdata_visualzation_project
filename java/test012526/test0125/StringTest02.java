package test0125;

public class StringTest02 {

	public static void main(String[] args) {
		String str1 = "Java Program 1.8";
		String str2 = " Java ";
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.replace("1.8", "17"));
		System.out.println(str1.substring(5));
		System.out.println(str1.substring(5,11));
		str2 = str2.trim();
		System.out.println(str2);
		
		String[] strArray= str1.split(" ");
		System.out.println("-------------------");
		for(String i:strArray) {
			System.out.println(i);
		}
		System.out.println("-------------------");
		
		String str3= "java";
		String str4=new String("java");
		String str5 = new String("JAVA");
		System.out.println(str3==str4);// false
		
		System.out.println(str3.equals(str4));
		System.out.println(str3.equalsIgnoreCase(str5));
	}

}
