package Framing;

public class BitCharacterStuffing {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("11101111100010010111110");
		int i=0,cnt=0;
		StringBuilder s = new StringBuilder("");
		
		//Bit Stuffing
		while(i<sb.length()){
			
			if(sb.charAt(i)=='1') {
				cnt+=1;
			}
			else if(sb.charAt(i)=='0'){
				cnt=0;
			}
			s=s.append(sb.charAt(i));
			
			if(cnt==5) {
				s=s.append("0");
				cnt=0;
			}
			i+=1;
		}
		
		System.out.println("Original Data: ");
		System.out.println(sb);
		
		System.out.println("Bit Stuffed Data: ");
		System.out.println(s);
		
		
		//Character Stuffing
		String data[] = {"Flag","ABC","ESC","Flag","Flag"};
		int j=0;
		String orgData="";
		while(j<data.length) {
			
			if(!data[j].equals("Flag")) {
				orgData=orgData+data[j]+" ";
			}
			
			if(data[j].equals("ESC")) {
				j+=1;
			}
			
			
		}
		
		System.out.print(orgData);
		
	}
}

