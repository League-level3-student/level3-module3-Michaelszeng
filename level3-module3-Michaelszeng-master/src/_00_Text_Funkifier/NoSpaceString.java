package _00_Text_Funkifier;

public class NoSpaceString extends SpecialString{

	public NoSpaceString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s) {
		// TODO Auto-generated method stub
		String newS = "";
		for (int i=0; i<s.length(); i++) {
			if (!(s.substring(i,  i+1).equals(" "))) {
				newS += s.substring(i, i+1);
			}
		}
		return newS;
	}

}
