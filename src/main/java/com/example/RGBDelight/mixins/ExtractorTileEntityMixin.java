package com.example.RGBDelight.mixins;

import com.epherical.croptopia.register.Content;
import com.example.RGBDelight.items.ItemInit;
import ic2.api.recipes.registries.ICannerRecipeRegistry;
import ic2.api.recipes.registries.IMachineRecipeList;
import ic2.core.block.machines.tiles.lv.ExtractorTileEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import vectorwing.farmersdelight.FarmersDelight;
import vectorwing.farmersdelight.common.registry.ModItems;

@Mixin(ExtractorTileEntity.class)
public class ExtractorTileEntityMixin {
    @Inject(method = "loadRecipes", at = @At(value = "TAIL"))
    private static void addRecipe(IMachineRecipeList list, CallbackInfo ci) {
        list.addIC2SimpleRecipe("centrifugazione_mayo", new ItemStack(ItemInit.MAYO.get()), new Object[]{Items.EGG}); // item è per minecraft, Iteminit è Gastronomo
        list.addIC2SimpleRecipe("centrifugazione_pomo", new ItemStack(ItemInit.KETCHUM.get()), new Object[]{Content.TOMATO}); // content è per croptopia
        list.addIC2SimpleRecipe("centrifugazione_pomo", new ItemStack(ItemInit.KETCHUM.get()), new Object[]{ModItems.TOMATO}); // moditems è per farmers delight
    }
}
