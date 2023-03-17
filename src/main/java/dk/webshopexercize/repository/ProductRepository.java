package dk.webshopexercize.repository;

import dk.webshopexercize.model.Product;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    //database-properties
    private final static String DB_URL = "jdbc:mysql://localhost:3306/webshopexercise";
    private final static String UID = "root";
    private static String PWD = "25cjYcyOoz1ifa";

    public List<Product> getAll(){
        List<Product> productList = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(DB_URL, UID, PWD);
            Statement statement = connection.createStatement();
            final String SQL_QUERY = "SELECT * FROM products";
            ResultSet resultSet = statement.executeQuery(SQL_QUERY);
            while(resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                double price = resultSet.getDouble(3);
                Product product = new Product(id,name,price);
                productList.add(product);
                System.out.println(product);
            }

        } catch(SQLException SQLE){
            System.out.println("There was no connection found.");
            SQLE.printStackTrace();
        }
        return productList;
    }
}
