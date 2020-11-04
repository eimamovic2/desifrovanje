package ba.unsa.etf.rpr;

public class Main {

    public static void main(String[] args) {
	String s="AGREJGXLGRYJKJKMAREHLCQYHEQYHKACLEQYOEUYJYMEBVYMK";
	int a=0;
	for(int i=0;i<s.length();i++){
	    a=((5*s.charAt(i)+23)%26)+65;
                char c=(char)a;
        System.out.print(c);
    }
    }
}
