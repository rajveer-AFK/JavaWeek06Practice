import javax.swing.JOptionPane;

public class DemoPoems {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Click OK to create a poem");
		int poemType = getValidPoemType();
		
		Poem userPoem = null;
		
		switch(poemType) {
			case 1:
				userPoem = createPlainPoem();
				break;
				
			case 2:
				userPoem = createCouplet();
				break;
			
			case 3:
				userPoem = createLimerick();
				break;
			
			case 4:
				userPoem = createHaiku();
		}
		
		JOptionPane.showMessageDialog(null, "Title: " + userPoem.getName() + "\nNumber of Lines: " + userPoem.getNumberOfLines(),
									  "Poem Details", 1);
	}
	
	public static int getValidPoemType() {
		
		String poemTypeOptionMenu =  "[1] Create plain poem\n" +
				  				 	 "[2] Create couplet poem\n" +
				  				 	 "[3] Create limerick poem\n" +
				  				 	 "[4] Create haiku poem";
		
		int poemType = Integer.parseInt(JOptionPane.showInputDialog(null, poemTypeOptionMenu, "Poem Type", 1));
																		  
		while(poemType < 1 || poemType > 4) {
			JOptionPane.showMessageDialog(null, "ERROR: invalid option", "Error", 0);
			poemType = Integer.parseInt(JOptionPane.showInputDialog(null, poemTypeOptionMenu, "Poem Type", 1));
		}
		
		return poemType;
	}
	
	public static String getPoemTitle() {
		return JOptionPane.showInputDialog(null, "Enter the name of the poem");
	}
	
	public static Poem createPlainPoem() {
		String poemTitle = getPoemTitle();
		int numberOfLines = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of lines in the poem"));
		
		return new Poem(poemTitle, numberOfLines);
	}
	
	public static Couplet createCouplet() {
		String poemTitle = getPoemTitle();
		return new Couplet(poemTitle);
	}
	
	public static Limerick createLimerick() {
		String poemTitle = getPoemTitle();
		return new Limerick(poemTitle);
	}
	
	public static Haiku createHaiku() {
		String poemTitle = getPoemTitle();
		return new Haiku(poemTitle);
	}
	
}
