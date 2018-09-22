public class GeradeZahlenRechner {
	public static void main(String[] args) {

		
		int x = (int) (Math.random()*100);
		
		System.out.println("Die Zahl ist" + " " +x);
		

	
			for (int i = 0; i < x; i++) {

				if (i % 2 == 0){
						System.out.println(i);
				}
			
			}
			
	}
	
}