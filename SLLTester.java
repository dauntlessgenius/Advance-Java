
public class SLLTester {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		
		SLL<Integer> luckyNumbers = new SLL<>();
		luckyNumbers.add(new Node<>(9));
		luckyNumbers.add(new Node<>(21));
		luckyNumbers.add(new Node<>(87));
		luckyNumbers.add(new Node<>(0));
				
		System.out.println(luckyNumbers);
		System.out.println(luckyNumbers.printHead());
		
		
		luckyNumbers.delete();
		System.out.println(luckyNumbers);
		
		luckyNumbers.insertToLeft(new Node<>(56));
		System.out.println(luckyNumbers);
		
		System.out.println("Found:" + luckyNumbers.search(new Integer(807)));
		luckyNumbers.removeF();
		luckyNumbers.removeFromLeft();
		System.out.println(luckyNumbers);
	}

}
