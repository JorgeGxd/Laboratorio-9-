
package laboratorio9;

import java.io.*;
import java.util.Scanner;
import java.util.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 * @author olste
 */
public class FileHelper {
    
    
    public FileHelper(){ }
    File myfile;
    Formatter output;
    
    public void AbrirArchivo() throws FileNotFoundException, IOException{
        try{
            this.output = new Formatter(new FileWriter("pedidos.txt", true));
        }catch(SecurityException securityException){
            System.err.println("Error al abrir el archivo!");
        }
    }

    public void WriteFile(Pedido nuevo) throws FileNotFoundException, IOException{
        this.output = new Formatter(new FileWriter("pedidos.txt", true));
        this.output.format("%s %s %s %d %.2f %.2f \n", nuevo.codigo, nuevo.tipo, nuevo.tamanio, nuevo.cantidad,nuevo.precio, nuevo.total);
        this.CloseFile();
       
    }
    
    
    
    public void CloseFile(){
        if(this.output != null) this.output.close();
    }
    
}
