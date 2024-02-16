package com.example.RGBDelight.mixins;

import com.epherical.croptopia.CroptopiaForge;
import com.epherical.croptopia.CroptopiaMod;
import com.epherical.croptopia.register.Content;
import com.example.RGBDelight.RGBDelight;
import com.example.RGBDelight.items.ItemInit;
import ic2.api.recipes.registries.IMachineRecipeList;
import ic2.core.block.machines.tiles.lv.MaceratorTileEntity;
import ic2.core.platform.registries.IC2Items;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MaceratorTileEntity.class)
public class MaceratorTileEntityMixin {
    @Inject(method = "loadRecipes", at = @At(value = "TAIL"))
    private static void addRecipe(IMachineRecipeList list, CallbackInfo ci) {
        list.addIC2XPRecipe("pane_a_gratta", new ItemStack(ItemInit.PANGRATTATO.get(), 1), 0.1F, new Object[]{Items.BREAD});
        list.addIC2XPRecipe("parmigiano_gratta", new ItemStack(ItemInit.PARMIGIANOGRATTUGIATO.get(), 1), 0.1F, new Object[]{Content.CHEESE});
        list.addIC2XPRecipe("raffina_farina", new ItemStack(ItemInit.FARINA00.get(), 1), 0.1F, new Object[]{Content.FLOUR});
    }
}
