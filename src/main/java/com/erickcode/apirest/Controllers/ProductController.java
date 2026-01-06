package com.erickcode.apirest.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erickcode.apirest.Entities.Product;
import com.erickcode.apirest.Repositories.ProductRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

/** Spring Boot annotation to indicate that this class is going to be a Controller */
@RestController
/** Spring Boot annotation to make this class available to the clients that points to our software by an HTTP request.
 * Something like: localhost:8080/products
 */
@RequestMapping("/products")

public class ProductController {
    /** This decorator states that the ProductRepository will be injected by Spring 
     * It is like we are going to get access to the Repositories folder and read the ProductRepository.java file
    */
    @Autowired
    private ProductRepository productRepository;

    /** Get (ALL) */
    @GetMapping
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    /** Get (ONE RECORD) by ID */
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Product not found with id " + id));
    }
    
    /** Post */
    @PostMapping()
    public Product createProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }    

    /** Put */
    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product productDetails) {
        Product product = productRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Product not found with id " + id));        
        product.setName(productDetails.getName());
        product.setPrice(productDetails.getPrice());
        return productRepository.save(product);
    }

    /** Delete */
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Long id) {
        Product product = productRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Product not found with id " + id));        
        productRepository.delete(product);
        return "Product deleted with id " + id;
    }

    /** It is pending to run the Patch method */
}
