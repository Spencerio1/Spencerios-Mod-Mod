package com.github.spencerio1.smm.manager;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

import com.github.spencerio1.smm.network.ISMMPacket;

import cpw.mods.fml.common.network.FMLIndexedMessageToMessageCodec;

public class SMMChannelManager extends FMLIndexedMessageToMessageCodec<ISMMPacket>
{
	public SMMChannelManager()
	{
	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ISMMPacket msg, ByteBuf target) throws Exception
	{
		msg.writeBytes(target);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf source, ISMMPacket msg)
	{
		msg.readBytes(source);
	}
}
