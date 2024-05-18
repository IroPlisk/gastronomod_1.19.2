package com.example.RGBDelight.recipes;

import com.epherical.croptopia.register.Content;
import com.example.RGBDelight.RGBDelight;
import com.example.RGBDelight.items.ItemInit;
import ic2.api.recipes.ingridients.inputs.IInput;
import ic2.api.recipes.ingridients.inputs.ItemInput;
import ic2.core.IC2;
import ic2.core.platform.registries.IC2Items;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Tuple;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import vectorwing.farmersdelight.common.registry.ModItems;

import java.util.ArrayList;
import java.util.List;

public class IC2RGBDRecipes {

    public static ResourceLocation id(String id){
        return new ResourceLocation(RGBDelight.MODID, id);
    }
    public static void init(){
        IC2.RECIPES.get(true).extractor.registerListener(r ->{
            r.addSimpleRecipe(id("centrifugazione_mayo"), new ItemStack(ItemInit.MAYO.get()), new ItemStack(Items.EGG));
            r.addSimpleRecipe(id("centrifugazione_pomo"), new ItemStack(ItemInit.KETCHUM.get()), new ItemStack(Content.TOMATO));
            r.addSimpleRecipe(id("centrifugazione_pomo_2"), new ItemStack(ItemInit.KETCHUM.get()), new ItemStack(ModItems.TOMATO.get()));
        });
        IC2.RECIPES.get(true).macerator.registerListener(r ->{
            r.addSimpleRecipe(id("pane_a_gratta"), new ItemStack(ItemInit.PANGRATTATO.get()), new ItemStack(Items.BREAD));
            r.addSimpleRecipe(id("parmigiano_gratta"), new ItemStack(ItemInit.PARMIGIANOGRATTUGIATO.get()), new ItemStack(Content.CHEESE));
            r.addSimpleRecipe(id("raffina_farina"), new ItemStack(ItemInit.FARINA00.get()), new ItemStack(Content.FLOUR));
        });
        IC2.RECIPES.get(true).canner.registerListener(r -> {
            List<Tuple<IInput, ItemStack>> addList = new ArrayList<>();
            addList.forEach(t -> {
                r.registerFillable(new ItemStack(IC2Items.CELL_EMPTY), t.getA(), t.getB());
            });
            r.registerFillable(new ItemStack(IC2Items.CELL_EMPTY), new ItemInput(Items.COD), new ItemStack(ItemInit.TONNOSC.get()));
            r.registerFillable(new ItemStack(Content.SALT), new ItemInput(Items.COOKED_BEEF), new ItemStack(ItemInit.SPAMM.get()));
        });
    }
    public void onCommonSetup(FMLCommonSetupEvent event) {
        IC2RGBDRecipes.init();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onCommonSetup);
    }
}
