package com.example.RGBDelight.items;

import com.example.RGBDelight.RGBDCreativeModeTab;
import com.example.RGBDelight.RGBDelight;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ItemInit {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RGBDelight.MODID);

    public static final RegistryObject<Item> LATTEPIENO = ITEMS.register("lattep",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).build()).tab(RGBDCreativeModeTab.RGBD_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> LATTEVUOTO = ITEMS.register("lattev",
            () -> new Item(new Item.Properties().tab(RGBDCreativeModeTab.RGBD_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> BARATTOLO = ITEMS.register("barattolo",
            () -> new Item(new Item.Properties().tab(RGBDCreativeModeTab.RGBD_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> FARINA00 = ITEMS.register("farina00",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(0).build()).tab(RGBDCreativeModeTab.RGBD_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> PANGRATTATO = ITEMS.register("pangrattato",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(0).build()).tab(RGBDCreativeModeTab.RGBD_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> NUTELLA = ITEMS.register("nutella",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).build()).tab(RGBDCreativeModeTab.RGBD_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> SHORTBREADC = ITEMS.register("shortbreadc",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).build()).tab(RGBDCreativeModeTab.RGBD_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> SHORTBREADS = ITEMS.register("shortbreads",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).build()).tab(RGBDCreativeModeTab.RGBD_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> TIRAMISU = ITEMS.register("tiramisu",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).build()).tab(RGBDCreativeModeTab.RGBD_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> MOZZARELLA = ITEMS.register("mozzarella",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).build()).tab(RGBDCreativeModeTab.RGBD_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> PARMIGIANOGRATTUGIATO = ITEMS.register("parmigiano",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).build()).tab(RGBDCreativeModeTab.RGBD_CREATIVE_MODE_TAB)));

    //public static final RegistryObject<Item> PIATTOFABRI = ITEMS.register("piattofabrimat",
    //        () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).build()).tab(RGBDCreativeModeTab.RGBD_CREATIVE_MODE_TAB)));

    public static final RegistryObject<Item> ARANCINOC = ITEMS.register("arancinoc",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).build()).tab(RGBDCreativeModeTab.RGBD_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> ARANCINOCK = ITEMS.register("arancinock",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(10).build()).tab(RGBDCreativeModeTab.RGBD_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> TONNOSC = ITEMS.register("tonnosc",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).build()).tab(RGBDCreativeModeTab.RGBD_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> SPAMM = ITEMS.register("carnesc", //SPAM -> Carne in scatola lmao
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).build()).tab(RGBDCreativeModeTab.RGBD_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> MAYO = ITEMS.register("maionese",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(0).build()).tab(RGBDCreativeModeTab.RGBD_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> KETCHUM = ITEMS.register("ketchup",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(0).build()).tab(RGBDCreativeModeTab.RGBD_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> CROCCHE = ITEMS.register("crocche",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).build()).tab(RGBDCreativeModeTab.RGBD_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> CROCCHETTE = ITEMS.register("crocchette",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).build()).tab(RGBDCreativeModeTab.RGBD_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> GRAFFA = ITEMS.register("graffa",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(7).build()).tab(RGBDCreativeModeTab.RGBD_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> BOMBO = ITEMS.register("bombolone",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(8).build()).tab(RGBDCreativeModeTab.RGBD_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> DONUT = ITEMS.register("ciambella",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).build()).tab(RGBDCreativeModeTab.RGBD_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> MONSTER = ITEMS.register("energydrink",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(0).effect(
                    () -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 12000 ,0), 0.8F).alwaysEat().build()).tab(RGBDCreativeModeTab.RGBD_CREATIVE_MODE_TAB)));

    // gelati
    public static final RegistryObject<Item> BASEGELATO = ITEMS.register("basegelato",
            () -> new Item(new Item.Properties().tab(RGBDCreativeModeTab.RGBD_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> GELATOCIOCCO = ITEMS.register("gelatociocco",
            () -> new Item(new Item.Properties().tab(RGBDCreativeModeTab.RGBD_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> GELATOPISTACCHIO = ITEMS.register("gelatopistacchio",
            () -> new Item(new Item.Properties().tab(RGBDCreativeModeTab.RGBD_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> GELATOSTRACCIA = ITEMS.register("gelatostraccia",
            () -> new Item(new Item.Properties().tab(RGBDCreativeModeTab.RGBD_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> GELATOFIORDI = ITEMS.register("gelatofiordi",
            () -> new Item(new Item.Properties().tab(RGBDCreativeModeTab.RGBD_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> GELATORICCO = ITEMS.register("gelatoricco",
            () -> new Item(new Item.Properties().tab(RGBDCreativeModeTab.RGBD_CREATIVE_MODE_TAB)));


    public static final RegistryObject<Item> CONOCIOCCO = ITEMS.register("conociocco",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).alwaysEat().build()).tab(RGBDCreativeModeTab.RGBD_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> CONOPISTACCHIO = ITEMS.register("conopistacchio",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).alwaysEat().build()).tab(RGBDCreativeModeTab.RGBD_CREATIVE_MODE_TAB)));

    public static final RegistryObject<Item> CONOSTRACCIA = ITEMS.register("conostraccia",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).alwaysEat().build()).tab(RGBDCreativeModeTab.RGBD_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> CONOFIORDI = ITEMS.register("conofiordi",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).alwaysEat().build()).tab(RGBDCreativeModeTab.RGBD_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> CONORICCO = ITEMS.register("conoricco",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).alwaysEat().effect(
                    () -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 12000 ,100), 1F).build()).tab(RGBDCreativeModeTab.RGBD_CREATIVE_MODE_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
