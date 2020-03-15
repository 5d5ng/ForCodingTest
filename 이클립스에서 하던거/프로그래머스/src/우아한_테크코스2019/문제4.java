package 우아한_테크코스2019;
import java.util.*;
public class 문제4 {

	public static void main(String[] args) {
		문제4 app  = new 문제4();
		String name ="제이슨";
	}

	public boolean[] solution(String[] infos, String[] actions) {
		boolean[] answer = new boolean[actions.length];
		String[]ID =new String[infos.length];
		String[]PW = new String[infos.length];
		for(int i=0;i<ID.length;i++) {
			ID[i] = infos[i].substring(0, infos[i].indexOf(" "));
			PW[i] = infos[i].substring(infos[i].indexOf(" "),infos[i].length());
		}
		int chkLog = 0;
		int chkAD = 0;

		for(int k = 0; k<actions.length;k++) {
			String []spact = actions[k].split(" ");
			if(spact[0].equals("LOGIN")) {
				for(int i=0;i<infos.length;i++) {
					if(ID[i].equals(spact[1]) && PW[i].equals(spact[2])) {
						answer[k] = true;
						chkLog = 1;
					}
				}
			}
			else if(spact[0].equals("ADD")) {
				if(chkLog==1) {
					answer[k] = true;
					chkAD =1;
				}
			}
			else if(spact[0].equals("ORDER")) {
				if(chkAD==1)
					answer[k] = true;
			}
			else {
				answer[k] = false;
			}
		}

		return answer;
	}

}
