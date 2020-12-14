import java.net.ServerSocket

var connectedClients: MutableList<Connection> = mutableListOf()
fun main() {
    val serverSocket = ServerSocket(8080)
    println("Server running at localhost:8080...")
    while (true) {
        val clientSocket = serverSocket.accept()
        connectedClients.add(Connection(clientSocket))
    }
}

fun processClientInput(clientInput: String) {


}
