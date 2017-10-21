import java.io.*;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;


public class StAX {

    void CreateXMLStAX() {
        try {
            File file = new File("C:\\Users\\User\\IdeaProjects\\StAX\\src\\StAX.xml");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));

            StringWriter stringWriter = new StringWriter();
            XMLOutputFactory xMLOutputFactory = XMLOutputFactory.newInstance();
            XMLStreamWriter xMLStreamWriter = xMLOutputFactory.createXMLStreamWriter(stringWriter);

            xMLStreamWriter.writeStartDocument();
            xMLStreamWriter.writeStartElement("cars");

            xMLStreamWriter.writeStartElement("carMode");
            xMLStreamWriter.writeAttribute("type", "Sedan");
            xMLStreamWriter.writeCharacters("BMW");
            xMLStreamWriter.writeEndElement();

            xMLStreamWriter.writeStartElement("carMode");
            xMLStreamWriter.writeAttribute("type", "Coupe");
            xMLStreamWriter.writeCharacters("Mercedes");
            xMLStreamWriter.writeEndElement();

            xMLStreamWriter.writeEndElement();
            xMLStreamWriter.writeEndDocument();

            xMLStreamWriter.flush();
            xMLStreamWriter.close();

            String xmlString = stringWriter.getBuffer().toString();

            writer.write(xmlString);
            writer.close();

            stringWriter.close();

            System.out.println(xmlString);

        } catch (XMLStreamException e) {
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}