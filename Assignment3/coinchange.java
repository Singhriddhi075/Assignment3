package Assignment3;

public class coinchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       CoinChange(new int[] {2,3,5,6},10,"",0);
       CoinChangeP(new int[] {2,3,5,6},10,"");
	}
	public static void CoinChange(int[] denom,int amount,String ans,int lastDenomIdx) {
		if(amount==0) {
			System.out.println(ans);
			return;
		}
		
		for(int i=lastDenomIdx;i<denom.length;i++) {
			if(amount>=denom[i])
				CoinChange(denom,amount-denom[i],ans + denom[i],i);
		}
	}
	public static void CoinChangeP(int[] denom,int amount,String ans) {
		int count = 0;
		if(amount==0) {
			count++;
			System.out.println(count+"."+ans);
			return;
		}
		if(amount<0) {
			return;
		}
		for(int i=0;i<denom.length;i++) {
			
				CoinChangeP(denom,amount-denom[i],ans+denom[i]);
		}
	}

}
