package week2project;

public class Week2Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isHotOutside = true;
		boolean isWeekday = true;
		boolean hasMoneyInPocket = true;
		double costOfMilk = 3.13;
		double moneyInWallet = 24.80;
		int thirstLevel = 7;
		
		boolean shouldBuyIcecream = isHotOutside && hasMoneyInPocket;
		System.out.println("I should buy ice cream: "+shouldBuyIcecream);
		
		boolean willGoSwimming = isHotOutside && !isWeekday;
		System.out.println("I should go swimming today: "+willGoSwimming);
		
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;
		System.out.println("Today is a good day: "+isAGoodDay);
		
		boolean willBuyMilk = isHotOutside && thirstLevel>=3 && moneyInWallet >= (costOfMilk*2);
		System.out.println("I will buy milk: "+willBuyMilk);
			
		
	}

}
