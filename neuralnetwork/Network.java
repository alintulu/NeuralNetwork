/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neuralnetwork;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alintulu
 * 
 * This class contains all the main methods of the network. The methods here start
 * returning the output, back propagating and updating weights. It also contains the
 * method for training and testing the network.
 * 
 */
public class Network {

    private boolean debug = true;

    // list of input nodes, can be have many you want. 1,2,3...
    public List<Node> inputNodes;
    // this network always only has one output node
    public Node outputNode;

    public Network() 
    {
        this.inputNodes = null;
        this.outputNode = null;
    }

    public void setInputNodes(List<Node> inputNodes) 
    {
        this.inputNodes = inputNodes;
    }

    public void setOutputNode(Node outputNode) 
    {
        this.outputNode = outputNode;
    }

    // get output of the network
    public double getOutput(double[] inputVal) 
    {
        // clear the former output before you get a new one
        this.outputNode.clearOutput();

        double output = this.outputNode.getOutput(inputVal);
        return output;

    }

    /* backpropagate the network to "hopefully" decrease the error of every node, starting from input nodes
    trueVal is the correct output value of the input
    */
    public void backPropagate(double trueVal, boolean printError) 
    {
        for (Node node : inputNodes)
        {
            node.getError(trueVal, printError);
        }

    }

    // update weights of nodes, starting from input nodes
    public void updateWeights(double learningRate) 
    {

        for (Node node : inputNodes) 
        {
            node.updateWeights(learningRate);
        }
    }

    // main function to train the network, trainData is list containing the training data
    public void trainNetwork(List<trainingData> trainData, double learningRate, int numIterations, boolean printError) 
    {
        for (int i = 0; i < numIterations; i++) 
        {
            /* inputData is the input the network will learn from
            trueVal is the correct output value of the inputData, 
            the network will use this to caluclate error and with that update weights*/
            for (trainingData data : trainData) 
            {

                double[] inputData = data.getInputVal();
                double trueVal = data.getTrueVal();

                getOutput(inputData);
                backPropagate(trueVal, printError);
                updateWeights(learningRate);
            }

        }
    }

    // main function to test the network
    public void testNetwork(List<trainingData> trainData) 
    {
         /* inputData is the input the network will learn from
            trueVal is the correct output value of the inputData, 
            the network will use this to caluclate error and with that update weights*/
        for (trainingData data : trainData) {

            double[] inputData = data.getInputVal();
            double trueVal = data.getTrueVal();
            double output = getOutput(inputData);

        }
    }
}
