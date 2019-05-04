package neuralnetwork;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alintulu
 */
public class NeuralNetwork {

    /* builds the network
    - numInputs is numper of input nodes
    - numHiddenLayers is number of hidden layers
    - numInEachLayer is number of internal nodes per layer
    */
    public static Network makeNetwork(int numInputs, int numHiddenLayers, int numInEachLayer) {

        // create neural network
        Network network = new Network();
        List<Node> inputNodes = new ArrayList<>();
        // create the one output node
        Node outputNode = new InternalOrOutputNode("outputNode");

        // create list of input nodes
        for (int i = 0; i < numInputs; i++) {
            inputNodes.add(new InputNode(i, "inputNode" + Integer.toString(i)));
        }

        // attach nodes to network
        network.setOutputNode(outputNode);
        network.setInputNodes(inputNodes);

        // create interlayer nodes
        List<List<Node>> hiddenLayers = new ArrayList<>();
        List<Node> layer = null;
        
        // first for loop creates lists of layers
        for (int i = 0; i < numHiddenLayers; i++) 
        {
            layer = new ArrayList<>();
            // second for loop creates list of internal nodes in one layer
            for (int j = 0; j < numInEachLayer; j++) 
            {
                Node internalNode = new InternalOrOutputNode("internalNode" + Integer.toString(i) + Integer.toString(j));
                layer.add(internalNode);
            }
            hiddenLayers.add(layer);
        }

        // create edges between input nodes and first layer nodes
        for (Node inputNode : inputNodes) 
        {
            for (Node firstLayerNode : hiddenLayers.get(0)) 
            {
                Edge edge = new Edge(inputNode, firstLayerNode);
            }

        }

        // create edges between internal nodes
        // loop over all hidden layers
        for (int k = 0; k < numHiddenLayers - 1; k++) 
        {
            // layer k
            List<Node> layerK = hiddenLayers.get(k);
            // layer (k + 1)
            List<Node> layerKK = hiddenLayers.get(k + 1);
            // loop over nodes in layer k
            for (Node layerKNode : layerK) 
            {
                // loop over nodes in layer (k + 1)
                for (Node layerKKNode : layerKK) 
                {
                    // create edge between node in layer k and all nodes in layer (k + 1)
                    Edge edge = new Edge(layerKNode, layerKKNode);
                }
            }

        }

        // create edge between layers in last layer and output node
        for (Node node : hiddenLayers.get(numHiddenLayers - 1)) 
        {
            Edge edge = new Edge(node, outputNode);
        }

        return network;
    }

    // sinus function for creating training data with output values between 0 and 1
    public static Double sineFunc(double x) 
    {
        return 0.5 * (1.0 + Math.sin(x));
    }

    // method for creating training data, numvalues is size of input data
    public static List<trainingData> sineTest(int numValues) 
    {
        List<trainingData> sineData = new ArrayList<>();

        /* first parameter in trainingData is an array since there can be several input values 
        per iteration, in this method we have a 2D function hence one input value, as an example if we 
        had a 3D function, parameter x would have values at index 0 and parameter y values at index 1.
        the second parameter is just a double value since there is always just one output value.
        */
        for (int i = 0; i < numValues; i++) 
        {
            double input = Math.random() * Math.PI * 4;
            trainingData data = new trainingData(new double[]{input}, sineFunc(input));
            sineData.add(data);
        }

        return sineData;
    }

    // main function
    public static void main(String[] args) 
    {

        /* create network
        parameters of makeNetwork() in the order they appear: 
        - number of input nodes
        - number of hidden layers 
        - number of internal nodes per hidden layer */
        Network network = makeNetwork(1, 3, 20);
        
        network.trainNetwork(sineTest(100), 0.001, 10000, false);
        network.testNetwork(sineTest(100));

    }

}
