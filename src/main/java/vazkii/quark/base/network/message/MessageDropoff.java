/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Quark Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Quark
 * 
 * Quark is Open Source and distributed under the
 * [ADD-LICENSE-HERE]
 * 
 * File Created @ [28/03/2016, 16:32:34 (GMT)]
 */
package vazkii.quark.base.network.message;

import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import vazkii.quark.base.handler.DropoffHandler;
import vazkii.quark.base.network.Message;
import vazkii.quark.tweaks.feature.StoreToChests;

public class MessageDropoff extends Message {

	public boolean smart;
	
	public MessageDropoff() { }
	
	public MessageDropoff(boolean smart) {
		this.smart = smart;
	}
	
	@Override
	public IMessage handleMessage(MessageContext context) {
		DropoffHandler.dropoff(context.getServerHandler().playerEntity, smart);
		return null;
	}
	
}
