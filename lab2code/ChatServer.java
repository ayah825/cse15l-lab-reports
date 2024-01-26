import java.io.IOException;
import java.net.URI;
import java.util.ArrayList; 

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    ArrayList<String> messages = new ArrayList<>();
    ArrayList<String> users = new ArrayList<>();
    String output = new String();

    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            for (int i = 0; i < messages.size() - 1; i++) {
                output.concat(users.get(i) + ": " + messages.get(i) + "\n");
            }
            return output;
        } else {
            if (url.getPath().contains("/add-message")) {
                String[] parameter1 = url.getQuery().split("=");
                String[] parameter2 = url.getQuery().split("&");
                if (parameter1[0].equals("s")) {
                    messages.add(parameter1[1]);
                }
                if (parameter2[2].equals("user")) {
                    String str = parameter1[2];
                    users.add(str.substring(0, str.length() - 5));
                }
                return users.getLast() + ": " + messages.getLast();
            }
            return "404 Not Found!";
        }
    }
}

class ChatServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
