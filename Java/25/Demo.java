class demo {
	public static void main(String[] args) {
		//splitDemo("erkkqesaadqreddfghhhhhhhhhhhhhhhhhhhreaaaaaaaaaaaaaaaas","(.)\\1+");
		String str = "aaaasssdqweraxxzzccvv";
		replaceAllDemo(str,"(.)\\1+","@");
	}

	public static void splitDemo(String str,String reg) {
		String[] arr = str.split(reg);
		for (String s : arr) {
			System.out.println(s);
		}
	}

	public static void replaceAllDemo(String str,String reg,String newStr) {
		str = str.replaceAll(reg,newStr);

		System.out.println(str);
	}
}