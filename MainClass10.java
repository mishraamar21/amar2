public class MainClass10{
	public static void main(String[] str){
		int[] a={10,4,7,1,2,9};
		int temp,i,j;
		for(i=0;i<=a.length-1;i++){
			for(j=i;j<a.length-1;j++){
			if(a[i]>a[j+1]){
				temp=a[i];
				a[i]=a[j+1];
				a[j+1]=temp;
}
}
}
		for(i=0;i<a.length;i++)
			System.out.println(a[i]);

}
}