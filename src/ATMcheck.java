import java.util.Scanner;
public class ATMcheck {

	public static void main(String args[]) 
	{
		int bal=20000, w, d;
		
		Scanner obj=new Scanner(System.in);
		
		System.out.println("1.check balance");
		System.out.println("2.withdraw amount...enter choice and amount");
		System.out.println("3.deposit amount... enter choice and amount");
		System.out.println("4.exit");
		int ch;
		ch=obj.nextInt();
		switch(ch) {
		case 1:{System.out.println(+bal);
		        break;}
		case 2:{ w=obj.nextInt();
		       if(w>bal)
		       {System.out.println("insufficient balance");}
		       else
		       {bal=bal-w;
		       System.out.println(+bal);
		       }
		       break;}
		case 3:{d=obj.nextInt();
				bal=bal+d;
				System.out.println(+bal);
				break;}
		default:break;
		}
		
		}

	}
