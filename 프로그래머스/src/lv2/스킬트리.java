package lv2;
import java.util.*;
public class ��ųƮ�� {

	public static void main(String[] args) {
		��ųƮ�� app = new ��ųƮ��();
		String sk="CBD";
		String [] sTree = {"BACDE","CBADF","AECB","BDA"};
		System.out.println(app.solution(sk, sTree));
	}

	public int solution(String skill, String[] skill_trees) {
		int answer = 0;
		int [] chk = new int[skill.length()];
		for(String temp : skill_trees) {
			int flag = 1;
			for(int i=0;i<skill.length();i++) {
					chk[i]=temp.indexOf(skill.charAt(i));
					System.out.print(chk[i]+" ");
			}
			for(int i=0;i<skill.length()-1;i++) {
				if((chk[i]==-1&&chk[i+1]!=-1) || chk[i+1]!=-1 && chk[i]>chk[i+1] ) { 
					flag = 0;
					break;
				}
				
			}
			System.out.println();
			if(flag==1)answer++;
		}
		return answer;
	}

}
