package com.techm.model;

public class Product 
{
        private int prod_id;
        private int price;

        public int getId() 
        {
            return prod_id;
        }

        public void setId(int id)
        {
            this.prod_id = id;
        }

        
        public int getPrice() {
            return price;
        }

        public Product() {
        
        }

		@Override
		public String toString() {
			return "Product [id=" + prod_id + ", price=" + price + "]";
		}

		public Product(int id, int price) {
			super();
			this.prod_id = id;
			this.price = price;
		}

		public void setPrice(double price) {
            this.price = (int) price;
        }
    }


