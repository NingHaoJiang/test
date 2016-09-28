package kaibI;

public class ZhuXi {


public void sharen(GuoJia gj){
	System.out.print("Ï°½üÆ½");
	gj.sha();
}

 public static void main(String[] args) {
	 ZhuXi z = new ZhuXi();
	 ThisGuoJia s= new ThisGuoJia();
	 z.sharen(s);
	 
}
}
