package set05;

public class WrapperClassesPractice {
	public static void main(String[] args) {
		boolean b = false;
		Boolean bref = new Boolean(b);
		System.out.println(bref.booleanValue());
		System.out.println(bref.toString());
		System.out.println(Boolean.parseBoolean("true"));
		System.out.println("---------------------------");
		char c = 'c';
		Character cref = new Character(c);
		System.out.println(cref.charValue());
		System.out.println(cref.compareTo('C'));
		System.out.println(cref.getClass().getSimpleName());
		System.out.println(Character.compare('c', 'C'));
		System.out.println("---------------------------");
		byte by = 125;
		Byte byref = new Byte(by);
		System.out.println(byref.doubleValue());
		System.out.println(Byte.valueOf("127"));
		System.out.println("---------------------------");
		short s = 89;
		Short sref = new Short(s);
		System.out.println(sref.doubleValue());
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println("---------------------------");
		int i = 78965;
		Integer iref = new Integer(i);
		System.out.println(iref.hashCode());
		System.out.println(iref.byteValue());
		System.out.println(iref % 127);
		System.out.println(Integer.BYTES);
		System.out.println("---------------------------");
		long l = 567276382;
		Long lref = new Long(l);
		System.out.println(lref.shortValue());
		System.out.println(lref.longValue());
		System.out.println(lref.compareTo(562947538L));
		System.out.println(lref.compareTo(Long.MAX_VALUE));
		System.out.println(Long.highestOneBit(4297656));
		System.out.println(Long.lowestOneBit(4297656));
		System.out.println("---------------------------");
		float f = 5.6f;
		Float fref = new Float(f);
		System.out.println(fref.longValue());
		System.out.println(fref.doubleValue());
		System.out.println(Float.MAX_EXPONENT);
		System.out.println(Float.NEGATIVE_INFINITY);
		System.out.println("---------------------------");
		double d = 325497.43629656;
		Double dref = new Double(d);
		System.out.println(dref.doubleValue());
		System.out.println(dref.isInfinite());
		System.out.println(Double.isNaN(56328666.39277));
		System.out.println(Double.MIN_EXPONENT);
		System.out.println(Double.MAX_EXPONENT);
	}
}
