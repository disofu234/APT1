
public class SandwichBar {
	public int whichOrder(String[] available, String[] orders) {
		for (int i = 0; i < orders.length; i++) {
			if (canBeMade(available, orders[i])) {
				return i;
			}
		}
		
		return -1;
	}
	
	public boolean canBeMade(String[] available, String sandwich) {
		String[] sandwichIngredients = sandwich.split(" ");
		
		for (String sandwichIngredient : sandwichIngredients) {
			boolean found = false;
			
			for (String availableIngredient : available) {
				if (sandwichIngredient.equals(availableIngredient)) {
					found = true;
					break;
				}
			}
			
			if (!found) {
				return false;
			}
		}
		
		return true;
	}
}
