package com.gildedrose;

class GildedRose
{
    Item[] items;

    public GildedRose(Item[] items)
    {
        this.items = items;
    }

    public void updateQuality()
    {
        for (Item item : items)
        {
            ItemCategory category = categorize(item);
            category.updateItem(item);
        }
    }

    private ItemCategory categorize(Item item)
    {
        if (item.name.equals("Aged Brie"))
        {
            return new Cheese();
        }
        if (item.name.equals("Backstage passes to a TAFKAL80ETC concert"))
        {
            return new Concert();
        }
        if (item.name.equals("Sulfuras, Hand of Ragnaros"))
        {
            return new Legendary();
        }
        if (item.name.startsWith("Conjured"))
        {
            return new Conjured();
        }
        return new ItemCategory();
    }


    private class ItemCategory
    {

        public final void updateItem(Item item)
        {
            updateQuality(item);
            updateSellin(item);
            if (item.sellIn < 0)
            {
                updateExpired(item);
            }
        }

        protected void updateQuality(Item item)
        {
            decrementQuality(item);
        }

        protected void updateSellin(Item item)
        {
            item.sellIn = item.sellIn - 1;
        }

        protected void updateExpired(Item item)
        {
            decrementQuality(item);
        }

        protected void incrementQuality(Item item)
        {
            if (item.quality < 50)
            {
                item.quality = item.quality + 1;
            }
        }

        protected void decrementQuality(Item item)
        {
            if (item.quality > 0)
            {
                item.quality = item.quality - 1;
            }
        }
    }

    private class Cheese extends ItemCategory
    {
        @Override
        protected void updateQuality(Item item)
        {
            incrementQuality(item);
        }

        @Override
        protected void updateExpired(Item item)
        {
            incrementQuality(item);
        }
    }

    private class Concert extends ItemCategory
    {
        @Override
        protected void updateQuality(Item item)
        {
            incrementQuality(item);
            if (item.sellIn <= 10)
            {
                incrementQuality(item);
            }
            if (item.sellIn <= 5)
            {
                incrementQuality(item);
            }
        }

        @Override
        protected void updateExpired(Item item)
        {
            item.quality = 0;
        }
    }

    private class Legendary extends ItemCategory
    {
        @Override
        protected void updateSellin(Item item) {}

        @Override
        protected void decrementQuality(Item item) {}
    }

    private class Conjured extends ItemCategory
    {
        @Override
        protected void decrementQuality(Item item)
        {
            super.decrementQuality(item);
            super.decrementQuality(item);
        }
    }
}
