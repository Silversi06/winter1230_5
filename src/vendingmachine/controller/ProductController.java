package vendingmachine.controller;

import java.util.ArrayList;
import java.util.Scanner;

import vending_machine.ProductDAO;
import vending_machine.ProductVO;
import vendingmachine.view.ProductView;

public class ProductController {
	public static final int STOP =0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProductDAO dao = new ProductDAO();
		String[]names = {"사이다","콜라","비타500","티즐","초록매실","포도쥬스","데자와","비락식혜","제로콜라","오렌지쥬스"};
		int [] prices = {700,900,900,2100,1600,1500,2200,1000,2000,2000};
		ProductVO vo = null;
		ArrayList<ProductVO> productList = dao.select();
		for (int i=0; i<names.length; i++) {
			vo = new ProductVO();
			vo.setName(names[i]);
			vo.setPrice(prices[i]);
			vo.setProductNum(i);
			vo.setStockNum(10);
			productList.add(vo);
		}
		
		ProductView view = new ProductView();
		view.setProductList(productList);
		view.displayProducts();
		
		Scanner s1 = view.getS1();
		while(true) {
			view.inputPurchase();
			System.out.print("!!제품을 계속 구매하시겠습니까?(Continue:1, Stop:0) :");
			int state = s1.nextInt();
			if(state == STOP)
				break;
			view.displayProducts();
			
		}
		s1.close();
	}

}
