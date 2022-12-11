﻿using Application.DAOInterfaces;
using Application.LogicInterfaces;
using Shared.DTOs;
using Shared.Models;

namespace Application.Logic;

public class ProductLogic : IProductLogic
{

    private readonly IProductDAO productDao;
    
    private readonly IUserDAO userDao;

    public ProductLogic(IProductDAO productDao, IUserDAO userDao)
    {
        this.productDao = productDao;
        this.userDao = userDao;
    }

    public async Task<Product> RegisterProductAsync(ProductCreationDTO dto)
    {
        Product product = new Product
        {
            Name = dto.Name,
            ImagePath = dto.ImagePath,
            Price = dto.Price,
            Description = dto.Description,
            inStock = dto.InStock,
            Category = dto.Category
        };

        return await productDao.RegisterProductAsync(product);
    }

    public async Task<IEnumerable<Product>> GetProductsAsync()
    {
        var products = await productDao.GetProductsAsync();

        //Need
        
        /*if (!products.Any())
        {
            throw new Exception("No products to display");
        }*/

        return products;
    }

    public async Task<IEnumerable<Product>> GetProductsInCartByUserAsync(string username)
    {
        //No Need
        
        User user = await userDao.FindUserAsync(username);

        if (user == null)
        {
            throw new Exception("User not exists");
        }
        
        var products = await productDao.GetProductsInCartByUserAsync(username);
        
        //Need
        
        /*if (!products.Any())
        {
            throw new Exception("No products to display");
        }*/
        
        return products;
    }

    public Task<IEnumerable<Product>> GetProductsByOrderIdAsync(string orderId)
    {
        var productsInOrder = productDao.GetProductsByOrderIdAsync(orderId);

        return productsInOrder;
    }

    public async Task<Product> FindProductByIdAsync(string productId)
    {
        var product = await productDao.FindProductByIdAsync(productId);
        
        //No need
        
        if (product == null)
        {
            throw new Exception("Product not exists");
        }

        return product;
    }

    public async Task DeleteProductAsync(string id)
    {
        await productDao.DeleteProductAsync(id);
    }

    public async Task UpdateProductAsync(Product product)
    {
        //No need
        
        string productId = product.Id.ToString();

        var checkProduct = await productDao.FindProductByIdAsync(productId);

        if (checkProduct == null)
            throw new Exception("Product not exists");

        var productToSend = new Product
        {
            Id = product.Id,
            Name = product.Name,
            ImagePath = product.ImagePath,
            Price = product.Price,
            Description = product.Description,
            inStock = product.inStock
        };

        await productDao.UpdateProductAsync(productToSend);
    }

    public async Task<IEnumerable<Product>> GetProductsByNameAsync(string productName)
    {
        var products = await productDao.GetProductsByNameAsync(productName);

        //Need
        
        /*if (!products.Any())
        {
            throw new Exception($"No result for ({productName})'");
        }*/
        
        return products;
    }

    public async Task<IEnumerable<Product>> GetProductsByCategoryNameAsync(string categoryName)
    {
        var products = await productDao.GetProductsByCategoryNameAsync(categoryName);
        
        return products;
    }
}