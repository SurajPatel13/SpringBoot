package com.sky.service;

import java.util.List;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sky.domain.Product;
import com.sky.repository.ProductRepository;
@Service
public class ProducrServiceImpl implements ProductService {
	
	@Qualifier("productRepositoryDBImpl")
	@Autowired
	private ProductRepository productRepository;

	@Override
	public void addProduct(Product product) {
		System.out.println("In Service");	
		if(product.getPrice()>20) 
		productRepository.addProduct(product);
	}

	@Override
	public List<Product> getProduct() {
		
		return productRepository.getProduct();
	}

	@Override
	public void deleteProduct(Product product) {
		// TODO Auto-generated method stub
		productRepository.deleteProduct(product);
	}

	@Override
	public Product getProductByID(String productID) {
		// TODO Auto-generated method stub
		return productRepository.getProductByID(productID);
	}

	@Override
	public Product updateProduct(Product tmpproduct) {
		// TODO Auto-generated method stub
		return productRepository.updateProduct(tmpproduct);
	}


}
