package io.erehsawsaltul.springorm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.erehsawsaltul.springorm.dao.ProductDao;
import io.erehsawsaltul.springorm.entity.Product;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {
    	ApplicationContext dbConfigFile = new ClassPathXmlApplicationContext("io/erehsawsaltul/springorm/global_config.xml");
    	ProductDao productDao = (ProductDao) dbConfigFile.getBean("productDao");

    	Product product = new Product();
    	
		
//    	product.setId(3); 
//    	product.setName("Lenovo V570"); 
//    	product.setDesc("Gray Lenovo Laptop");
//    	product.setPrice(3000.55);
		 
    	
    	//productDao.create(product);
    	//productDao.update(product);
    	//productDao.delete(product);
    	
    	product = productDao.find(2);
    	
    	//List<Product> products = productDao.findAll();
    	//productDao.deleteAll(products);
    	System.out.println(product);
    	
    }
}
