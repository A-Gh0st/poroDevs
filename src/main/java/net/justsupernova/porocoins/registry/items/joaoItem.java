package net.justsupernova.porocoins.registry.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.justsupernova.porocoins.PoroCoins;
import net.justsupernova.porocoins.registry.blocks.joaoBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class joaoItem {

    //items
    public static final Item JOAO_COIN = new Item(new FabricItemSettings().group(PoroCoins.ITEM_GROUP));

    //block items
    //public static final BlockItem JOAO_BLOCK = new BlockItem(joaoBlock.JOAO_BLOCK, new Item.Settings().group(PoroCoins.ITEM_GROUP));

    //ore
    //public static final BlockItem JOAO_ORE = new BlockItem(joaoBlock.JOAO_ORE, new Item.Settings().group(PoroCoins.ITEM_GROUP));

    public static void register() {
        //hugo coin
        Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "joao_coin"), JOAO_COIN);
       // Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "joao_block"), JOAO_BLOCK);
        //Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "joao_ore"), JOAO_ORE);
    }
}
