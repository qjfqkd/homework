package react_oracle.ict03.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import react_oracle.ict03.dto.ProductDTO;

@Mapper
public interface ProductMapper{
	
	// 상품목록
	public List<ProductDTO> productList();
	
	// 상품등록
	public int insertProduct(ProductDTO dto);
	
	// 상품 수정
	public int updateProduct(ProductDTO dto);
	
	// 상품 삭제
	public int deleteProduct(int id);
	
	// 상품 상세
	public ProductDTO selectProduct(int id);
}
