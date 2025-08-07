package Experimental.functionalpro;

import jakarta.websocket.server.ServerEndpoint;
import jakarta.websocket.*;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

@ServerEndpoint(value="/sensor-events")
public class WebSocEmitter {
    private static final Logger LOGGER = Logger.getLogger(WebSocEmitter.class.getName());
    //make a set of connected sessions they must be thread safe
    private static final Set<Session> sessions = Collections.synchronizedSet(new HashSet<>());

    @OnOpen
    public void onOpen(Session session) {
        sessions.add(session);
        LOGGER.info("Client connected: " + session.getId());
    }

    @OnClose
    public void onClose(Session session) {
        sessions.remove(session);
        LOGGER.info("Client disconnected: " + session.getId());
    }

    @OnError
    public void onError(Session session, Throwable throwable) {
        LOGGER.severe("Websocket error on session: " + session.getId());
    }

    //broadcast
    public static void broadcast(String msg) {
        sessions.forEach(session -> {
            try {
                session.getBasicRemote().sendText(msg);
            } catch (IOException e) {
                LOGGER.severe("Error broadcasting message to session: " + session.getId() + ": " + e.getMessage());
            }
        });
    }
}
