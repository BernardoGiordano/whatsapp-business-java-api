package com.whatsapp.api.domain.messages.type;

/**
 * <p>The type of interactive message you want to send</p>
 *
 * <p>Supported values:</p>
 * <ul>
 *     <li><b>button: </b>Use it for Reply Buttons</li>
 *     <li><b>list: </b>Use it for List Messages</li>
 *     <li><b>product: </b>Use for Single Product Messages</li>
 *     <li><b>product_list: </b>Use for Multi-Product Messages</li>
 * </ul>
 */
public enum InteractiveMessageType {
    BUTTON("button"), //
    LIST("list"), //
    PRODUCT("product"), //
    PRODUCT_LIST("product_list");

    private final String value;

    InteractiveMessageType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
