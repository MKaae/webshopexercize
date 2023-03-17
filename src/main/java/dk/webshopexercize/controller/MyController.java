package dk.webshopexercize.controller;

import dk.webshopexercize.repository.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    ProductRepository productRepository;
    public MyController(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("products", productRepository.getAll());
        return "index";
    }
}
