package com.spencerio.smm.network;

import io.netty.buffer.ByteBuf;

public interface ISMMPacket
{
    public void readBytes(ByteBuf bytes);
    public void writeBytes(ByteBuf bytes);
}
