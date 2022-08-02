package Practice;

import java.util.*;

public class Random {
	Scanner sc = new Scanner(System.in);
	
	public void LottoNumber(int count) {
		int lotto[] = new int[6];	// 로또 번호를 입력받을 배열을 선언해준다.
		
		System.out.println();
		for(int z = 0; z < count; z++) {
			for(int i = 0; i < lotto.length; i++) {
				int num = (int)(Math.random() * 45) + 1;	// 1~46까지의 임의의 수를 받는다.
				lotto[i] = num;
				for(int j = 0; j < i; j++) {	// 중복된 번호가 있으면 이전 포문으로 돌아가 다시 시행한다.
					if(lotto[i] == lotto[j]) {
						i--;
						break;
					}
				}
			}
			Arrays.sort(lotto);
			System.out.println(Arrays.toString(lotto));
		}
		System.out.println();
		
	}
	
	
	
	public StringBuffer Password() {
		StringBuffer password = new StringBuffer();
		while(true) {
			try {
				System.out.println("비밀번호 길이를 입력 해 주세요");
				System.out.print(">");
				int pwLength = sc.nextInt();
				sc.nextLine();
				if(pwLength < 6) {
					System.out.println();
					System.out.println("5자리 이하는 생성할 수 없습니다.");
					System.out.println();
					continue;
					
//				}else if(pwLength > 20) {
//					System.out.println();
//					System.out.println("21자리 이상은 생성할 수 없습니다.");
//					System.out.println();
//					continue;
				}else {
					for(int i = 0; i < pwLength; i++) {
						int r = (int)(Math.random()*9); //랜덤한 값 생성
						password.append(r); // password변수에 랜덤 값 입력
					}
					for(int i = 0; i < pwLength; i++) {
						char LowerCh = (char)((Math.random()*26)+97); //랜덤한 알파벳 생성
						char UpperCh = (char)((Math.random()*26)+65); //랜덤한 알파벳 생성
						String LowerStr = String.valueOf(LowerCh);
						String UpperStr = String.valueOf(UpperCh);
						int r1 = (int)(Math.random()*pwLength); //replace할 랜덤한 값 생성
						int r2 = (int)(Math.random()*pwLength); //replace할 랜덤한 값 생성
						password.replace(r1, r1+1, LowerStr); //r위치의 값을 LowerStr값으로 변환
						password.replace(r2, r2+1, UpperStr); //r위치의 값을 UpperStr값으로 변환
					}
					for(int i = 0; i < pwLength; i++) {
						String special[] = {"!", "@", "#", "$", "^", "&", "-", "*", "_", "=", "+"};
						int r1 = (int)(Math.random()*pwLength); //replace할 랜덤한 값 생성
						int r2 = (int)(Math.random()*special.length); //특수문자 값을 뽑아 낼 랜덤한 값 생성
						password.replace(r1, r1+1, special[r2]); //r1위치의 값을 special[r2]의 값으로 변환
					}
					char UpperCh = (char)((Math.random()*26)+65); //알파벳이 없을 것을 방지하기 위해 랜덤한 알파벳 생성
					char LowerCh = (char)((Math.random()*26)+97); //알파벳이 없을 것을 방지하기 위해 랜덤한 알파벳 생성
					String LowerStr = String.valueOf(LowerCh);
					String UpperStr = String.valueOf(UpperCh);
					int r3 = (int)(Math.random()*pwLength); //replace할 랜덤한 값 생성
					int r4 = (int)(Math.random()*pwLength); //replace할 랜덤한 값 생성
					password.replace(r3, r3+1, LowerStr); //r3위치의 값을 LowerStr값으로 변환
					password.replace(r4, r4+1, UpperStr); //r3위치의 값을 UpperStr값으로 변환
					int r1 = (int)(Math.random()*9); //숫자가 없는 것을 방지하기 위해 추가할 랜덤 값 생성
					String str1 = String.valueOf(r1); // String으로 변환
					int r2 = (int)(Math.random()*pwLength); // replace할 랜덤 값 생성
					password.replace(r2, r2+1, str1);
				}
			}catch(InputMismatchException e) {
				sc.nextLine();
				System.out.println();
				System.out.println("정확한 숫자를 입력해 주세요");
				System.out.println();
				continue;
			}
			System.out.println();
			return password;
		}
	}
}
