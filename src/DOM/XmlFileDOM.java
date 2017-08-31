import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.io.File;

public class XmlFileDOM {
    public static void main(String[] args) {

        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();

            Element rootElement = doc.createElement("cars");
            doc.appendChild(rootElement);

            Element passengerCar = doc.createElement("passengerCar");
            rootElement.appendChild(passengerCar);

            Attr attr = doc.createAttribute("passengerClass");
            attr.setValue("sedan");
            passengerCar.setAttributeNode(attr);

            Element carModel = doc.createElement("carMode");
            Attr attrType = doc.createAttribute("type");
            attrType.setValue("BMW");
            carModel.setAttributeNode(attrType);
            carModel.appendChild(doc.createTextNode("M5"));
            passengerCar.appendChild(carModel);

            Element carMode2 = doc.createElement("carMode");
            Attr attrType1 = doc.createAttribute("type");
            attrType1.setValue("Mercedes");
            carMode2.setAttributeNode(attrType1);
            carMode2.appendChild(doc.createTextNode("CLS-Class (C218)"));
            passengerCar.appendChild(carMode2);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("C:\\Users\\User\\Desktop\\log\\trucks.xml"));
            transformer.transform(source, result);


        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }
}
