package com.patterns.builderv2;

public class Product {
	private String name; //required
	private double price;	//required
	private double weight;	//required
	private float protein;	//optional
	private float carbs;	//optional
	private float fats;	//optional
	private float vitamines; //optional
	

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public double getWeight() {
		return weight;
	}

	public float getProtein() {
		return protein;
	}

	public float getCarbs() {
		return carbs;
	}

	public float getFats() {
		return fats;
	}

	public float getVitamines() {
		return vitamines;
	}
	
	public Product(String name, double price, double weight) {
		this.name = name;
		this.price = price;
		this.weight = weight;
	}
	

	private Product setNutritions(NutritionInfo nutritionInfo) {
		this.protein = nutritionInfo.protein;
		this.carbs = nutritionInfo.carbs;
		this.fats = nutritionInfo.fats;
		this.vitamines = nutritionInfo.vitamines;
		return this;
	}
	
	@Override
	public String toString() {
		return "Product info\nName: "+this.name+"\nPrice: "+this.price+"\nWeight: "+this.weight
				+"\nProtein: "+this.protein
				+"\nCarbohydrates: "+this.carbs
				+"\nFats: "+this.fats
				+"\nVitamines: "+this.vitamines;
	}
	
	public class NutritionInfo {
		private float protein;
		private float carbs;
		private float fats;
		private float vitamines;
		
		public NutritionInfo setProtein(float protein) {
			this.protein = protein;
			return this;
		}
		public NutritionInfo setCarbs(float carbs) {
			this.carbs = carbs;
			return this;
		}
		public NutritionInfo setFats(float fats) {
			this.fats = fats;
			return this;
		}
		public NutritionInfo setVitamines(float vitamines) {
			this.vitamines = vitamines;
			return this;
		}
		
		public Product buildProduct() {
			return Product.this.setNutritions(this);
		}
	}

}