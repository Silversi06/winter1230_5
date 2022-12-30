package vendingmachine.view;

import java.util.ArrayList;
import java.util.Scanner;

import vending_machine.ProductVO;

public class ProductView {
	ArrayList<ProductVO> productList;
	
	Scanner s1 = new Scanner(System.in);
	
	public void displayProducts() {
		int cnt=0;
		System.out.println("=================== Drink Vending Machine ====================");
		for(ProductVO vo : productList) {
				System.out.println((vo.getProductNum()+1)+":"+vo.getName()+
						"[price:"+vo.getPrice()+", stock:"+vo.getStockNum()+"]\t");
				if(cnt++ %3 == 0)
					System.out.println();
		}
		System.out.println("\n==============================================\n");
		
	}
	public void inputPurchase() {
		System.out.println("********************* Purchase Drink ********************");
		System.out.print("������ǰ ��ȣ�� �Է��ϼ��� : ");
		int productNum = s1.nextInt();
		ProductVO vo = productList.get(productNum-1);
		
		if(vo.getStockNum()>0) {
			System.out.print(vo.getName()+"��ǰ�� ������"+vo.getPrice()+"�� ���� ����:");
			int price = s1.nextInt();
			
			System.out.println(vo.getName()+"��ǰ�� ���Խ��ϴ�.");
			if(price>vo.getPrice())
				System.out.println("�Ž�����: "+(price - vo.getPrice())+"��");
			vo.setStockNum(vo.getStockNum()-1);
		}else {
			System.out.println("�����Ͻ� ��ǰ�� ��� �����ϴ�.");
		}
	}
	public Scanner getS1() {
		return s1;
	}
	
	public void setProductList(ArrayList<ProductVO>productList) {
		this.productList = productList;
	}

}
