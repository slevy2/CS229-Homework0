package p0;

public class Test {
	
	
	public static void main(String[] args) {
		
		reverseOrderTest();
		System.out.println();
		findClumpsTest();
		System.out.println();
		removeMyStringTest();
		System.out.println();
		countCharTest();
		System.out.println();
		
		nationTest();
		
	}
	
	public static void reverseOrderTest() {
		int size = 15; //I changed this value to create test cases of different sizes
				
		MyIntArray counting = new MyIntArray(size);
		for (int i = 0; i < counting.size; i++) {
			counting.set(i, i+1);
			System.out.print(i+1 + " ");
		}
		System.out.println();
		counting = Practice.reverseOrder(counting);
		for (int i = 0; i < counting.size; i++) {
			System.out.print(counting.get(i) + " ");
		}
		System.out.println();
		
	}
	
	public static void findClumpsTest() {
		MyIntArray clumpTest = new MyIntArray(5);
		clumpTest.set(0, 1);
		clumpTest.set(1, 2);
		clumpTest.set(2, 3);
		clumpTest.set(3, 3);
		clumpTest.set(4, 1);
		System.out.println(Practice.findClumps(clumpTest) + " clumps");
		
		MyIntArray clumpTest2 = new MyIntArray(5);
		clumpTest2.set(0, 1);
		clumpTest2.set(1, 1);
		clumpTest2.set(2, 1);
		clumpTest2.set(3, 1);
		clumpTest2.set(4, 1);
		System.out.println(Practice.findClumps(clumpTest2) + " clumps");
		
		MyIntArray clumpTest3 = new MyIntArray(5);
		clumpTest3.set(0, 1);
		clumpTest3.set(1, 1);
		clumpTest3.set(2, 2);
		clumpTest3.set(3, 1);
		clumpTest3.set(4, 1);
		System.out.println(Practice.findClumps(clumpTest3) + " clumps");
		
		MyIntArray clumpTest4 = new MyIntArray(7);
		clumpTest4.set(0, 1);
		clumpTest4.set(1, 2);
		clumpTest4.set(2, 2);
		clumpTest4.set(3, 3);
		clumpTest4.set(4, 5);
		clumpTest4.set(5, 5);
		clumpTest4.set(6, 1);
		System.out.println(Practice.findClumps(clumpTest4) + " clumps");

	}
	
	public static void removeMyStringTest() {
		MyString helloWorld = new MyString("Hello World");
		MyString ll = new MyString("ll");
		String modified = Practice.removeMyString(helloWorld, ll).getContents();
		System.out.println(modified);
		
		MyString o = new MyString("o");
		String modified2 = Practice.removeMyString(helloWorld, o).getContents();
		System.out.println(modified2);
		
		MyString aaa = new MyString("aaa");
		String modified3 = Practice.removeMyString(helloWorld, aaa).getContents();
		System.out.println(modified3);
		
		MyString space = new MyString(" ");
		String modified4 = Practice.removeMyString(helloWorld, space).getContents();
		System.out.println(modified4);
	}
	
	public static void countCharTest() {
		MyString ab = new MyString("ABABABabababa");
		System.out.println(Practice.countChar(ab, 'a'));
		
		MyString zy = new MyString("zzyyaa");
		System.out.println(Practice.countChar(zy, '2'));
	}
	
	public static void nationTest() {
		Nation aztec = new Nation("Aztec", 2045);
		System.out.println(aztec.toString());
		System.out.println();
		
		Nation mongolian = new Nation("Mongolian", 600);
		aztec.setAlly(mongolian);
		System.out.println(aztec.toString());
		System.out.println(mongolian.toString());
		System.out.println();
		
		Nation sumerian = new Nation("Sumerian", 8);
		aztec.setEnemy(sumerian);
		System.out.println(sumerian.toString());
		System.out.println(aztec.toString());
		System.out.println();
		
		aztec.backstab();
		System.out.println(aztec.toString());
		System.out.println(mongolian.toString());
		System.out.println(sumerian.toString());
		System.out.println();
		
		Nation mars = new Nation("Mars", 7654);
		System.out.println(aztec.getRelationship(mongolian));
		System.out.println(aztec.getRelationship(sumerian));
		System.out.println(aztec.getRelationship(mars));
		System.out.println();
		
		FireNation austrailia = new FireNation("Austrailia", 9999, "Kangaroo", 8888);
		System.out.println(austrailia.toString());
		austrailia.setEnemy(mars);
		System.out.println(austrailia.toString());
		austrailia.setAlly(sumerian);
		System.out.println(austrailia.toString());
		System.out.println(sumerian.toString());
		System.out.println();
		
		austrailia.backstab();
		System.out.println(austrailia.getRelationship(sumerian));
		System.out.println(austrailia.getRelationship(mars));
		System.out.println(austrailia.getRelationship(mongolian));
		System.out.println(austrailia.getRelationship(aztec));
	}

}
