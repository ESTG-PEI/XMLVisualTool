/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmljavaexemplo;

/**
 *
 * @author bmo
 */
public class XMLJavaExemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        XMLManagement gestor = new XMLManagement("files/CaixaCorreio.xml");
        if(gestor.read(true)){
            System.out.println("Ficheiro válido");
        }
    }
    
}
