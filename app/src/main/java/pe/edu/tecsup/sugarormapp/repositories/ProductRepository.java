package pe.edu.tecsup.sugarormapp.repositories;

import com.orm.SugarRecord;

import java.util.List;

import pe.edu.tecsup.sugarormapp.models.Product;

/**
 * Created by Alumno on 20/04/2018.
 */

public class ProductRepository {

    public static List<ProductRepository> list(){
        List<ProductRepository>productRepository = SugarRecord.listAll(ProductRepository.class);
        return productRepository;
    }

   public static ProductRepository read(Long id){
        ProductRepository productRepository= SugarRecord.findById(ProductRepository.class, id);
        return productRepository;
    }

    public static void create(String fullname, String category, Double precio, String description ){
        Product productRepository=new Product(fullname, category , precio , description);
        SugarRecord.save(productRepository);
    }

   public static void update(String fullname, String category, Double precio, String description, Long id){
        Product productRepository=SugarRecord.findById(Product.class, id);
        product.setFullname(fullname);
        product.setCategory(category);
        product.setPrecio(precio);
        product.setDescription(description);
        product.save(productRepository);
    }

    public static void delete(Long id){
        ProductRepository productRepository=SugarRecord.findById(ProductRepository.class, id);
        SugarRecord.delete(productRepository);
    }
}

