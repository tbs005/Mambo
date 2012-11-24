

// Generated on 11/11/2012 20:41:36
package org.mambo.protocol.client.messages;

import java.util.*;
import org.mambo.protocol.client.types.*;
import org.mambo.protocol.client.enums.*;
import org.mambo.protocol.client.*;
import org.mambo.protocol.client.io.*;

public class ObjectSetPositionMessage extends NetworkMessage {
    public static final int MESSAGE_ID = 3021;
    
    @Override
    public int getNetworkMessageId() {
        return MESSAGE_ID;
    }
    
    public int objectUID;
    public short position;
    public int quantity;
    
    public ObjectSetPositionMessage() { }
    
    public ObjectSetPositionMessage(int objectUID, short position, int quantity) {
        this.objectUID = objectUID;
        this.position = position;
        this.quantity = quantity;
    }
    
    @Override
    public void serialize(DataWriterInterface writer) {
        writer.writeInt(objectUID);
        writer.writeUnsignedByte(position);
        writer.writeInt(quantity);
    }
    
    @Override
    public void deserialize(DataReaderInterface reader) {
        objectUID = reader.readInt();
        if (objectUID < 0)
            throw new RuntimeException("Forbidden value on objectUID = " + objectUID + ", it doesn't respect the following condition : objectUID < 0");
        position = reader.readUnsignedByte();
        if (position < 0 || position > 255)
            throw new RuntimeException("Forbidden value on position = " + position + ", it doesn't respect the following condition : position < 0 || position > 255");
        quantity = reader.readInt();
        if (quantity < 0)
            throw new RuntimeException("Forbidden value on quantity = " + quantity + ", it doesn't respect the following condition : quantity < 0");
    }
    
}