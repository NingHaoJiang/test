package kaibI;

public class ZhuXi {


public void sharen(GuoJia gj){
	System.out.print("ϰ��ƽ");
	gj.sha();
}

 public static void main(String[] args) {
	 ZhuXi z = new ZhuXi();
	 ThisGuoJia s= new ThisGuoJia();
	 z.sharen(s);
	 
}
}
