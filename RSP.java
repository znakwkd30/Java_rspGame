package dgsw_y2_c2_n05;

import java.util.Random;
import java.util.Scanner;

public class RSP {
	Scanner scanner = new Scanner(System.in);
	
	private int win = 0;
	
	private int lose = 0;
	
	private int noWin = 0;
	
	/**
	 * 컴퓨터 가위바위보 생성
	 * 
	 */
	public int randomProduce()
	{
		Random random = new Random();
		int ranNum = random.nextInt(3)+1;
		
		return ranNum;
	}
	
	/**
	 * 이긴지 진지 판별
	 * 
	 * @param input 유저가 선택한 가위바위보
	 */
	public void win_or_lose(String input)
	{
		int comp,computerNum;
		
		computerNum = randomProduce();
		
		if("가위".equals(input))
			comp = 1;
		else if("바위".equals(input))
			comp = 2;
		else
			comp = 3;
		
		if(comp-computerNum == 0)
		{
			System.out.println("무승부 ~");
			noWin++;
		}
		else if(comp-computerNum == 1 || comp-computerNum == -1)
		{
			if(comp-computerNum<0)
			{
				System.out.println("컴퓨터가 이겼습니다.");
				lose++;
			}
			else
			{
				System.out.println("사용자가 이겼습니다 !");
				win++;
			}
		}
		else if(comp-computerNum == 2 || comp-computerNum == -2)
		{
			if(comp-computerNum<0)	
			{
				System.out.println("사용자가 이겼습니다 !");
				win++;
			}
			else
			{
				System.out.println("컴퓨터가 이겼습니다]");
				lose++;
			}
				
		}
	}
	
	/**
	 *콘솔창 출력
	 * 
	 */
	public void display()
	{
		String input;
		boolean isTrue = true;
		
		System.out.println("< = = = = = = = = = = = = = >");
		System.out.println("< = = = 락 시저 페이퍼 = = = >");
		System.out.println("< = = = = = = = = = = = = = >");
		
		while(isTrue)
		{
			System.out.println();
			System.out.print("가위바위보를 입력해주세요(종료시 : Q/q 입력) : ");
			input = scanner.nextLine();
			
			switch(input)
			{
			case "가위":
			case "바위":
			case "보":
				win_or_lose(input);
				break;
		
			case "Q":
			case "q" :
				System.out.println("승리 : "+win+" 패배 : "+lose+" 무승부 : "+noWin);
				isTrue = false;
			}
		}
		scanner.close();
	}
	
	
	
	
	
	

	public static void main(String[] args) 
	{
		RSP rsp = new RSP();
		rsp.display();
	}

}
