package 캐릭터;

public class 캐릭터 extends Thread{
	public String name;
	public int hp;
	public int level;
	public int power;
	public int defense;
	public int money;
	public int experience;

	// 공격하기
	public int attack()
	{
		 return power;
	}
		 
	// 공격받기
	public void attacked(int sum) {
		
	// 방어력이 받은 데미지보다 큰 경우
	  if(defense >= sum)
			   hp = hp - 0;
	  else
			   hp = hp + defense - sum;
	}
}
