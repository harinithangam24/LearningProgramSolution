package Week1;

import java.util.Arrays;
import java.util.Comparator;

class Product{
	private int productId;
	private String productName;
	private String category;
	public Product(int productId,String productName,String category){
		this.productId=productId;
		this.productName=productName;
		this.category=category;
	}
	public int getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public String getCategory() {
		return category;
	}
	public void setProductId(int pId) {
		productId=pId;
	}
	public void setProductName(String pName) {
		productName=pName;
	}
	public void setCategory(String cat){
		category=cat;
	}
	
	@Override
    public String toString() {
        return productName + " (ID: " + productId + ", Category: " + category + ")";
    }
}
class Searching{
	public static Product LinearSearch(Product[] products,String targetName) {
		for(Product p:products) {
			if(p.getProductName().equalsIgnoreCase(targetName)) {
				return p;
			}
		}
		return null;
	}
	public static Product BinarySearch(Product[] products,String targetName) {
		int left=0,right=products.length-1;
		while(left<=right) {
			int mid=(left+right)/2;
			int cmp=products[mid].getProductName().compareToIgnoreCase(targetName);
			if(cmp==0) {
				return products[mid];
			}
			else if(cmp<0) {
				right=mid-1;
			}
			else {
				left=mid+1;
			}
		}
		return null;
	}
}
public class EcommerceSearch {
	public static void main(String[] args) {
		Product[] products= {
				new Product(1,"SmartPhones","Gadgets"),
				new Product(2,"Laptop","Gadgets"),
				new Product(2,"Toys","Kids")
		};
		Searching search=new Searching();
		Product res1=search.LinearSearch(products,"watch");
		System.out.println(res1==null? "Not Found" : res1);
		
		Arrays.sort(products,Comparator.comparing(p-> p.getProductName().toLowerCase()));
		
		Product res2=search.LinearSearch(products,"laptop");
		System.out.println(res2==null? "Not Found" : res2);
		
	}
}
