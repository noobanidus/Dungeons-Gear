package com.infamous.dungeons_gear.datagen;

import com.infamous.dungeons_gear.DungeonsGear;
import com.infamous.dungeons_gear.items.ItemTagWrappers;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

import static net.minecraft.item.Items.*;

public class ModItemTagsProvider extends net.minecraft.data.ItemTagsProvider {

    public ModItemTagsProvider(DataGenerator dataGenerator, BlockTagsProvider blockTagProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(dataGenerator, blockTagProvider, DungeonsGear.MODID, existingFileHelper);
    }

    @Override
    protected void registerTags() {
        foodTags();
    }

    private void foodTags() {
        rawFoodTag(APPLE);
        rawFoodTag(BAKED_POTATO);
        processedFoodTag(BEEF);
        rawFoodTag(BEETROOT);
        processedFoodTag(BEETROOT_SOUP);
        processedFoodTag(BREAD);
        rawFoodTag(CARROT);
        rawFoodTag(CHICKEN);
        rawFoodTag(CHORUS_FRUIT);
        rawFoodTag(COD);
        processedFoodTag(COOKED_BEEF);
        processedFoodTag(COOKED_CHICKEN);
        processedFoodTag(COOKED_COD);
        processedFoodTag(COOKED_MUTTON);
        processedFoodTag(COOKED_PORKCHOP);
        processedFoodTag(COOKED_RABBIT);
        processedFoodTag(COOKED_SALMON);
        processedFoodTag(COOKIE);
        rawFoodTag(DRIED_KELP);
        processedFoodTag(ENCHANTED_GOLDEN_APPLE);
        processedFoodTag(GOLDEN_APPLE);
        processedFoodTag(GOLDEN_CARROT);
        processedFoodTag(HONEY_BOTTLE);
        rawFoodTag(MELON_SLICE);
        processedFoodTag(MUSHROOM_STEW);
        rawFoodTag(MUTTON);
        processedFoodTag(POISONOUS_POTATO);
        rawFoodTag(PORKCHOP);
        rawFoodTag(POTATO);
        rawFoodTag(PUFFERFISH);
        processedFoodTag(PUMPKIN_PIE);
        rawFoodTag(RABBIT);
        processedFoodTag(RABBIT_STEW);
        rawFoodTag(ROTTEN_FLESH);
        rawFoodTag(SALMON);
        rawFoodTag(SPIDER_EYE);
        processedFoodTag(SUSPICIOUS_STEW);
        rawFoodTag(SWEET_BERRIES);
        rawFoodTag(TROPICAL_FISH);
    }

    private void processedFoodTag(Item foodItem) {
        this.getOrCreateBuilder(ItemTagWrappers.FOOD).add(foodItem);
        this.getOrCreateBuilder(ItemTagWrappers.FOOD_PROCESSED).add(foodItem);
    }

    private void rawFoodTag(Item foodItem) {
        this.getOrCreateBuilder(ItemTagWrappers.FOOD).add(foodItem);
        this.getOrCreateBuilder(ItemTagWrappers.FOOD_RAW).add(foodItem);
    }
}
