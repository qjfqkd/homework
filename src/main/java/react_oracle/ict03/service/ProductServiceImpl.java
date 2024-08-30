package react_oracle.ict03.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import react_oracle.ict03.dao.ProductMapper;
import react_oracle.ict03.dto.ProductDTO;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductMapper dao;
	
	@Override
	public List<ProductDTO> listAll() throws ServletException, IOException {
		System.out.println("service - ListAll");
		
		List<ProductDTO> list = dao.productList();
		
		return list;
	}

	@Override
	public int insertProduct(ProductDTO dto) throws ServletException, IOException {
		System.out.println("service - insertProduct");
		
		int insertCnt = dao.insertProduct(dto);
		System.out.println("서비스 :" + insertCnt);
		return insertCnt;
	}

	@Override
	   public int updateProduct(ProductDTO dto) 
	         throws ServletException, IOException {
	      System.out.println("서비스 - updateProduct()");
	      
	      int updateCnt = dao.updateProduct(dto);
	      return updateCnt;
	   }

	   @Override
	   public int deleteProduct(int id) 
	         throws ServletException, IOException {
	      System.out.println("서비스 - deleteProduct()");
	      int deleteCnt = dao.deleteProduct(id);
	      return deleteCnt;
	   }

	@Override
	public ProductDTO findByID(int id) throws ServletException, IOException {

		System.out.println("서비스 -findByID ");
		
		ProductDTO dto = dao.selectProduct(id); 
		return dto;
	}

}
