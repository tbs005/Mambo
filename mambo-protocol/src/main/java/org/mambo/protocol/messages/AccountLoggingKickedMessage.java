

// Generated on 05/08/2013 19:37:40
package org.mambo.protocol.messages;

import java.util.*;
import org.mambo.protocol.types.*;
import org.mambo.protocol.enums.*;
import org.mambo.protocol.*;
import org.mambo.core.io.*;

public class AccountLoggingKickedMessage extends NetworkMessage {
    public static final int MESSAGE_ID = 6029;
    
    @Override
    public int getNetworkMessageId() {
        return MESSAGE_ID;
    }
    
    public int days;
    public int hours;
    public int minutes;
    
    public AccountLoggingKickedMessage() { }
    
    public AccountLoggingKickedMessage(int days, int hours, int minutes) {
        this.days = days;
        this.hours = hours;
        this.minutes = minutes;
    }
    
    @Override
    public void serialize(Buffer buf) {
        buf.writeInt(days);
        buf.writeInt(hours);
        buf.writeInt(minutes);
    }
    
    @Override
    public void deserialize(Buffer buf) {
        days = buf.readInt();
        if (days < 0)
            throw new RuntimeException("Forbidden value on days = " + days + ", it doesn't respect the following condition : days < 0");
        hours = buf.readInt();
        if (hours < 0)
            throw new RuntimeException("Forbidden value on hours = " + hours + ", it doesn't respect the following condition : hours < 0");
        minutes = buf.readInt();
        if (minutes < 0)
            throw new RuntimeException("Forbidden value on minutes = " + minutes + ", it doesn't respect the following condition : minutes < 0");
    }
    
}
