package chapter7;

public class string_demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1="farzaneh aghamahmoudian";
		String word2="dr mohsen akhavan tabib";
		String word3=word1;
		System.out.println("length of word 1 = "+word1.length());
		System.out.println("length of word 2 = "+word2.length());
		System.out.println("char at index 3 in word1= "+word1.charAt(2));
		
		if(word1==word2)
			System.out.println("word 1 = word 2 ");
		else
			System.out.println("word 1 != word 2 ");
		
		if(word1==word3)
			System.out.println("word 1 = word 3 ");
		else
			System.out.println("word 1! = word 3 ");
	}

}
