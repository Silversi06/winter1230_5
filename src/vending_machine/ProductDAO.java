package vending_machine;

import java.util.ArrayList;

import vending_machine.ProductVO;

public class ProductDAO {
	
	ArrayList<ProductVO> productList = new ArrayList<ProductVO>();

	//insert: ArrayList �� �л�������ü(StudentVO)�� �߰��ϴ� �޼���
	public void insert(ProductVO vo) {
		productList.add(vo);
	}
	
	//select:��ü �л�������ü���� ��Ȳ�ϴ� �޼���
	public ArrayList<ProductVO> select(){
		return productList;
	}

}
