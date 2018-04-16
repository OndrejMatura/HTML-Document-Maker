package html.document.maker;

import document.HTMLDocuement;
import document.elements.DoubleTagElement;
import document.elements.Element;
import document.elements.types.*;
import java.awt.Toolkit;
import java.awt.datatransfer.*;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static String DESKTOP_PATH = "C:\\Users\\Ondra\\Desktop\\";
    
    private static void copyToClipboard(String text) {
        StringSelection stringSelection = new StringSelection(text);
        Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
        clpbrd.setContents(stringSelection, null);
    }
    
    private static void toFile(HTMLDocuement doc) throws IOException {
        File file = new File(DESKTOP_PATH + doc.getName() + ".html");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(doc.toString());
        fileWriter.close();
    }

    public static void main(String[] args) throws IOException {

        HTMLDocuement doc = new HTMLDocuement("wololo");
        doc.head().children().append(new Title(new Text("titl")));
        doc.body().children().append(new Header(2, new Text("Header")), new Paragraph(new Text("hojhojhoj na ted bude linebreak"), new Break(), new Text("ojojojo tady je hehe")));

        //System.out.println(doc);
        toFile(doc);
        
        
        //copyToClipboard(doc.toString());

//        DoubleTagElement document = new DoubleTagElement(ElementType.HTML);
//        DoubleTagElement head = new DoubleTagElement(ElementType.HEAD);
//        DoubleTagElement title = new DoubleTagElement(ElementType.TITLE, "TEST");
//        DoubleTagElement body = new DoubleTagElement(ElementType.BODY);
//        DoubleTagElement h = new DoubleTagElement(ElementType.HEADER1, "A big header");
//        DoubleTagElement p = new DoubleTagElement(ElementType.PARAGRAPH, "This is a ");
//        DoubleTagElement b = new DoubleTagElement(ElementType.BOLD, "test");
//        
//        p.addElement(b);
//        body.addElement(h);
//        body.addElement(p);
//
//        head.addElement(title);
//
//        document.addElement(head);
//        document.addElement(body);
//
//        String html = "<!DOCTYPE HTML>" + document.toString();
//        System.out.println(html);
//        try (PrintWriter writer = new PrintWriter("test.html", "UTF-8")) {
//            writer.println(html);
//            writer.close();
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (UnsupportedEncodingException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

}
