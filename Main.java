import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class Main {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        server.createContext("/status", exchange -> 
            sendJsonResponse(exchange, "{\"status\": \"healthy\", \"track\": \"backend-ai\"}"));

        server.createContext("/claim", exchange -> 
            sendJsonResponse(exchange, "{\"claim\": \"low-level concurrency and high performance backend systems\"}"));

        System.out.println("Server started on port 8080...");
        server.start();
    }

    private static void sendJsonResponse(HttpExchange exchange, String jsonResponse) throws IOException {
        exchange.getResponseHeaders().set("Content-Type", "application/json");
        exchange.sendResponseHeaders(200, jsonResponse.getBytes().length);
        
        try (OutputStream os = exchange.getResponseBody()) {
            os.write(jsonResponse.getBytes());
        }
    }
}