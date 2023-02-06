import org.w3c.dom.*;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class MyXmlParser {
    public static ArrayList<Assessment> read() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        Document doc = factory.newDocumentBuilder().parse("assessments.xml");

        NodeList assessmentElement = doc.getDocumentElement().getElementsByTagName("assessment");
        ArrayList<Assessment> ordersList = new ArrayList<>();

        for (int i = 0; i < assessmentElement.getLength(); i++) {
            Node assessment = assessmentElement.item(i);
            NamedNodeMap attributes = assessment.getAttributes();
            ordersList.add(new Assessment(
                    attributes.getNamedItem("courseName").getNodeValue(),
                    attributes.getNamedItem("teacherName").getNodeValue(),
                    attributes.getNamedItem("studentName").getNodeValue(),
                    Integer.parseInt(attributes.getNamedItem("score").getNodeValue())));
        }

        return ordersList;
    }

    public static void write(ArrayList<Assessment> list) throws ParserConfigurationException, TransformerException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        Document doc = factory.newDocumentBuilder().newDocument();

        Element root = doc.createElement("root");
        doc.appendChild(root);

        for (Assessment ass : list) {
            Element item = doc.createElement("assessment");
            item.setAttribute("courseName", ass.getCourse().getName());
            item.setAttribute("teacherName", ass.getCourse().get_teacher().getName());
            item.setAttribute("studentName", ass.getStudent().getName());
            item.setAttribute("score", Integer.toString(ass.get_score()));
            root.appendChild(item);
        }

        File file = new File("assessments.xml");

        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.transform(new DOMSource(doc), new StreamResult(file));
    }
}
