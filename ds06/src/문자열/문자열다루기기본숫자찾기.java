package 문자열;

public class 문자열다루기기본숫자찾기 {

	public static void main(String[] args) {
		//1
		String s = "a234";
		boolean answer = true;
        if(s.length() == 4 || s.length() == 6) {
            char[] c = s.toCharArray();
            for(char x : c) {
                if(x < '0' || x > '9') {
                    answer = false;
                    break;
                }
            }
        } else {
            answer = false;
        }
        System.out.println(answer);
        
        //2
        String s2 = "1234";
        boolean answer2 = true;
        if(s2.length() == 4 || s2.length() == 6) {
        	try {
				Integer.parseInt(s2);
			} catch (NumberFormatException e) {
				answer2 = false;
			}
        } else {
			answer2 = false;
		}
        System.out.println(answer2);
        
	}

}
