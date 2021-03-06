/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Quark Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Quark
 * 
 * Quark is Open Source and distributed under the
 * [ADD-LICENSE-HERE]
 * 
 * File Created @ [18/03/2016, 22:46:32 (GMT)]
 */
package vazkii.quark.base.module;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Feature {

	public Module module;
	public boolean enabled;
	public String category;
	
	public void setupConfig() {
		// NO-OP
	}
	
	public void preInit(FMLPreInitializationEvent event) {
		// NO-OP
	}
	
	public void init(FMLInitializationEvent event) {
		// NO-OP
	}
	
	public void postInit(FMLPostInitializationEvent event) {
		// NO-OP
	}
	
	@SideOnly(Side.CLIENT)
	public void preInitClient(FMLPreInitializationEvent event) {
		// NO-OP
	}
	
	@SideOnly(Side.CLIENT)
	public void initClient(FMLInitializationEvent event) {
		// NO-OP
	}
	
	@SideOnly(Side.CLIENT)
	public void postInitClient(FMLPostInitializationEvent event) {
		// NO-OP
	}
	
	public void serverStarting(FMLServerStartingEvent event) {
		// NO-OP
	}
	
	public boolean hasSubscriptions() {
		return false;
	}
	
	public final int loadPropInt(String propName, String desc, int default_) {
		return ConfigHelper.loadPropInt(propName, category, desc, default_);
	}

	public final double loadPropDouble(String propName, String desc, double default_) {
		return ConfigHelper.loadPropDouble(propName, category, desc, default_);
	}
	
	public final boolean loadPropBool(String propName, String desc, boolean default_) {
		return ConfigHelper.loadPropBool(propName, category, desc, default_);
	}
	
}
