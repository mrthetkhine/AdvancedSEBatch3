package com.turing.advancedse3.refactoring.kata;

class GildedRose {
    
	private static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
	private static final String BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
	public static final String AGED_BRIE = "Aged Brie";
	Item[] items;

    public GildedRose(Item[] items) {
    	Item[] tempItems = new Item[items.length]; 
    	for(int i=0;i< items.length;i++)
    	{
    		tempItems[i] = buildItem(items[i]);
    	}
    	this.items = tempItems;
    }

    Item buildItem(Item item)
    {
    	String itemName = item.name;
    	if(itemName.equals(BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT))
    	{
    		return new BackStageItem(item);
    	}
    	else if(itemName.equals(AGED_BRIE))
    	{
    		return new AgedBriteItem(item);
    	}
    	else if(itemName.equals(SULFURAS_HAND_OF_RAGNAROS))
    	{
    		return new SulfurasItem(item);
    	}
    	else
    	{
    		return item;
    	}
    }
    public void update() {
    	for(Item item: this.items)
    	{
    		item.update();
        }
    }
    
}