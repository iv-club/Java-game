package ĳ����;

public class ĳ���� extends Thread{
	public String name;
	public int hp;
	public int level;
	public int power;
	public int defense;
	public int money;
	public int experience;

	// �����ϱ�
	public int attack()
	{
		 return power;
	}
		 
	// ���ݹޱ�
	public void attacked(int sum) {
		
	// ������ ���� ���������� ū ���
	  if(defense >= sum)
			   hp = hp - 0;
	  else
			   hp = hp + defense - sum;
	}
}
