package xmljavaexemplo;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/**
 * Error Handler class for SAX Parser
 * Fonte: http://www.java2s.com/Code/Java/XML/UsingDOMforSyntaxChecking.htm
 * 
 */
public class MyErrorHandler implements ErrorHandler {
    
  private String errorString;
    
  @Override
  public void warning(SAXParseException e) throws SAXException {
    show("Warning", e);
    throw (e);
  }

  @Override
  public void error(SAXParseException e) throws SAXException {
    show("Error", e);
    throw (e);
  }
  
  @Override
  public void fatalError(SAXParseException e) throws SAXException {
    show("Fatal Error", e);
    throw (e);
  }

  private void show(String type, SAXParseException e) {
    System.out.println(type + ": " + e.getMessage());
    System.out.println("Line " + e.getLineNumber() + " Column "
        + e.getColumnNumber());
    System.out.println("System ID: " + e.getSystemId());
    //TODO: utilizar stringbuilder
    this.errorString = type + ": \n" + e.getMessage() + "Line \n" + e.getLineNumber() + " Column "
        + e.getColumnNumber() + "\nSystem ID: " + e.getSystemId();
  }

    public String getErrorString() {
        return errorString;
    }
  
  
}
