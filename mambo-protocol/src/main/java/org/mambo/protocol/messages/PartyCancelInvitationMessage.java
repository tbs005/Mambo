

// Generated on 05/08/2013 19:37:48
package org.mambo.protocol.messages;

import java.util.*;
import org.mambo.protocol.types.*;
import org.mambo.protocol.enums.*;
import org.mambo.protocol.*;
import org.mambo.core.io.*;

public class PartyCancelInvitationMessage extends AbstractPartyMessage {
    public static final int MESSAGE_ID = 6254;
    
    @Override
    public int getNetworkMessageId() {
        return MESSAGE_ID;
    }
    
    public int guestId;
    
    public PartyCancelInvitationMessage() { }
    
    public PartyCancelInvitationMessage(int partyId, int guestId) {
        super(partyId);
        this.guestId = guestId;
    }
    
    @Override
    public void serialize(Buffer buf) {
        super.serialize(buf);
        buf.writeInt(guestId);
    }
    
    @Override
    public void deserialize(Buffer buf) {
        super.deserialize(buf);
        guestId = buf.readInt();
        if (guestId < 0)
            throw new RuntimeException("Forbidden value on guestId = " + guestId + ", it doesn't respect the following condition : guestId < 0");
    }
    
}
