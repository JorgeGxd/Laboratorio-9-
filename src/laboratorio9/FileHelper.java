
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
    Scanner myScan;
    Formatter output;
    
    public void OpenFile() {
        try {
            this.output = new Formatter("pedidos.txt");
            JOptionPane.showMessageDialog(null, "Arcihvo Abierto");
        } catch (FileNotFoundException ex) {
            System.err.println(ex);
        }
        
    }

    public void WriteFile(Pedido nuevo){
        this.OpenFile();
        this.output.format("%s %s %s %d %.2f %.2f%n", nuevo.codigo, nuevo.tipo, nuevo.tamanio, nuevo.cantidad,nuevo.precio, nuevo.total);
        this.CloseFile();
    }
    
    
    
    public void CloseFile(){
        this.output.close();
    }
    
}
