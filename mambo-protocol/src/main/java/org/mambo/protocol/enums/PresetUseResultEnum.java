

// Generated on 05/08/2013 19:04:45
package org.mambo.protocol.enums;

public enum PresetUseResultEnum {
    PRESET_USE_OK(1),
    PRESET_USE_OK_PARTIAL(2),
    PRESET_USE_ERR_UNKNOWN(3),
    PRESET_USE_ERR_CRITERION(4),
    PRESET_USE_ERR_BAD_PRESET_ID(5);
    
    private int value;
    PresetUseResultEnum(int value) { this.value = value; }
    public int value() { return value; }
    
    public static PresetUseResultEnum valueOf(int value) {
    	for (PresetUseResultEnum a : values()) {
    		if (a.value == value)
    			return a;
    	}
    	return null;
    }
    
}
