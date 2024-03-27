package com.websocket.websocket.chat;

import lombok.*;
import org.apache.logging.log4j.message.Message;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMessage {
    private String content;
    private String sender;
    private MessageType type;

}
