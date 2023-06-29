package com.turing.advancedse3.refactoring.kata;

public class Item {
	static final int MIN_QUALITY = 0;
	static final int MIN_SELL_IN = 0;
	static final int MAX_QUALITY = 50;
    public String name;
    public int sellIn;
    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void update()
    {
    	this.updateQuality();
    	this.updateSellIn();
    }
   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
   void updateQuality()
   {
	   if (this.quality > MIN_QUALITY) {
			this.quality = this.quality - 1;
	    }
   }
   void updateSellIn()
   {
		this.sellIn = this.sellIn - 1;
		if (this.sellIn < MIN_SELL_IN) 
		{
			if (this.quality > MIN_QUALITY) 
	        {
	        	this.quality = this.quality - 1;
	        }
		}
		
   }
   void updateQualityIfNotExcceedMax() {
		if (this.quality < MAX_QUALITY) {
			this.quality = this.quality + 1;
		}
	}
}
class AgedBriteItem extends Item
{
	public AgedBriteItem(Item item)
	{
		this(item.name,item.sellIn,item.quality);
	}
		public AgedBriteItem(String name, int sellIn, int quality) {
	       super(name,sellIn,quality);
	    }

	   void updateQuality()
	   {
		   updateQualityIfNotExcceedMax();
	   }
	   void updateSellIn()
	   {
		   	this.sellIn = this.sellIn - 1;
			if (this.sellIn < MIN_SELL_IN) 
			{
				updateQualityIfNotExcceedMax();
			}
	   }
	  
	  
}
class BackStageItem extends Item
{
	public BackStageItem(Item item)
	{
		this(item.name,item.sellIn,item.quality);
	}
		public BackStageItem(String name, int sellIn, int quality) {
	       super(name,sellIn,quality);
	    }

	   void updateQuality()
	   {
		   if (this.quality < MAX_QUALITY) {
		    	this.quality = this.quality + 1;
		        updateBackstageQualityWithinSellIn();
		    }
	   }
	   void updateSellIn()
	   {
		   	this.sellIn = this.sellIn - 1;
			if (this.sellIn < MIN_SELL_IN) 
			{
				this.quality = 0;
			}
	   }
	   private void updateBackstageQualityWithinSellIn() {
			if (this.sellIn < 11) {
		        updateQualityIfNotExcceedMax();
		    }

		    if (this.sellIn < 6) {
		        updateQualityIfNotExcceedMax();
		    }
		}
}
class SulfurasItem extends Item
{
	public SulfurasItem(Item item)
	{
		this(item.name,item.sellIn,item.quality);
	}
	public SulfurasItem(String name, int sellIn, int quality) {
	       super(name,sellIn,quality);
	}
		void updateQuality()
	   {
		   //Do nothing;
	   }
	   void updateSellIn()
	   {
		   //Do nothing;
	   }
}