class Knowing {
	static final long tooth = 343L;
	static long doIt(long tooth) {
		System.out.println(++tooth + " ");
		return ++tooth;
	}

	public static void main(String[] args) {
		System.out.println(tooth + " ");
		final long tooth = 340L;
		new Knowing().doIt(tooth);
		System.out.println(tooth);
	}
}