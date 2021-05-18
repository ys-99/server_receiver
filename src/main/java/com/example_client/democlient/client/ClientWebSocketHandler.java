package com.example_client.democlient.client;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Slf4j
public class ClientWebSocketHandler extends TextWebSocketHandler {

    //private static final Logger log = LoggerFactory.getLogger(ClientWebSocketHandler.class);

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        log.info("Client connection opened");

        TextMessage message = new TextMessage("one-time message from client");
        log.info("Client sends: {}", message);
        session.sendMessage(message);
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) {
        log.info("Client connection closed: {}", status);
    }

    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) {
        log.info("Client received: {}", message);
    }

    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) {
        log.info("Client transport error: {}", exception.getMessage());
    }
}

