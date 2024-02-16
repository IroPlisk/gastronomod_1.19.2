package com.example.RGBDelight;

import com.example.RGBDelight.items.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;


public class RGBDCreativeModeTab extends CreativeModeTab {
    public static final RGBDCreativeModeTab RGBD_CREATIVE_MODE_TAB = new RGBDCreativeModeTab(CreativeModeTab.TABS.length, "rgbdelight");
     private RGBDCreativeModeTab(int index, String label) {
            super(index, label);
        }

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.LATTEPIENO.get());
        }

    }

