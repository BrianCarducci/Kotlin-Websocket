import java.io.BufferedReader
import java.io.PrintWriter
import java.net.Socket

class Connection(var socket: Socket, var serverOutput: PrintWriter, var clientInput: BufferedReader) {

}