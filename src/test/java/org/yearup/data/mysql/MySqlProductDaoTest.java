package org.yearup.data.mysql;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.yearup.models.Product;

import java.math.BigDecimal;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class MySqlProductDaoTest extends BaseDaoTestClass
{
    private MySqlProductDao dao;

    @BeforeEach
    public void setup()
    {
        dao = new MySqlProductDao(dataSource);
    }

    @Test
    public void getById_shouldReturn_theCorrectProduct()
    {
        // arrange
        int productId = 1;

        Product expected = new Product()
        {{
            setProductId(1);
            setName("The Beatles - Abbey Road Vinyl");
            setPrice(new BigDecimal("29.99"));
            setCategoryId(1);
            setDescription("Classic Beatles album remastered on 180-gram vinyl.");
            setSubCategory("Rock");
            setStock(50);
            setFeatured(true);
            setImageUrl("abbey-road-vinyl.jpg");
        }};

        // act
        var actual = dao.getById(productId);

        // assert
        assertEquals(expected.getProductId(), actual.getProductId(), "ID should match");
        assertEquals(expected.getName(), actual.getName(), "Product 1 Name should match");
    }

    @Test
    public void search_shouldReturn_theMinimumAndMaximumPriceProducts() {
        //arrange
        BigDecimal minPrice = new BigDecimal("29.99");
        BigDecimal maxPrice = new BigDecimal("100.00");

        //act
        var products = dao.search(null,minPrice,maxPrice,null);

        //assert
        assertNotNull(products, "Products should not be null");
        assertTrue(!products.isEmpty(), "Search should not be empty.");
    }

}