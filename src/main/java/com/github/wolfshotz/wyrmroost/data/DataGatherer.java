package com.github.wolfshotz.wyrmroost.data;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

/**
 * Data is data. It <I>could</I> be cleaner to integrate this data inside the registry logic and have the registry
 * object instances hold everything.
 * HOWEVER, I feel that, much like the "Seperate Client from Server" concept, I would like to keep
 * data related shit in its own space. Thus the DataGatherer
 * This is because, when it comes to runtime, the object instances that hold that data will never even be used.
 * Nitpicky, but I don't care its saving someone that little bit of memory to squeeze that one last chrome tab in.
 */
public class DataGatherer
{
    public static void gather(GatherDataEvent event)
    {
        DataGenerator gen = event.getGenerator();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();

//        if (event.includeServer())
//        {
//            TagData.provide(gen, fileHelper);
//            gen.install(new RecipeData(gen));
//            gen.install(new LootTableData(gen));
//        }
        if (event.includeClient())
        {
//            gen.install(new BlockModelData(gen, fileHelper));
//            gen.install(new ItemModelData(gen, fileHelper));
            gen.install(new SoundData(gen, event.getExistingFileHelper()));
        }
    }
}
