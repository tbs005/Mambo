

// Generated on 05/08/2013 19:37:52
package org.mambo.protocol.messages;

import java.util.*;
import org.mambo.protocol.types.*;
import org.mambo.protocol.enums.*;
import org.mambo.protocol.*;
import org.mambo.core.io.*;

public class GameRolePlayTaxCollectorFightRequestMessage extends NetworkMessage {
    public static final int MESSAGE_ID = 5954;
    
    @Override
    public int getNetworkMessageId() {
        return MESSAGE_ID;
    }
    
    public int taxCollectorId;
    
    public GameRolePlayTaxCollectorFightRequestMessage() { }
    
    public GameRolePlayTaxCollectorFightRequestMessage(int taxCollectorId) {
        this.taxCollectorId = taxCollectorId;
    }
    
    @Override
    public void serialize(Buffer buf) {
        buf.writeInt(taxCollectorId);
    }
    
    @Override
    public void deserialize(Buffer buf) {
        taxCollectorId = buf.readInt();
    }
    
}
