package set02;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer strBuff = new StringBuffer();
		strBuff.append("Hello to StringBuffer!");
		strBuff.append(System.getProperty("line.separator"));
		strBuff.append("This is yet another class I learnt in Java!");
		strBuff.append(System.getProperty("line.separator"));
		strBuff.append("Learning Java is too much fun!!!");
		System.out.println(strBuff.toString());
	}

}
