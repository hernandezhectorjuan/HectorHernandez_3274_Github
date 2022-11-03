/***************************************************************************************************************************
 * 
 * @author Hector Hernandez, PhD
 * Date: 11/01/2022 [T]
 *
 **************************************************************************************************************************/
public class QuantityItem extends AbstractItem
{
   private Product product;
   private int quantity;

   /**
      Constructs an item from the product and quantity.
      @param aProduct the product
      @param aQuantity the item quantity
   */
   public QuantityItem(Product aProduct, int aQuantity)
   {
      product = aProduct;
      quantity = aQuantity;
   }

   /**
      Computes the total cost of this item.
      @return the total price
   */
   public double getTotalPrice()
   {
      return product.getPrice() * quantity;
   }

   public String getDescription(int length)
   {
      return String.format("%-" + (length - 13) + "s%8.2f%5d",
         product.getDescription(), product.getPrice(), quantity);
   }
}










