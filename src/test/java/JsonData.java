import com.alibaba.fastjson.JSON;
import com.example.demo.entry.DLCanvas.DLCanvas;

public class
JsonData {
    public static void main(String[] args) {

        String data = "{\"nodes\":[{\"id\":\"node10\",\"name\":\"InputLayer\",\"icon\":\"task-icon-41\"," +
                "\"category\":\"02\",\"operator\":\"InputLayer\",\"children\":[],\"nodeParam\":" +
                "{\"input_shape\":\"\",\"batch_size\":\"None\",\"batch_input_shape\":\"None\",\"dtype\"" +
                ":\"None\",\"input_tensor\":\"None\",\"sparse\":\"None\",\"name\":\"None\"},\"positionX\":362,\"positionY\":107,\"showStatus\":true,\"class_id\":null,\"outPorts\":[{\"id\":\"node10_0\"}],\"inPorts\":[{\"id\":\"node10_0\"}]},{\"id\":\"node11\",\"name\":\"Layer\",\"icon\":\"task-icon-41\",\"category\":\"04\",\"operator\":\"Layer\",\"children\":[],\"nodeParam\":{},\"positionX\":164,\"positionY\":246,\"showStatus\":true,\"class_id\":null,\"outPorts\":[{\"id\":\"node11_0\"}],\"inPorts\":[{\"id\":\"node11_0\",\"isConnected\":true}]},{\"id\":\"node12\",\"name\":\"Layer\",\"icon\":\"task-icon-41\",\"category\":\"04\",\"operator\":\"Layer\",\"children\":[],\"nodeParam\":{},\"positionX\":614,\"positionY\":343,\"showStatus\":true,\"class_id\":null,\"outPorts\":[{\"id\":\"node12_0\"}],\"inPorts\":[{\"id\":\"node12_0\",\"isConnected\":true}]}],\"paths\":[{\"dotted\":false,\"ptype\":\"Q\",\"startPort\":\"node11_0\",\"endPort\":\"node12\",\"startId\":\"node11\",\"endId\":\"node12\"},{\"dotted\":false,\"ptype\":\"Q\",\"startPort\":\"node10_0\",\"endPort\":\"node11\",\"startId\":\"node10\",\"endId\":\"node11\"},{\"dotted\":false,\"ptype\":\"Q\",\"startPort\":\"node10_0\",\"endPort\":\"node12\",\"startId\":\"node10\",\"endId\":\"node12\"}]}";

        Object parse = JSON.parse(data);
        System.out.println(parse);
        DLCanvas parse1 = (DLCanvas) parse;
        System.out.println(parse1);

    }
}
