public class LcmHcf{
	public static void main(String[] str){
		int a,b, x=5, y=4, t, hcf, lcm;
		a=x;
		b=y;
		while(b!=0){
			t=b;
			b=a%b;
			a=t;
		}
		hcf=a;
		lcm=(x*y)/hcf;
		System.out.println("HCF = " +hcf);
		System.out.println("LCM = " +lcm);
	}
}

